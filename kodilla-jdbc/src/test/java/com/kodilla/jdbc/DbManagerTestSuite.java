package com.kodilla.jdbc;

import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DbManagerTestSuite {

    @Test
    void testConnect() throws SQLException {
        //Given
        //When
        DbManager dbManager = DbManager.getInstance();
        //Then
        assertNotNull(dbManager.getConnection());
    }

    @Test
    void testSelectUsers() throws SQLException {
        //Given
        DbManager dbManager = DbManager.getInstance();

        //When
        String sqlQuery = "SELECT * FROM USERS";
        Statement statement = dbManager.getConnection().createStatement();
        ResultSet rs = statement.executeQuery(sqlQuery);

        //Then
        int counter = 0;
        while (rs.next()) {
            System.out.println(rs.getInt("ID") + ", " +
                    rs.getString("FIRSTNAME") + ", " +
                    rs.getString("LASTNAME"));
            counter++;
        }
        rs.close();
        statement.close();
        assertEquals(5, counter);
    }

    @Test
    public void testSelectUsersAndPosts() throws Exception {

        //Given
        DbManager dbManager = DbManager.getInstance();

        String sql = """
                SELECT U.FIRSTNAME, U.LASTNAME
                FROM USERS U 
                JOIN POSTS P ON U.ID = P.USER_ID
                GROUP BY U.FIRSTNAME, U.LASTNAME 
                HAVING COUNT(P.USER_ID) >= 2
                """;

        List<String> results = new ArrayList<>();

        try (Connection conn = dbManager.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {


            while (rs.next()) {
                String firstName = rs.getString("FIRSTNAME");
                String lastName = rs.getString("LASTNAME");
                results.add(firstName + " " + lastName);
                System.out.println(firstName + " " + lastName);
            }
        }


        int expectedNumberOfUsers = 2;
        assertEquals(expectedNumberOfUsers, results.size());
    }
}
