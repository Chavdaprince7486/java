import java.util.Arrays;
import java.util.Scanner;

class max123 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];

        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);   // sorting array

        int max1 = arr[9];
        int max2 = arr[8];
        int max3 = arr[7];

        System.out.println("Max1 = " + max1);
        System.out.println("Max2 = " + max2);
        System.out.println("Max3 = " + max3);
    }
}
