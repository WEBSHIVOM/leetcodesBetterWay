package src.main.java.string.GCDOFTWOstring;

public class GCD {

    public String gcdOfStrings(String str1, String str2) {
        return (str1 + str2).equals(str2 + str1) ? str1.substring(0, gcd(str1.length(), str2.length())) : "";
    }

    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    public static void main(String[] args) {
       String str1 = "ABCABC" ;
        String str2 = "AB";
        System.out.println(new GCD().gcdOfStrings(str1, str2));
    }
}
