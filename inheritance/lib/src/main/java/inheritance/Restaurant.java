package inheritance;


import java.util.ArrayList;

public class Restaurant{
    public String name;
    public int starRating;
    public int costRating;
    private final String dollar = "$";
    private final String star = "⭐️";
    public ArrayList<Review> reviews = new ArrayList<>();

    public Restaurant(String name, int costRating) {
        this.name = name;
        this.starRating = 0;
        this.costRating = costRating;
    }

    @Override
    public String toString(){
        String reviewString = name + " " + Review.ratingString(starRating, star) + Review.ratingString(costRating, dollar);
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
}
