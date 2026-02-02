class Student
{
    String name;
    int age;

    // No-argument constructor
    Student()
    {
        System.out.println("No argument constructor called");
    }

    // Constructor with name only
    tudent(String n)
    {
        name = n;
        System.out.println("Name: " + name);
    }

    // Constructor with name and age
    student(String n, int a)
    {
        name = n;
        age = a;
        System.out.println("Name: " + name + " Age: " + age);
    }

    public static void main(String[] args)
    {
        Student s1 = new Student();
        Student s2 = new Student("Priyanka");
        Student s3 = new Student("Priyanka", 20);
    }
}
