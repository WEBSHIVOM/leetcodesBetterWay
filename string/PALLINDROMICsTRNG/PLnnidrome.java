package string.PALLINDROMICsTRNG;

public class PLnnidrome {
    public static int isPalindrome(String A) {
         int l=0;
         int r=A.length()-1;

         A=A.toLowerCase();

         while(l<=r){
            char charAl=A.charAt(l);
            char charAr=A.charAt(r);

             if(!(charAl<='a' && charAl>='z')){
                 l++;
             }else if(!(charAr<='a' && charAr>='z')){
                 r--;
             }else if(charAl==charAr){
                     l++;
                     r--;
                 }
                 
                     return 0;
                 
             
         }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("race a car"));
    }
}
