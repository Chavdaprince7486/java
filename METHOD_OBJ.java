class METHOD_OBJ
{
    int id;
    String name;

    METHOD_OBJ(int id, String name)
    {
        this.id = id;
        this.name = name;
    }

    public static void main(String[] args)
    {
        METHOD_OBJ o1 = new METHOD_OBJ(1, "java");
        METHOD_OBJ o2 = new METHOD_OBJ(1, "java");

        System.out.println(o1 == o2);        
        System.out.println(o1.equals(o2));   
    }
}
	
