package org.example;

import java.util.ArrayList;

public class AllModules {
    public ArrayList<Game> games;
    public ArrayList<Movie> movies;
    public ArrayList<Book> books;
    public ArrayList<Customer> customers;
    public ArrayList<Game> getGames()
    {
        return games;
    }
    public void setGames(ArrayList<Game> games) {
        this.games = games;
    }

    public ArrayList<Movie> getMovies() {
        return movies;
    }

    public void setMovies(ArrayList<Movie> movies) {
        this.movies = movies;
    }
    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(ArrayList<Customer> customers) {
        this.customers = customers;
    }

}
