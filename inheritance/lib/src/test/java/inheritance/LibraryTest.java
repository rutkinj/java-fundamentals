/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package inheritance;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {
    @Test void reviewExists() {
        String name = "Joe";
        String body = "This place mostly rules.";
        int rating = 4;
        Restaurant joes = new Restaurant("Joe's", 2);
        Review sot = new Review(name, body, rating, joes);
        assertEquals("Joe", sot.name);
    }

    @Test void reviewToString() {
        String name = "Joe";
        String body = "This place mostly rules.";
        int rating = 4;
        Restaurant joes = new Restaurant("Joe's", 2);
        Review sot = new Review(name, body, rating, joes);
        assertEquals("Review of Joe's ⭐️⭐️⭐️⭐️ This place mostly rules. -Joe", sot.toString());
    }

    @Test void restaurantExists() {
        String name = "Joe's";
        int rating = 2;
        Restaurant sot = new Restaurant(name, rating);
        assertEquals("Joe's", sot.name);
    }

    @Test void restaurantToString() {
        String name = "Joe's";
        int rating = 2;
        Restaurant sot = new Restaurant(name, rating);
        assertEquals("Joe's $$", sot.toString());
    }

    @Test void reviewAdding(){
        Restaurant sot = new Restaurant("Jude's", 2);
        Review newRev = new Review("Joe", "It gud", 5, sot);
        assertEquals( newRev.toString(), sot.reviews.get(0).toString());
    }

    @Test void checkStars(){
        Restaurant sot = new Restaurant("Jude's", 2);
        Review newRev = new Review("Joe", "It gud", 5, sot);
        Review newRev2 = new Review("Moe", "It bad", 1, sot);
        assertEquals(3, sot.starRating);
        assertEquals("Jude's ⭐️⭐️⭐️$$", sot.toString());
    }
}
