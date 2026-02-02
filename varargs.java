class varargs
{
    public static void names(String... n)
    {
        for (String i : n)
        {
            System.out.print(i + " ");
        }
        System.out.println(); 
    }

    public static void main(String[] args)
    {
        names("hello", "java");
        names("hello", "hello priyanka", "hello ajani");
    }
}
