class palindrom1 {
    public static void main(String[] args) {

        int num = 121;
        int temp = num;
        int rev = 0;

        while (num > 0) {
            int r = num % 10;   // semicolon added
            rev = rev * 10 + r;
            num = num / 10;
        }

        if (temp == rev)
            System.out.println("Palindrome number");
        else
            System.out.println("Not a palindrome");
    }
}
