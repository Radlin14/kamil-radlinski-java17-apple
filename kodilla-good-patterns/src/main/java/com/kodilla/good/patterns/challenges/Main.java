package com.kodilla.good.patterns.challenges;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        MovieStore movieStore = new MovieStore();

       String movieList = movieStore.getMovies().values().stream()
                 .map(movie -> movie.get(1))
                 .collect(Collectors.joining(" ! "));
        System.out.println(movieList);





    }
}
