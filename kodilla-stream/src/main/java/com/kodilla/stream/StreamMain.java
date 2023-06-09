package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.beautifier.PoemDecorator;
import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.person.People;
import com.kodilla.stream.reference.FunctionalCalculator;
import com.kodilla.stream.world.Continent;
import com.kodilla.stream.world.Country;
import com.kodilla.stream.world.World;


import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.stream.Collectors;

public class StreamMain {

    public static void main(String[] args) {

        Forum forum = new Forum();
        Map<Integer,ForumUser> theResultMapOfForumUser = forum.getUserList().stream()
                .filter(forumUser -> forumUser.getSex()=='M')
                .filter(forumUser ->LocalDate.now().getYear() - forumUser.getDateOfBirth().getYear()>=20 )
                .filter(forumUser -> forumUser.getNumberOfPost()>0)
                .collect(Collectors.toMap(ForumUser::getId,forumUser -> forumUser));

        System.out.println("# elements: " + theResultMapOfForumUser.size());
        theResultMapOfForumUser.entrySet().stream()
                .map(entry ->entry.getKey() + ":" + entry.getValue())
                .forEach(System.out::println);

        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("Kamil",text -> text.toUpperCase());
        poemBeautifier.beautify("MAGDA",text -> text.toLowerCase());
        poemBeautifier.beautify("Kasia",text -> text + "ABC");
        poemBeautifier.beautify("Kamil",text -> "ABC" + text);
        poemBeautifier.beautify(" Marcelina ",text -> text.trim());
        poemBeautifier.beautify("Michał",text -> text.substring(1,3));
        poemBeautifier.beautify("Kamila",text -> text.replace("a","A"));





    }
}