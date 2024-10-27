
public class Main {

    //Don't know why this is here
    public static void clearScreen(){
        for (int n = 0; n < 50; n++) {
            System.out.println("");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        //clear Screen? Why was this here

        CodeBuster newGame = new CodeBuster();
        newGame.playGame();
    }
}