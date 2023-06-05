package src.main.java.array.subarrayOfgivenSum;

import java.util.HashMap;
import java.util.Map;

public class subarraySUmMap {
    
    public int subarraywithSum(int[] n ,int k){
        int sum=0;int res=0;
        Map<Integer,Integer> map= new HashMap<Integer,Integer>();
        map.put(0, 1);

        for (int i = 0; i < n.length; i++) {
            sum+=n[i];
            if(map.containsKey(sum-k)){
                res+=map.get(sum-k);
            }
            map.put(sum, map.getOrDefault(sum, 0)+1);
        }
        return res;
    }
    public static void main(String[] args) {
        subarraySUmMap s1= new subarraySUmMap();
        int[] nus={1,2,3};
        System.out.println(s1.subarraywithSum(nus, 3));
    }
}
