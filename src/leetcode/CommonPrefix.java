package leetcode;

public class CommonPrefix {
    public static void main(String[] args) {
        String[] data = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(data));
        System.out.println("Testing....");
    }

    public static String longestCommonPrefix(String[] strs) {
        StringBuilder prefix = new StringBuilder();
        for (int i = 0; i < strs.length-1; i++) {
            if (strs[i].charAt(i) == strs[i + 1].charAt(i)) {
                prefix.append(strs[i].charAt(i));
            }
        }
        return prefix.toString();
    }
}