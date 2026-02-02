class private1 {

    // Private Constructor
    private private1() {
        System.out.println("Private constructor called");
    }

    public static void main(String[] args) {

        // Object created inside same class (allowed)
        private1 p = new private1();
        System.out.println("Hello from class");
    }
}
