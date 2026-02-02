class Counter
{
    static int count = 0;   // static class variable
    int number;             // non-static instance variable

    // Constructor
    Counter()
    {
        count++;           
        number = count;   
    }

    // Display method
    void display()
    {
        System.out.println("Number = " + number);
        System.out.println("Count  = " + count);
        System.out.println("----------------");
    }

    public static void main(String[] args)
    {
        Counter c1 = new Counter();
        c1.display();

        Counter c2 = new Counter();
        c2.display();

        Counter c3 = new Counter();
        c3.display();
    }
}
