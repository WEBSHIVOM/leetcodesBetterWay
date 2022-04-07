package array.ArranginCoins.equalNum;

import java.util.*;
import java.util.Map.Entry;

public class EqualData {
    public static int pairsUnique(int[] arr){
        Map<Integer,Integer> map= new HashMap<Integer,Integer>();
        for(int obj:arr){
           if(map.containsKey(obj)){
              map.put(obj,map.get(obj)+1);
           }else{
              map.put(obj,1);
           }
        }
        int count=0;
        for(Entry<Integer,Integer> et:map.entrySet()){
           if(et.getValue()==2){
              count++;
           }
        }
        return count;
     }
   
      public static void main(String args[] ) throws Exception {
     try (//Write code here
    Scanner in = new Scanner(System.in)) {
        int n=in.nextInt();
          for(int i=0;i<n;i++){
             int a=in.nextInt();
             int[] arr1= new int[a];
             for(int j=0;j<a-1;j++){
                arr1[j]=in.nextInt();
             }
             System.out.println(pairsUnique(arr1));
          }
    }
      }
}
