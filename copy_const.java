class CopyConst {
    String name;
    int id;

    // Parameterized constructor
    CopyConst(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Copy constructor
    CopyConst(CopyConst obj) {
        this.name = obj.name;
        this.id = obj.id;
    }

    // MAIN METHOD
    public static void main(String[] args) {

        CopyConst ob1 = new CopyConst("Priyanka", 5);
        System.out.println("Original Object:");
        System.out.println(ob1.name + " " + ob1.id);

        CopyConst ob2 = new CopyConst(ob1);
        System.out.println("Copied Object:");
        System.out.println(ob2.name + " " + ob2.id);
    }
}

