class universal
{
    String name = "priyanka";
    int age = 20;


    public String toString()
    {
        return "universal{name='" + name + "', age=" + age + "}";
    }

    public static void main(String[] args)
    {
        universal u = new universal();
        System.out.println(u.toString());
    }
}
