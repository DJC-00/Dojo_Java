import java.util.ArrayList;
import java.util.Arrays;
public class TestPuzzle {
    public static void main(String[] args) {
        PuzzleUtil PuzzleUtil = new PuzzleUtil();

        System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-\n");
        System.out.println(PuzzleUtil.rollNDTwenty(4));
        System.out.println("\n-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-\n");
        System.out.println(PuzzleUtil.rollNDTwenty(10));
        System.out.println("\n-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-\n");
        System.out.println(PuzzleUtil.randChar());
        System.out.println("\n-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-\n");
        System.out.println(PuzzleUtil.passwordGen());
        System.out.println("\n-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-\n");
        System.out.println(PuzzleUtil.passwordGenN(2));
        System.out.println("\n-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-\n");
    };
}


