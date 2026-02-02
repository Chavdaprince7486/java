class Student1
{
    String name;
    int age;

    // No-argument constructor
    Student1()
    {
        System.out.println("No argument constructor called");
    }

    // Constructor with name only
    Student1(String n)
    {
        name = n;
        System.out.println("Name: " + name);
    }

    // Constructor with name and age
    Student1(String n, int a)
    {
        name = n;
        age = a;
        System.out.println("Name: " + name + " Age: " + age);
    }

    public static void main(String[] args)
    {
        Student1 s1 = new Student1();
        Student1 s2 = new Student1("Priyanka");
        Student1 s3 = new Student1("Priyanka", 20);
    }
}
