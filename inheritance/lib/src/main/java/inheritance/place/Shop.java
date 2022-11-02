package inheritance.place;

public class Shop extends Place{
    String desc;
    public Shop(String name, String desc, int costRating) {
        super(name, costRating);
        this.desc = desc;
    }

    @Override
    public String toString(){
        String reviewString = name + " --- " + desc + "\n" + Place.ratingString(starRating, star) + " " + Place.ratingString(costRating, dollar);
        return reviewString;
    }
}
