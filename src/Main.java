import java.util.Scanner;
public class Main {

    //Don't know why this is here
    public static void clearScreen(){
        for (int n = 0; n < 50; n++) {
            System.out.println("");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        //clear Screen? Why was this here
        Scanner scanner = new Scanner(System.in);

        boolean play = true;
        while (play){
        CodeBuster newGame = new CodeBuster();
        newGame.playGame();
        
        System.out.println("Would you like to play again?!");
        System.out.println("yes / no: ");
        String reply = scanner.next();
        if (!"yes".equals(reply)){
            play = false;
            scanner.close();
        } 

        }
        
    }
}