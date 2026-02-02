class private1 {

    // Private Constructor
    private Demo() {
        System.out.println("Private constructor called");
    }

    public static void main(String[] args) {

        // Object created inside same class (allowed)
        private1 p = new Demo();
        System.out.println("Hello from class");
    }
}
