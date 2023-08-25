package com.kodilla.good.patterns.challenges;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        MovieStore movieStore = new MovieStore();

        Map<String, List<String>> movies = movieStore.getMovies();

        String allTitles = movies.values().stream()
                .flatMap(List::stream)
                .collect(Collectors.joining("!", "", ""));

        System.out.println(allTitles);
    }
}
