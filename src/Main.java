import java.util.*;
import java.util.function.IntBinaryOperator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Main {
    static int count = 0;

    public static void main(String[] args) {


        Main m = new Main();
        System.out.println(m.addBinary("1010","1011"));
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

    public static int findIt(int[] a) {
        List<Integer> data = new ArrayList<>();
        for(int i = 0; i < a.length; i++) {
            int start = a[i];
            int freq = 0;
            for(int j = 0; j < a.length; j++) {
                if(start == a[j]) {
                    freq++;
                }
            }
            if(freq%2 != 0) {
                data.add(start);
            }
        }

        return data.get(0);
    }

    //validate a string by checking if the reversed last substring based on number matches the next words of first two letters of substring in the array
    public static boolean validate(String[] words, int number) {
        // Have fun ;D

        boolean check = true;
        Set<String> seen = new HashSet<>();
        for (String w : words) {
            if (w == null || !seen.add(w.toLowerCase())) {
                return false; // duplicate or null word
            }
        }

        if(words.length >=2 ) {
            if (number > 0) {
                for (int i = 0; i < words.length - 1; i++) {
                    if (words[i].length() < number || words[i + 1].length() < number) {
                        check = false;
                        break;
                    }
                    StringBuilder lastNumLetters = new StringBuilder(words[i].substring(words[i].length() - number));
                    StringBuilder lastRev = lastNumLetters.reverse();
                    check = lastRev.toString().equalsIgnoreCase(words[i + 1].substring(0, number));
                    if (!check) {
                        break;
                    }
                }
            } else {
                check = false;
            }
        }
        else {
            check = false;
        }
        return check;
    }


    //check if a string is alphanumeric
    public static boolean alphanumeric(String s){

        boolean check= false;
        if(s.length() > 1) {
            if(s.split(" ").length <= 1) {
                if(!s.contains("_")) {
                    for(int i = 0; i < s.length(); i++) {
                        char c = s.charAt(i);
                        if(('a' <= c && c <= 'z') || ('A' <= c && c <= 'Z') || ('0' <= c && c <= '9')) {
                            check = true;
                        } else {
                            check = false;
                            break;
                        }

                    }
                }
            }
        }
        return check;
    }


    public static String regexBelow(long n) {

        return "[1-9]+" + n;
    }

    public int searchInsert(int[] nums, int target) {
        int index = Arrays.binarySearch(nums,target);
        if(index < 0){
            index = Math.abs((index + 1));
        }
        return index;
    }

    public String addBinary(String a, String b) {
        int sum = 0;
        for(int i = a.length()-1; i >= 0; i--)
            sum += (Integer.parseInt(""+a.charAt(a.length()-i-1)) * ((int) Math.pow(2,i)));
        for(int i = b.length()-1; i >= 0; i--)
            sum += (Integer.parseInt(""+b.charAt(b.length()-i-1)) * ((int) Math.pow(2,i)));
        return Integer.toBinaryString(sum);
    }

}