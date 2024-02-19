import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner in = new Scanner(System.in);
        int die1, die2, crapsRoll;
        int point = 0;
        boolean onGoing = false;
        boolean done = false;
        String userResponse;

        while (!onGoing){
            die1 = rand.nextInt(6) + 1;
            die2 = rand.nextInt(6) + 1;
            crapsRoll = die1 + die2;
            System.out.println("Dice 1: " + die1 + " + Dice 2: " + die2 + ", The sum being " + crapsRoll);

            if (crapsRoll == 2 | crapsRoll == 3 | crapsRoll == 12) {
                System.out.println("Craps! You Lose.");
                System.out.println("Do you want to play again? [Y/N]: ");
                userResponse = in.nextLine();
                if (userResponse.equalsIgnoreCase("N")) {
                    onGoing = true;
                }
            } else if (crapsRoll == 7 | crapsRoll == 11) {
                System.out.println("Natural! You win.");
                System.out.println("Do you want to play again? [Y/N]: ");
                userResponse = in.nextLine();
                if (userResponse.equalsIgnoreCase("N")) {
                    onGoing = true;
                }
            } else {
                point += crapsRoll;
                System.out.println("The point is now: " + point);
                die1 = rand.nextInt(6) + 1;
                die2 = rand.nextInt(6) + 1;
                crapsRoll = die1 + die2;
                System.out.println("Dice 1: " + die1 + " + Dice 2: " + die2 + ", The sum being " + crapsRoll);

                while (!done){
                    if (crapsRoll == point){
                        System.out.println("Made point and Won");
                        System.out.println("Do you want to play again? [Y/N]: ");
                        userResponse = in.nextLine();
                        if (userResponse.equalsIgnoreCase("N")) {
                            onGoing = true;
                        }else if (userResponse.equalsIgnoreCase("Y")){
                            done = true;
                        }
                    } else if (crapsRoll == 7) {
                        System.out.println("Got seven and Lost");
                        System.out.println("Do you want to play again? [Y/N]: ");
                        userResponse = in.nextLine();
                        if (userResponse.equalsIgnoreCase("N")) {
                            onGoing = true;
                        }else if (userResponse.equalsIgnoreCase("Y")){
                            done = true;
                        }
                    }else {
                        die1 = rand.nextInt(6) + 1;
                        die2 = rand.nextInt(6) + 1;
                        crapsRoll = die1 + die2;
                        System.out.println("Dice 1: " + die1 + " + Dice 2: " + die2 + ", The sum being " + crapsRoll);
                    }
                }
            }
        }
    }
}
