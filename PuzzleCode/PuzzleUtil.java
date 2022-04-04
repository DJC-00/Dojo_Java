import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;

public class PuzzleUtil {

    public ArrayList<Integer> rollNDTwenty(Integer numRolls){
    Random rand = new Random();
    ArrayList<Integer> rolls = new ArrayList();
    for (int i=0; i < numRolls; i++){
        rolls.add(rand.nextInt(20) + 1);
    };
    
    return rolls;
    };

    public char randChar() {
        Random rand = new Random();
        int num = (rand.nextInt(26) + 97);
        char myChar = (char) num;
        return myChar;
        
    }

    public String passwordGen() {
        String password = "";
        for (int i = 0; i < 8; i++){
            password += randChar();
        }

        return password;
    }

    public ArrayList<String> passwordGenN(int numPasswords) {
        ArrayList<String> passwordList = new ArrayList<String>();

        for (int i = 0; i < numPasswords; i++){
            passwordList.add(passwordGen());
        }
        return passwordList;
    }
};