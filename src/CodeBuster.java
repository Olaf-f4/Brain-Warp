import java.util.ArrayList;
import java.util.Scanner;

public class CodeBuster {
    Scanner userInput = new Scanner(System.in);

    public void playGame() throws InterruptedException {
        CodeGenerator cGen = new CodeGenerator();
        gameBall gameObj = new gameBall();

        ArrayList<Integer> code = new ArrayList<>();
        int permit = 0;
        while (permit == 0){
            try {
                code = cGen.generateCode(difficulty()); 
                code.get(0);
                permit++;
                    
            } catch (NullPointerException e) {
                System.out.println("Incorrect choice selected. Try again: ");
                System.out.println();
            }
        }

        // CountdownTimer timer = new CountdownTimer(5);
        // timer.startCountdown();

        int codeBreak = 0;
        int numbersLeft = code.size();
        while (true) {
            gameObj.gameState();
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
                    gameObj.rotateDown();
                }
                default -> {
                    System.out.println("F+S");
                }
            } 
            if (inputCheck(code.get(codeBreak), gameObj.gameFace()) == 1 && numbersLeft > 1){
                codeBreak++;
                numbersLeft = code.size() - codeBreak;
                System.out.println();
                System.out.println("Correct! " + numbersLeft + " numbers to go");
            }   else if (inputCheck(code.get(codeBreak), gameObj.gameFace()) == 1){
                System.out.println();
                System.out.println("You cracked the code!");
                break;
            } else {
                System.out.println();
                System.out.println("Incorrect");
                System.out.println();
                gameObj.reset();
                codeBreak = 0;
                numbersLeft = code.size();
            }
        }
    }

    private int difficulty(){
        System.out.println();
        System.out.println("Choose your difficulty");
        System.out.println("(w) - Easy: 4-digit crack");
        System.out.println("(a) - Medium: 6-digit crack");
        System.out.println("(d) - Hard: 8-digit crack");
 
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
            default -> {
                return 0;
            }
        }
    }

    private static int inputCheck(int codeDigit, int gameFace){
        if (codeDigit == gameFace){
            return 1;
        } 

        return 0;
    }
}
