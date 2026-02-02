import java.util.Scanner;

class MaxArrayRecursion {

    
    static int findMax(int[] arr, int n) {
       
        if (n == 1)
            return arr[0];

        // recursive case
        int maxOfRest = findMax(arr, n - 1);
        return Math.max(arr[n - 1], maxOfRest);
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

        int max = findMax(arr, size);

        System.out.println("Maximum element = " + max);
    }
}
