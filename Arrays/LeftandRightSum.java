import java.util.*;

public class LeftandRightSum {

    public static int findElement(int arr[]) {
        int n = arr.length;

        if (n < 3) {
            return -1;
        }

        int leftMax[] = new int[n];
        int rightMin[] = new int[n];

        leftMax[0] = Integer.MIN_VALUE;
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], arr[i - 1]);
        }

        rightMin[n - 1] = Integer.MAX_VALUE;
        for (int i = n - 2; i >= 0; i--) {
            rightMin[i] = Math.min(rightMin[i + 1], arr[i + 1]);
        }

        for (int i = 1; i < n - 1; i++) {
            if (leftMax[i] < arr[i] && arr[i] < rightMin[i]) {
                return arr[i];
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(findElement(arr));

        sc.close();
    }
}
