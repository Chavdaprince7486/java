class main
{
    String model;   
}

public class d_access
{
    public static void main(String[] args)
    {
        main m = new main();
        m.model = "tesla";          
        System.out.println(m.model); 
    }
}
