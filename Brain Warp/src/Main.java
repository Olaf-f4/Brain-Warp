import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Brain fuck. Type what you are, to begin." + '\n' + "*hint* - cuck");

        String input = "";
        Scanner cuck = new Scanner(System.in);
        input = cuck.nextLine();

        if (input.equalsIgnoreCase("cuck")){
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

        if (input2.equalsIgnoreCase("I'm a soyboy")){
            System.out.println("");
        } else {
            System.out.println("Fuck you");
            System.exit(0);
        }



    }
}