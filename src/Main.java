import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    static int count = 0;

    public static void main(String[] args) {

        System.out.println(firstNonRepeatingLetter("moon-men"));

    }

    public int findMultipleOf3or5(int number) {
        //TODO: Code stuff here
        int sum = 0;
        for (int i = 1; i < 10; i++) {
            if(i%3 == 0 || i%5 == 0) {
                sum += i;
            }
        }

        return sum;
    }

    public static String firstNonRepeatingLetter(String s){
        // Add your code here


        return null;
    }


}