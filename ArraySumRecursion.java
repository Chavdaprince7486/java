import java.util.Scanner;

class ArraySumRecursion {

    // recursive method to calculate sum
    static int sumArray(int[] arr, int n) {
        // base case
        if (n <= 0)
            return 0;

        // recursive case
        return sumArray(arr, n - 1) + arr[n - 1];
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter array elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int sum = sumArray(arr, size);

        System.out.println("Sum of array elements = " + sum);
    }
}
