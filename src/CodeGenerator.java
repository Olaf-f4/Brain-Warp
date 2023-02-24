import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class CodeGenerator {

    public static int getRandomElement(int[] arr) {
        return arr[ThreadLocalRandom.current().nextInt(arr.length)];
    }

    public ArrayList<Integer> generateCode(int codeLength) {

        ArrayList<Integer> code = new ArrayList<Integer>();
        int[][] adjacency = {{3, 4, 5, 6},
                             {3, 4, 5, 6},
                             {1, 2, 5, 6},
                             {1, 2, 5, 6},
                             {1, 2, 3, 4},
                             {1, 2, 3, 4}};

        int faceUp = 1;
        for (int i = 0; i < codeLength; i++) {
            int[] choices = adjacency[faceUp-1];
            int nextNumInCode = getRandomElement(choices);
            code.add(nextNumInCode);
            faceUp = nextNumInCode;
        }
        return code;
    }
}
