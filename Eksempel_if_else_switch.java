import java.util.Random;

public class Eksempel_if_else_switch {

    public static void main(String[] args) {
        time();
        mood();
    }

    public static void time() {
        Random rand = new Random();

        int time = rand.nextInt(24);

        if (time < 10) {
            System.out.println("The time is " + time);
            System.out.println("So good morning to you");
        } else if (time < 20) {
            System.out.println("The time is " + time);
            System.out.println("So good day to you");
        } else {
            System.out.println("The time is " + time);
            System.out.println("So good evening to you");
        }

    }

    public static void mood() {
        Random rand = new Random();

        int number = rand.nextInt(5);
        String mood = "";
        switch (number) {
            case 1: mood = "bad"; break;
            case 2: mood = "okay"; break;
            case 3: mood = "fine"; break;
            case 4: mood = "good"; break;
            case 5: mood = "excellent"; break;
        }
        System.out.println(" ");
        System.out.println("The number is " + number);
        System.out.println("So the mood today is " + mood);
    }
}
