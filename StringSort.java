import java.util.Arrays;

class StringSort
{
    public static void main(String[] args)
    {
        // Check if strings are passed or not
        if (args.length == 0)
        {
            System.out.println("Please enter strings from command line.");
            return;
        }

        // Sort strings alphabetically
        Arrays.sort(args);

        // Display sorted strings
        System.out.println("Strings in alphabetical order:");
        for (String s : args)
        {
            System.out.println(s);
        }
    }
}
