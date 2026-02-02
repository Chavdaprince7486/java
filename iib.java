class iib
{
    // Instance Initialization Block
    {
        System.out.println("Instance Initialization Block executed");
    }

    // Constructor
    iib()
    {
        System.out.println("Constructor executed");
    }

    public static void main(String[] args)
    {
        iib obj1 = new iib();
        System.out.println("----");
        iib obj2 = new iib();
    }
}
