package pack3;

import pack1.Person;

class TestDifferentPackage extends Person
{
    public static void main(String[] args)
    {
        TestDifferentPackage p = new TestDifferentPackage();

        System.out.println(p.name);      
        System.out.println(p.address);   

        // System.out.println(p.city);   
        // System.out.println(p.age);    
    }
}
