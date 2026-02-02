class Strict
{
    public strictfp double sum()
    {
        double num1 = 10e+10;
        double num2 = 6e+02;
        return num1 + num2;
    }

    public static void main(String[] args)
    {
        Strict obj = new Strict();
        System.out.println(obj.sum());
    }
}
