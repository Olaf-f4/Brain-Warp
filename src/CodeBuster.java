import java.util.ArrayList;
import java.util.Scanner;

public class CodeBuster {

    public void playGame() {
        Scanner userInput = new Scanner (System.in);
        System.out.println("");

        int input = userInput.nextInt();

        int roundNumber = 1;
        int codeLength = 3;


        CodeGenerator cgen = new CodeGenerator();
        gameBall gameObj = new gameBall();
        boolean gameLost = false;

        while (gameLost == false) {

            int guesses = 0;
            int maxGuesses = codeLength +1;
            //int maxTime = 60;
            ArrayList<Integer> code = cgen.generateCode(4);

            // while (time < maxTime)
            while (guesses < maxGuesses) {
                int first = code.get(0);
                int second = code.get(1);
                if (input == first) {
                    System.out.println("Correct");
                } else {
                    gameLost = true;
                }

            }

        }
    }
}
