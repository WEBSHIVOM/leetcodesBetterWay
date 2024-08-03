package main.java.array;

public class Ispalindrome {

    public static void main(String[] args) {

        boolean isPalindrome = isPalindromeNumber(123121);
        System.out.println(isPalindrome);
    }

    private static boolean isPalindromeNumber(int number) {
        if (number < 0) {
            return false;
        }
        int n=number;
        int revNum = 0;
        while (n > 0) {
            int x = n % 10;
            revNum = revNum * 10 + x;
            n = n / 10;
        }

        return revNum == number;
    }
}
