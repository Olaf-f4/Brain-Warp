import java.util.ArrayList;
import java.util.Scanner;

public class CodeBuster {

    public void playGame() throws InterruptedException {
        int roundNumber = 1;
        int codeLength = 5;

        CodeGenerator cGen = new CodeGenerator();
        gameBall gameObj = new gameBall();

        ArrayList<Integer> code = cGen.generateCode(difficulty());


        CountdownTimer timer = new CountdownTimer(60);
        timer.startCountdown();

        while (timer.getRemainingTime() > 0) {
            gameObj.gameState();
            Scanner userInput = new Scanner(System.in);
            String input = userInput.next();

            switch (input){
                case "w" -> {
                    gameObj.rotateUp();
                }
                case "a" -> {
                    gameObj.rotateLeft();
                }
                case "d" -> {
                    gameObj.rotateRight();
                }
                case "s" -> {
                    gameObj.rotateLeft();
                }
            }

            Thread.sleep(1000);
        }
    }

    public int difficulty(){
        System.out.println("Choose your difficulty");
        System.out.println("(w) - Easy: 4-digit crack");
        System.out.println("(a) - Medium: 6-digit crack");
        System.out.println("(d) - Hard: 8-digit crack");

        try (Scanner userInput = new Scanner(System.in)) {
            String input = userInput.next();

            switch (input){
                case "w" -> { 
                    return 4;
                }
                case "a" -> {
                    return 6;
                }
                case "d" -> {
                    return 8;
                }
            }
            return 0;
        }
    }
}
