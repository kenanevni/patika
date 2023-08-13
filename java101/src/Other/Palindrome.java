package Other;

public class Palindrome {
    static boolean isPalindrome(String string) {
        int i = 0;
        int j = string.length()-1;
        while (i < j) {
            if (string.charAt(i) != string.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    static boolean isPalindrome2(String string) {
        String reverse = "";
        for (int i = string.length() - 1; i >= 0; i--) {
            reverse+= string.charAt(i);
        }
        if (string.equals(reverse)) {
            return true;
        }

        return false;
    }
    public static void main(String[] args) {
        String str = "kayak";
        System.out.println(str + " is Palndrome? " + isPalindrome(str));
        System.out.println(str + " is Palndrome? " + isPalindrome2(str));



    }


}
