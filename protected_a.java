class Vehical
{
    protected int speed;
}

class Bike extends Vehical
{
    void setspeed(int s)
    {
        speed = s;
    }

    int getspeed()
    {
        return speed;
    }
}

public class Protected_a
{
    public static void main(String[] args)
    {
        Bike b = new Bike();
        b.setspeed(100);
        System.out.println("access via subclass method: " + b.getspeed());

        Vehical v = new Vehical();
        
    }
}
