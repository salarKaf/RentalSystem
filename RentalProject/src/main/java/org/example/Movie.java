
package org.example;
public class Movie extends Item {
    private String director;
    private String cast;
    public Movie(String title, String genre, int id,String director, String cast, RentalStore rentalStore) {
        super(title,genre,id, rentalStore);
        this.director = director;
        this.cast = cast;
    }
    public String getDirector() {
        return director;
    }

    public String getCast() {
        return cast;
    }

    public boolean isAvailable() {

        return available;
    }

    public void setAvailable(boolean available) {

        this.available = available;
    }
    public Double rentalFee()
    {
        return 5.5;
    }



}


