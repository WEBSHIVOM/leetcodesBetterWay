package src.main.java.string.ValidPalindrome;

public class ValidPalindrome {

    public boolean isPalindrome(String s) {
        int i=0;
        int j=s.length()-1;
        char[] ch=s.toCharArray();
       // StringBuilder sb
        while(i<j){
           if(!Character.isLetterOrDigit(ch[i])){
               i++;}
           else if(!Character.isLetterOrDigit(ch[j])){
               j--;
           }else if(Character.toLowerCase(ch[i])!=Character.toLowerCase(ch[j])){
                   return false;
                 }
                  i++;
                  j--;
                 
        }
        return true;
        
    }

    public boolean isPalindromenew(String s) {
        char[] c = s.toCharArray();
        for (int i = 0, j = c.length - 1; i < j; ) {
            if (!Character.isLetterOrDigit(c[i])) i++;
            else if (!Character.isLetterOrDigit(c[j])) j--;
            else if (Character.toLowerCase(c[i++]) != Character.toLowerCase(c[j--])) 
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String sss="A man, a nama";
        System.out.println(new ValidPalindrome().isPalindrome(sss));
    }
}
