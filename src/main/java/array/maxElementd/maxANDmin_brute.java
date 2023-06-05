package src.main.java.array.maxElementd;

public class maxANDmin_brute {
    public static void findMAXmiN(int[] nums){
        int max=nums[0];
        int min=nums[0];
        for (int i = 0; i < nums.length; i++) {
            if(max<nums[i]){
              max=nums[i];
            }
            if(min>nums[i]){
                min=nums[i];
              }
        }

        System.out.println(min +"<--min   "+max+"<--max");
    }

    public static void main(String[] args) {
        int[] n= {1,4,3,2,544,6,10,8};
       findMAXmiN(n);
    }
}
