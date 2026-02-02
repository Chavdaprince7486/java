class typecast2 {
    public static void main(String[] args) {
        double i = 10.245;
        int k = (int) i;   // type casting
        String str = String.valueOf(k); // int to String

        System.out.println("Original value before casting: " + i);
        System.out.println("After casting to int: " + k);
        System.out.println("After casting to String: " + str);
    }
}
