package src.main.java.max_problem.MAXlength_OF_COMMON_PREFIX_BETWEEN_TWOString;

import java.util.Arrays;
import java.util.List;

public class MaxLengthCommonPrefix{

    public static String LCP(String X,String Y){
        int i=0;
        int j=0;
        while(i<X.length() && j<Y.length()){
            if(X.charAt(i++)!=Y.charAt(j++)){
                break;
            }
        }
        return X.substring(0, i);
    }
public static String findLCP(List<String> list,int low,int high){
    if(low>high) return "";

    if(low==high) return list.get(low);

    int mid=(low+high)/2;

    String X=findLCP(list, low, mid);
    String Y =findLCP(list, mid+1, high);

    return LCP(X, Y);
    
}
    public static void main(String[] args) {
        List<String> list=Arrays.asList("techie delight","tech","techie","technul");
        System.out.println(findLCP(list, 0, list.size()-1));
    }
}