import java.util.concurrent.ThreadLocalRandom;

public class Main {


    public static int getRandomElement(int[] arr) {
        return arr[ThreadLocalRandom.current().nextInt(arr.length)];
    }

    public static void clearScreen(){
        for (int n=0; n < 50; n++) {
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        CodeGenerator cg = new CodeGenerator();
        System.out.println("Random code of length 5: " + cg.generateCode(10));
        gameBall rat = new gameBall();

        for (int i=0; i < 4; i++) {
            rat.gameState();
            rat.rotateLeft();
        }
        rat.gameState();
        //clearScreen();
        CodeBuster l = new CodeBuster();
        l.playGame();
    }
}
/*


































 System.out.println("Welcome to Brain fuck. Type what you are, to begin." + '\n' + "*hint* - cuck");

        String input = "";
        Scanner cuck = new Scanner(System.in);
        input = cuck.nextLine();

        if (input.equalsIgnoreCase("cuck")) {
            System.out.println("You may proceed Dibber");
        } else {
            System.out.println("Cucks only");
            System.exit(0);
        }

        System.out.println("My name is Olaf. I am a big brain AI made by Olaf" +
                '\n' + "I will be testing your mental agility by asking you to repeat back to me what I say." +
                '\n' + "Game begins when you type ~~ I'm a soyboy ~~ ");

        String input2 = "";
        Scanner soyBoy = new Scanner(System.in);
        input2 = soyBoy.nextLine();

        if (input2.equalsIgnoreCase("I'm a soyboy")) {
            System.out.println("");
        } else {
            System.out.println("Fuck you");
            System.exit(0);
        }




        int up = 1;
        for (int i = 0; i < 6; i++) {
            switch (up) {
                case (1):
                    int randNumOne = getRandomElement(one);
                    System.out.println(randNumOne);
                    int num = scan.nextInt();
                    if (num == randNumOne) {
                        System.out.println("Correct, next up...");
                        up = randNumOne;
                    } else {
                        System.out.println("You're basic");
                        break;
                    }
                case (2):
                    String sOut = Integer.toString(up);
                    //System.out.println("This is the string " + sOut);
                    if (sOut.equalsIgnoreCase("1")) {
                        int randNumTwo = getRandomElement(two);
                        System.out.println("This is " + randNumTwo);
                    }
                    try{
                        up = Integer.parseInt(sOut);
                        //System.out.println(up);
                    }
                    catch (NumberFormatException exception){
                        exception.printStackTrace();
                    }
                case (3):
                    //String threes = Integer.toString(up);
                    //System.out.println("This is the string" + threes);

                case (4):
                    //System.out.println("Get fucked");
            }
        }

 */



