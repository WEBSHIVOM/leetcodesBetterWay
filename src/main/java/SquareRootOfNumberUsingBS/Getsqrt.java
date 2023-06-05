package src.main.java.SquareRootOfNumberUsingBS;
/*
Given a non-negative integer x, compute and return the square root of x.

Since the return type is an integer, the decimal digits are truncated, and only the integer part of the result is returned.

Note: You are not allowed to use any built-in exponent function or operator, such as pow(x, 0.5) or x ** 0.5.

*/
public class Getsqrt {

    public int mySqrt(int x) {
        int l=1;
        int r=x;
        int ans=-1;
        if(x==0 || x==1){
            return x;
        }
        while(l<=r){
            long m=l+((r-l)/2);
            if(m*m==x){
                return (int)m;
            }else if(m*m<x){
                ans=(int)m;
                l=(int)m+1;
            }else{
                r=(int)m-1;
            }
        }
        return ans;
    }
}