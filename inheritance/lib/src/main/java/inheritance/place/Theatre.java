package inheritance.place;

import java.util.ArrayList;

public class Theatre extends Place{
    ArrayList<String> movies = new ArrayList<>();

    public Theatre(String name, int costRating){
        super(name, costRating);
    }

    public void addMovie(String title){
        if(movies.contains(title)){
            throw new IllegalArgumentException("Movie not found in movies list.");
        } else {
            movies.add(title);
        }
    }

    public void deleteMovie(String title){
        if(movies.contains(title)){
            movies.remove(title);
        } else {
            throw new IllegalArgumentException("Movie not found in movies list.");
        }
    }

    @Override
    public String toString(){
        String reviewString = name + " " + Place.ratingString(starRating, star) + Place.ratingString(costRating, dollar);
        if (movies.size() != 0){
            reviewString += "\nNow showing:";
            for(String movie: movies){
                reviewString += "\n" + movie;
            }
        }
        return reviewString;
    }

}
