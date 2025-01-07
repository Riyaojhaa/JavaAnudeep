import java.util.HashMap;

public class LongestSubarrayWithZeroSum {
    public static int main(String[] args) {
        int[] arr = { 15, -2, 2, -8, 1, 7, 10, 23 };
        HashMap<Integer, Integer> mp = new HashMap<>();
        // code here
        int preSum = 0;
        int mxLength = 0;
        mp.put(0, -1);
        for (int i = 0; i < arr.length; i++) {
            preSum += arr[i];
            if (mp.containsKey(preSum)) {
                mxLength = Math.max(mxLength, i - mp.get(preSum));
            } else {
                mp.put(preSum, i);
            }
        }

        return mxLength;
    }
}
