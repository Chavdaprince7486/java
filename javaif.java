class javaif {
    public static void main(String[] args) {

        String name[] = {"abc", "pqr", "xyz"};
        int roll[] = {1, 2, 3};

        if (name[0].equals("abc") && roll[0] == 1) {
            System.out.println("information about abc");
        }
        else if (name[1].equals("pqr") && roll[1] == 2) {
            System.out.println("information about pqr");
        }
        else if (name[2].equals("xyz") && roll[2] == 3) {
            System.out.println("information about xyz");
        }
        else {
            System.out.println("another");
        }
    }
}
