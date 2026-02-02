class P1
{
    private String name;

    public void setname(String name)
    {
        this.name = name;
    }

    public String getname()
    {
        return name;
    }
}

public class paccess
{
    public static void main(String[] args)
    {
        P1 p = new P1();   
        p.setname("priyanka");
        System.out.println(p.getname());
    }
}
