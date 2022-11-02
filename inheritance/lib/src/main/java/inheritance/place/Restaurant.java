package inheritance.place;


import inheritance.Review;

import java.util.ArrayList;

public class Restaurant extends Place{

    public Restaurant(String name, int costRating) {
        super(name, costRating);
    }

    @Override
    public String toString(){
        String reviewString = name + " " + Place.ratingString(starRating, star) + Place.ratingString(costRating, dollar);
        return reviewString;
    }
}
