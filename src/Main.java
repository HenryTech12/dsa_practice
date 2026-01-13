import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    static int count = 0;

    public static void main(String[] args) {

        System.out.println(firstNonRepeatingLetter("sTress"));

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
        Map<String, Integer> freq = new HashMap<>();

        for (String ch : s.split("")) {
            ch = ch.toLowerCase();   // 👈 normalize case
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }

        List<String> result = new ArrayList<>();

        for (String ch : s.split("")) {
            if (freq.get(ch.toLowerCase()) == 1) {
                result.add(ch); // keep original case if you want
            }
        }

        return ((result.size() > 0) ? result.get(0) : "");

    }


}