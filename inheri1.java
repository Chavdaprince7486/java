public class inheri1 {
    String name;

    public void speed() {
        System.out.println("speeding");
    }
}

class alto extends inheri1 {
    public void display() {
        System.out.println("this is alto class display method");
    }
}

class main {
    public static void main(String[] args) {
        alto a = new alto();
        a.name = "Fortuner";
        a.display();
        a.speed();
        System.out.println("Car name: " + a.name);
    }
}
