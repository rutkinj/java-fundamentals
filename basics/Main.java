import java.util.Random;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Main{
    public static void main(String[] args){
        System.out.println("Hello, World!");
        System.out.println(pluralize("bingbong",0));
        int dogCount = 1;
        System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");

        int catCount = 2;
        System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");

        int turtleCount = 0;
        System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");
        System.out.println(flipNHeads(2));

        clock();
    }

    public static String pluralize(String str, int amount){
        if(amount == 1){
            return str;
        }
        return (str + "s");
    }

    public static String flipNHeads(int goal){
        System.out.println("Flipping until " + goal + " in a row!");
        Random randy = new Random(); // is it better to do it this way or just math.random? this seems worse
        int total = 0;
        int tally = 0;
        while(tally < goal){
            if (randy.nextFloat() < 0.5f){
                System.out.println("Tails");
                tally = 0;
            } else {
                System.out.println("Heads");
                tally++;
            }
            total++;
        }
        return ("It took " + total + " flips to get " + goal + " heads in a row.");
    }

    public static void clock(){
        String time = "";
        float cycles = 0f;
        while(true){
            LocalDateTime now = LocalDateTime.now();
            String currentTime = now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
            if(!time.equals(currentTime)){
                time = currentTime;
                System.out.println(time + " " + (cycles/1_000_000) +" MHz");
                cycles = 0f;
            } else {
                cycles++;
            }
        }
    }
}