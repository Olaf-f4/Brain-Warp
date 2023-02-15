import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static int getRandomElement(int[] arr){
        return arr[ThreadLocalRandom.current().nextInt(arr.length)];
    }
    public static <function> void main(String[] args) {
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

        //int randomNum = ThreadLocalRandom.current().nextInt(1, 6);
        //System.out.println(randomNum);
        Scanner scan = new Scanner(System.in);

        int[] one = {3, 4, 5, 6};
        int[] two = {3, 4, 5, 6};
        int[] three = {1, 2, 5, 6};
        int[] four = {1, 2, 5, 6};
        int[] five = {1, 2, 3, 4};
        int[] six = {1, 2, 3, 4};

        //int randNum = getRandomElement(one);
        //System.out.println(randNum);

        int up = 1;
        for (int i = 0; i < 6; i++) {
            switch (up) {
                case (1):
                    int randNum = getRandomElement(one);
                    System.out.println(randNum);
                    int num = scan.nextInt();
                    if (num == randNum) {
                        System.out.println("Correct, next up...");
                    }
                case (2):
                    //int randNum = getRandomElement(one);
                    //System.out.println(randNum);
                    break;
            }
        }
    }
}