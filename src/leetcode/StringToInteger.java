package leetcode;

public class StringToInteger {

    public static void main(String[] args) {
        String a = "1337cd03";
        System.out.println(myAtoi("0-1"));
    }

    public static int myAtoi(String s) {
        if(!s.startsWith(" ")) {
            if(!s.startsWith("-")) {
                if(!s.startsWith("0")) {
                    for(int i = 0; i < s.length(); i++) {
                        if(!Character.isDigit(s.charAt(0))) {
                            return 0;
                        }
                        else {
                            if(!Character.isDigit(s.charAt(i))) {
                                s = s.substring(0,i);
                                return Integer.parseInt(s);
                            }
                            else {
                                if(i == s.length()-1) {
                                    return Integer.parseInt(s);
                                }
                            }
                        }
                    }
                }
                else {
                    for(int i = 0; i < s.length(); i++) {
                        if(s.charAt(i) == 0) {
                            if(!Character.isDigit(s.charAt(i))) {
                                return 0;
                            }
                        }
                        else {
                            return Integer.parseInt(s);
                        }
                    }
                }
            }
            else {
                return Integer.parseInt(s);
            }

        }
        return 0;
    }
}
