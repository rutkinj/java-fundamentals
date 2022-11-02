package inheritance.place;


import inheritance.Review;
import inheritance.Reviewable;

import java.util.ArrayList;

public abstract class Place implements Reviewable {
    public String name;
    public int starRating;
    public int costRating;
    protected final String dollar = "$";
    protected final String star = "⭐️";
    public ArrayList<Review> reviews = new ArrayList<>();

    public Place(String name, int costRating) {
        this.name = name;
        this.starRating = 0;
        this.costRating = costRating;
    }

    @Override
    public String toString(){
        String reviewString = name + " " + ratingString(starRating, star) + ratingString(costRating, dollar);
        return reviewString;
    }

    public void addReview(Review revToAdd){
        reviews.add(revToAdd);
        starMath();
    }

    private void starMath(){
        int total = 0;
        for(Review r: reviews){
            total += r.rating;
        }
        starRating = total/reviews.size();
    }

    public static String ratingString(int rating, String character){
        String retStr = "";
        for(int i = 0; i < rating; i++){
            retStr += character;
        }
        return retStr;
    }
}
