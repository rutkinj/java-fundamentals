/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package inheritance;

import inheritance.place.Place;
import inheritance.place.Restaurant;
import inheritance.place.Theatre;

public class Review {
    public String name;
    public String body;
    public int rating;
    public Place subject;

    public String movie;
    private final String star = "⭐️";

    public Review(String name, String body, int rating, Place subject){
        this.name = name;
        this.body = body;
        this.rating = rating;
        this.subject = subject;
        subject.addReview(this);
    }

    public Review(String name, String body, int rating, Theatre subject, String movie){
        this.name = name;
        this.body = body;
        this.rating = rating;
        this.subject = subject;
        this.movie = movie;
        subject.addReview(this);
    }

    @Override
    public String toString(){
        String reviewString;
        if (movie != null){
            reviewString = "Review of " + subject.name + " Movie seen: " + movie + " " + Place.ratingString(rating, star) + " " + body + " -" + name;
        } else {
            reviewString = "Review of " + subject.name + " " + Place.ratingString(rating, star) + " " + body + " -" + name;
        }
        return reviewString;
    }
}
