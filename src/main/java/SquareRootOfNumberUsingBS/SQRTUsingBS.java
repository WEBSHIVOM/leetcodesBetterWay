package src.main.java.SquareRootOfNumberUsingBS;

public class SQRTUsingBS {

	public boolean sqrtOfNum(int n) {
		int l=0;
		int r=n;
		while(l<=r) {
			int mid=l+((r-l)/2);
			//check with mid
			if(mid*mid==n) {
				return true;
			}else if(mid*mid<n) {
				l=mid+1;
			}else {
				r=mid-1;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		SQRTUsingBS sq = new SQRTUsingBS();
		System.out.print(sq.sqrtOfNum(16));
	}
}
