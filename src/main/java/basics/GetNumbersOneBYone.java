package main.java.basics;

import java.util.HashMap;
import java.util.Map;

public class GetNumbersOneBYone {
    //    public static void main(String[] args) {
//        int n = 128819918;
//        int originalNum =n;
//        int totaLCount =0;
//        int reverseNum =0;
//         while(n>0){
//             int lastDigit = n%10;
//             n=n/10;
//             totaLCount++;
//             reverseNum =(reverseNum *10) +lastDigit;
//         }
//         System.out.println(totaLCount);
//         System.out.println(reverseNum);
//
//        if ((reverseNum == originalNum)) {
//            System.out.println("Palindromes");
//        } else {
//            System.out.println("Palindromes");
//        }
//
//
//    }
    public static int countOccurrences(int[] arr, int x) {

        Map<Integer, Integer> map = new HashMap();

        for (int i : arr) {
            map.put(i, map.getOrDefault(i,0) + 1);
        }

        if (map.containsKey(x)) {
            return map.get(x);
        } else return 0;
    }

    public static void main(String[] args) {
        int[] arrx ={1 ,1 ,2, 2 ,2 ,2 ,3};
        int x=2;
                System.out.println(countOccurrences(arrx, x));


    }
}
