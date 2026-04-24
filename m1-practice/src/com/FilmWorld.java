package com;

import java.util.*;

class Film2 {

    String title;
    String director;

    Film2(String title, String director) {
        this.title = title;
        this.director = director;
    }
}

class FilmIndustry {

    List<Film2> films = new ArrayList<>();

    void addFilm(Film2 film) {
        films.add(film);
    }

    void getFilms() {

        for(Film2 f : films){
            System.out.println(f.title + " - " + f.director);
        }
    }

    void searchFilm(String query){

        for(Film2 f : films){

            if(f.title.contains(query) || f.director.contains(query))
                System.out.println(f.title);
        }
    }

    void deleteFilm(String title){

        films.removeIf(f -> f.title.equalsIgnoreCase(title));
    }
}

public class FilmWorld {

    public static void main(String[] args) {

        FilmIndustry fi = new FilmIndustry();

        fi.addFilm(new Film2("Inception","Nolan"));
        fi.addFilm(new Film2("Avatar","Cameron"));
        fi.addFilm(new Film2("Interstellar","Nolan"));

        System.out.println("All Films:");
        fi.getFilms();

        System.out.println("\nSearch Nolan:");
        fi.searchFilm("Nolan");

        System.out.println("\nAfter deleting Avatar:");
        fi.deleteFilm("Avatar");
        fi.getFilms();
    }
}