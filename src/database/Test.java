package database;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        Scanner Input = new Scanner(System.in);

        int userNum;


        int computerNum = (int) (0 + Math.random() * 3);

        System.out.println("Let's play rock paper scissors.");
        System.out.println("Choose rock paper or scissors");

        boolean input = false;

        String userInput = Input.nextLine();

        do {
            switch (userInput.toLowerCase().trim()) {
                case "rock":
                    userNum = 0;
                    input = true;
                    break;
                case "paper":
                    userNum = 1;
                    input = true;
                    break;
                case "scissors:":
                    userNum = 2;
                    input = true;
                    break;
                default:
                    System.out.println("Please retry and make sure spelling is correct");
                    input = false;
                    break;
            }
        } while (input = false);
    }
}