package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Forum {
    private final List<ForumUser> userList = new ArrayList<>();

    public Forum(){
        userList.add(new ForumUser(1,"Kamil",'M', LocalDate.of(1993,12,14),4));
        userList.add(new ForumUser(2,"Marcel",'M', LocalDate.of(1997,2,4),0));
        userList.add(new ForumUser(3,"Katarzyna",'F', LocalDate.of(2012,1,20),2));
        userList.add(new ForumUser(4,"Magdalena",'F', LocalDate.of(1992,11,30),1));
        userList.add(new ForumUser(5,"Krzysztof",'M', LocalDate.of(1989,2,28),7));
        userList.add(new ForumUser(6,"Marcelina",'F', LocalDate.of(2016,5,3),11));
        userList.add(new ForumUser(7,"Agata",'F', LocalDate.of(1999,7,11),0));
        userList.add(new ForumUser(8,"Michał",'M', LocalDate.of(2018,8,22),0));
        userList.add(new ForumUser(9,"Antonina",'F', LocalDate.of(1995,4,4),1));
        userList.add(new ForumUser(10,"Mariusz",'M', LocalDate.of(1972,8,20),0));

    }
    public List<ForumUser> getUserList(){
        return new ArrayList<>(userList);
    }
}
