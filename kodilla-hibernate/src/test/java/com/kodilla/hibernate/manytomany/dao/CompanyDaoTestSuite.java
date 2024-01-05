package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CompanyDaoTestSuite {

    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private EmployeeDao employeeDao;


    @Test
    public void shouldFindCompaniesByFirstThreeChars() {

        Company company1 = new Company("ABC Corporation");
        Company company2 = new Company("XYZ Limited");
        Company company3 = new Company("ABE Industries");

        companyDao.saveAll(List.of(company1, company2, company3));

        List<Company> resultCompanies = companyDao.findByFirstThreeChars("ABC");

        assertEquals(2, resultCompanies.size());
        assertTrue(resultCompanies.contains(company1));
        assertTrue(resultCompanies.contains(company3));
    }

    @Test
    public void shouldFindEmployeesByLastName() {

        Employee employee1 = new Employee("John", "Doe");
        Employee employee2 = new Employee("Jane", "Doe");
        Employee employee3 = new Employee("Alice", "Smith");

        employeeDao.saveAll(List.of(employee1, employee2, employee3));

        List<Employee> resultEmployees = employeeDao.findByLastname("Doe");

        assertEquals(2, resultEmployees.size());
        assertTrue(resultEmployees.contains(employee1));
        assertTrue(resultEmployees.contains(employee2));
    }

}