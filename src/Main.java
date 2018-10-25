import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Guess player = new Guess();

        boolean found = false;
        boolean answered = false;
        String answer = "";
        int count = 0;

        Scanner read = new Scanner(System.in);
        Scanner read2 = new Scanner(System.in);

        System.out.println("Hi! Welcome to the name game. I will give you a list of names to choose from" +
                " and you will choose the one that I \nwill have to guess (1). \nOr, we can do the opposite" +
                " by having me pick a name and you will have to guess (2).");

        String ready = read.next();
        if (ready.equals("1")) {
            System.out.println("Alright! I will give you a list of names to choose from. When I start guessing," +
                    " I need you to tell me if my\nguess is correct, or if not, tell me if your name is" +
                    " closer to a or z from my guess.\nType anything to get started.");
            answer = read.next();
            if (!answer.equals("")) {
                player.printNames();
            }
            while(!found) {
                String guess = player.guessName(answer);
                if (guess.equals("true")) {
                    found = true;
                    System.out.println("Awesome! That only took me " + count + " tries.");
                    break;
                }
                else {
                    System.out.println(guess);
                    count++;
                }
                answer = read.next();
            }
        }

        else if (ready.equals("2")) {
            System.out.println("Type anything to get started.");
            answer = read.next();
            if (!answer.equals("")) {
                player.printNames();
            }
            System.out.println("That's the list. I've already picked out a name. Start by telling me which one" +
                    " you think it is, and I will tell\nyou if it is correct. If not, I will tell you if" +
                    " it is closer to a or to z.");
            System.out.println("Please refer to the name by its number. Take a guess.");
            while (!found) {
                int guess = read2.nextInt();
                if (player.checkName(guess).equals("true")) {
                    System.out.println("You got it! That only took you " + count + " tries.");
                    break;
                }
                else {
                    System.out.println(player.checkName(guess));
                    count++;
                }
            }
        }

    }
}
