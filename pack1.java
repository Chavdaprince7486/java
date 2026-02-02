package pack1;

public class Person
{
    public String name = "Public Name";
    private int age = 20;
    protected String address = "Protected Address";
    String city = "Default City";   // default access

    // method to access private member
    public void showPrivate()
    {
        System.out.println("Private Age: " + age);
    }
}
