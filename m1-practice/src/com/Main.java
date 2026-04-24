package com;

import java.util.*;

/* ----------- Film Interface ----------- */
interface IFilm {

    void setTitle(String title);

    String getTitle();

    void setDirector(String director);

    String getDirector();

    void setYear(int year);

    int getYear();
}

/* ----------- Film Class ----------- */
class Film implements IFilm {

    private String title;
    private String director;
    private int year;

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getDirector() {
        return director;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }
}

/* ----------- FilmLibrary Interface ----------- */
interface IFilmLibrary {

    void addFilm(IFilm film);

    void removeFilm(String title);

    List<IFilm> searchFilms(String query);

    List<IFilm> getFilms();

    int getTotalFilmCount();
}

/* ----------- FilmLibrary Class ----------- */
class FilmLibrary implements IFilmLibrary {

    private List<IFilm> films;

    public FilmLibrary() {
        films = new ArrayList<>();
    }

    public void addFilm(IFilm film) {
        films.add(film);
    }

    public void removeFilm(String title) {

        Iterator<IFilm> it = films.iterator();

        while (it.hasNext()) {
            IFilm film = it.next();

            if (film.getTitle().equalsIgnoreCase(title)) {
                it.remove();
            }
        }
    }

    public List<IFilm> searchFilms(String query) {

        List<IFilm> result = new ArrayList<>();

        for (IFilm film : films) {

            if (film.getTitle().toLowerCase().contains(query.toLowerCase())
                    || film.getDirector().toLowerCase().contains(query.toLowerCase())) {

                result.add(film);
            }
        }

        return result;
    }

    public List<IFilm> getFilms() {
        return films;
    }

    public int getTotalFilmCount() {
        return films.size();
    }
}

/* ----------- Main Class ----------- */
public class Main {

    public static void main(String[] args) {

        FilmLibrary library = new FilmLibrary();

        Film f1 = new Film();
        f1.setTitle("Inception");
        f1.setDirector("Christopher Nolan");
        f1.setYear(2010);

        Film f2 = new Film();
        f2.setTitle("Interstellar");
        f2.setDirector("Christopher Nolan");
        f2.setYear(2014);

        Film f3 = new Film();
        f3.setTitle("Avatar");
        f3.setDirector("James Cameron");
        f3.setYear(2009);

        library.addFilm(f1);
        library.addFilm(f2);
        library.addFilm(f3);

        System.out.println("Total Films: " + library.getTotalFilmCount());

        System.out.println("\nAll Films:");
        for (IFilm film : library.getFilms()) {
            System.out.println(film.getTitle() + " - " + film.getDirector() + " (" + film.getYear() + ")");
        }

        System.out.println("\nSearch Results (Nolan):");
        List<IFilm> results = library.searchFilms("Nolan");

        for (IFilm film : results) {
            System.out.println(film.getTitle());
        }

        library.removeFilm("Avatar");

        System.out.println("\nAfter removing Avatar:");
        System.out.println("Total Films: " + library.getTotalFilmCount());
    }
}
