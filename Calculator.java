class Calculator
{
    // add two integers
    int add(int a, int b)
    {
        return a + b;
    }

    // add three integers
    int add(int a, int b, int c)
    {
        return a + b + c;
    }

    // add two double values
    double add(double a, double b)
    {
        return a + b;
    }
}

class MethodOverloadingDemo
{
    public static void main(String[] args)
    {
        Calculator cal = new Calculator();

        System.out.println("Addition of two integers: " + cal.add(10, 20));
        System.out.println("Addition of three integers: " + cal.add(10, 20, 30));
        System.out.println("Addition of two doubles: " + cal.add(10.5, 20.5));
    }
}
