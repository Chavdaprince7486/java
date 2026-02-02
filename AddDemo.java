class AddDemo
{
    // Add two integers
    int add(int a, int b)
    {
        return a + b;
    }

    // Add three integers
    int add(int a, int b, int c)
    {
        return a + b + c;
    }

    // Add two double values
    double add(double a, double b)
    {
        return a + b;
    }

    public static void main(String[] args)
    {
        AddDemo obj = new AddDemo();

        System.out.println("Addition of two integers: " + obj.add(10, 20));
        System.out.println("Addition of three integers: " + obj.add(10, 20, 30));
        System.out.println("Addition of two doubles: " + obj.add(10.5, 20.5));
    }
}
