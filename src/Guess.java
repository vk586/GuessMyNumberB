import java.util.Arrays;

public class Guess {

    private int guess = 25;
    private static int hgue = 50;
    private static int lgue = 0;
    private int chosenNum = (int)(Math.random() * 50);

    public static String [] names = {"John", "Nikki", "Val", "Sarah", "Thomas", "Lyn", "Toby", "Samantha",
            "Winston", "Susan", "Barry", "TJ", "Larry", "Ricky", "Steve", "Humphrey", "Gregory", "Bill", "Donald",
            "Arnold", "Benedict", "Petunia", "Patricia", "Patrick", "Bob", "Mark", "Krystal", "Samara", "Denice",
            "Carl", "Kathy", "Johanna", "George", "Fregley", "Jack", "Michael", "Sherlock", "Simba", "Megan",
            "Adam", "Amber", "Meechee", "Ziggy", "Keelyn", "Jillian", "Anya", "Heather", "Kyouma", "Eddy",
            "Douglas"};

    public void printNames() {
        Arrays.sort(names);
        for (int i = 0; i < names.length; i++ ) {
            System.out.println(i + ": " + names[i]);
        }
    }

    public String guessName(String answer) {
        String ask;
        if (answer.equals("a")) {
            hgue = guess + 1;

        } else if (answer.equals("z")) {
            lgue = guess - 1;
        }

        guess = (hgue + lgue + 1) / 2;
        ask = "Is your person " + names[guess] + "? If not, is your name closer to a or to z?";
        if (answer.equals("yes")) {
            ask = "true";
        }
        return ask;
    }

    public String checkName(int answer) {
        String confirm = "";
        if (answer > chosenNum) {
            confirm = "No, my person is not " + names[answer] + ". The name is closer to a.";
        }
        else if (answer < chosenNum) {
            confirm = "No, my person is not " + names[answer] + ". The name is closer to z.";
        }
        else {
            confirm = "true";
        }
        return confirm;
    }
}
