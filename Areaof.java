class Areaof
{
    public static void main(String[] args)
    {
        if (args.length < 3)
        {
            System.out.println("Usage:");
            System.out.println("For Circle   : java Area circle radius");
            System.out.println("For Rectangle: java Area rectangle length width");
            return;
        }

        String shape = args[0];

        if (shape.equalsIgnoreCase("circle"))
        {
            double radius = Double.parseDouble(args[1]);
            double area = 3.14 * radius * radius;
            System.out.println("Area of Circle = " + area);
        }
        else if (shape.equalsIgnoreCase("rectangle"))
        {
            double length = Double.parseDouble(args[1]);
            double width  = Double.parseDouble(args[2]);
            double area = length * width;
            System.out.println("Area of Rectangle = " + area);
        }
        else
        {
            System.out.println("Invalid shape. Use circle or rectangle.");
        }
    }
}
