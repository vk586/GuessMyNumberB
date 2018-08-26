import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int guess = 0;
        int lnum = 0;
        int hnum = 100;
        boolean found = false;
        boolean answered = false;

        Scanner reader = new Scanner(System.in);
        Scanner read = new Scanner(System.in);

        String answer = "";

        do {
            guess = (hnum + lnum + 1) / 2;
            System.out.println("Is your number " + guess + "?");
            answer = read.nextLine();

            if (answer.equals("low")) {  //the number is low
                lnum = guess + 1;

            } else if (answer.equals("high")) { // the number is high
                hnum = guess - 1;
            }
        } while (!answer.equals("yes"));
    }
}
