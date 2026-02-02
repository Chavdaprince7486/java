class first_odd {
    public static void main(String[] args) {

        int count = 0;

        for (int i = 1; count < 100; i += 2) {
            System.out.print(i + " ");
            count++;
        }
    }
}
