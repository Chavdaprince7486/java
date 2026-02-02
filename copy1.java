class copy1 {
    String name;
    int id;

    // Parameterized Constructor
  copy1(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Copy Constructor
    copy1(copy1 obj1) {
        this.name = obj1.name;
        this.id = obj1.id;
    }
}

class copy2 {
    public static void main(String[] args) {

        // Original object
      copy1 ob = new copy1("Priyanka", 5);
        System.out.println("Original Object:");
        System.out.println("Name: " + ob.name + " ID: " + ob.id);

        // Copy object
        copy1 obj2 = new copy1(ob);
        System.out.println("\nCopy Constructor used for second object:");
        System.out.println("Name: " + obj2.name + " ID: " + obj2.id);
    }
}
}
}