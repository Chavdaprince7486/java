class JaggedArraySum
{
    public static void main(String[] args)
    {
        // Declare and initialize jagged array
        int[][] a = {
            {1, 2, 3},
            {4, 5},
            {6, 7, 8, 9}
        };

        int sum = 0;

        // Loop through jagged array
        for (int i = 0; i < a.length; i++)
        {
            for (int j = 0; j < a[i].length; j++)
            {
                sum = sum + a[i][j];
            }
        }

        System.out.println("Sum of all elements = " + sum);
    }
}
