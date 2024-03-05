package src.main.java.array.reverseVowels;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReverseVowel {

    public String reverseVowels(String args) {
        // jave

        int start = 0;
        int end = args.length() - 1;
        String vowels = "AEIOUaeiou";
        char[] word = args.toCharArray();
        while (start < end) {
            while (start < end && vowels.indexOf(word[start]) == -1) {
                start++;
            }
            while (start < end && vowels.indexOf(word[end]) == -1) {
                end--;
            }
            // swap
            swap(word, start, end);
            start++;
            end--;
        }
     return new String(word);
    }

    private void swap(char[] word, int start, int end) {

        char temp = word[start];
        word[start] = word[end];
        word[end] = temp;
    }

    public static void main(String[] args) {
        ReverseVowel reverseVowel= new ReverseVowel();
        System.out.println(reverseVowel.reverseVowels("JAVIOU"));
    }

}