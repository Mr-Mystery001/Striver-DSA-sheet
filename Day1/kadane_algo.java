import java.util.*;

public class kadane_algo {

    public static long maxSubarraySum(int[] arr, int n) {
        // write your code here
        long s = 0;
        long max = arr[0];
        for (int i = 0; i < n; i++) {
            s = s + arr[i];
            if (s > max)
                max = s;
            if (s < 0)
                s = 0;

        }
        if (max < 0)
            max = 0;
        return max;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        kadane_algo obj = new kadane_algo();

        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        long s = obj.maxSubarraySum(arr, n);
        System.out.println(s);

    }

}
