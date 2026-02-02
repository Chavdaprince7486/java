class Car
{
    String brand;
    String model;
    int year;

    // Constructor
    Car(String brand, String model, int year)
    {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    // Setter methods
    void setBrand(String brand)
    {
        this.brand = brand;
    }

    void setModel(String model)
    {
        this.model = model;
    }

    void setYear(int year)
    {
        this.year = year;
    }

    // Display method
    void displayInfo()
    {
        System.out.println("Car Brand : " + brand);
        System.out.println("Car Model : " + model);
        System.out.println("Car Year  : " + year);
    }

    // MAIN METHOD
    public static void main(String[] args)
    {
        Car c1 = new Car("Toyota", "Corolla", 2022);
        c1.displayInfo();
    }
}
