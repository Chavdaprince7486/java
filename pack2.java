package pack2;

class TestSamePackage
{
    public static void main(String[] args)
    {
        Person p = new Person();

        System.out.println(p.name);      
        System.out.println(p.address);   
        System.out.println(p.city);      

        // System.out.println(p.age);    
        p.showPrivate();                 
    }
}
