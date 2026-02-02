class Parameter {
    String name;
    int i;

    // Parameterized Constructor
    Parameter(String name, int i) {
        this.name = name;
        this.i = i;
    }

    void display() {
        System.out.println("Name: " + name + " Id: " + i);
    }

    public static void main(String[] args) {
        Parameter p = new Parameter("priyanka", 5);
        p.display();
    }
}

