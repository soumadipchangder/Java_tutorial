package practice;

public class Sqrt_of_int {
	public static int mySqrt(int x) {
        if (x < 2) return x;

        int left = 1, right = x / 2, ans = 0;

        while (left <= right) {
            long mid = left + (right - left) / 2;
            if (mid * mid <= x) {
                ans = (int) mid;
                left = (int) mid + 1;
            } else {
                right = (int) mid - 1;
            }
        }

        return ans;
    }
	public static void main(String[] args) {
		int N = 36;
		System.out.println(mySqrt(N));
		
	}

}
//even = [1,2,4]	, odd = [3,9,4], res = [1,3,2,9,4,4]
//
//odd = 
//even = 
//
//for (traverse whole array) {
//	if i % 2 == 0:
//		even.append(nums[])
//}
//
//res = []
//		while i < len(even) and j < len(od):
//			res..append(even[i])
//			i + 1
//			res.append(odd[j])
//			j + =1

//Find the maximum element in an array which is first increasing then decreasing.

/*[1,2,3,4,5,12,4,3,2,1]
 * 
 * for (int i = 0; i < n-1; i++) {
 * if arr[i] < arr[i + 1]:
 * 		continue
 * return arr[i];
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
