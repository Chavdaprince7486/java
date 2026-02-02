class GarbageDemo
{
    // Override finalize() method
    protected void finalize()
    {
        System.out.println("finalize() method called: Cleaning up resources");
    }

    public static void main(String[] args)
    {
        // Create objects
        GarbageDemo obj1 = new GarbageDemo();
        GarbageDemo obj2 = new GarbageDemo();

      
        obj1 = null;
        obj2 = null;

        
        System.gc();

        System.out.println("End of main method");
    }
}
