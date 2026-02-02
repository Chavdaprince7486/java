class over_loding {

    String modele;
    int year;

    // Default constructor
    over_loding() {
        year = 2006;
        modele = "alpha";
    }

    // One parameter constructor
    over_loding(int year) {
        this.year = year;
        modele = "beta";
    }

    // Two parameter constructor
    over_loding(int year, String modele) {
        this.year = year;
        this.modele = modele;
    }

    void display() {
        System.out.println("year = " + year + " model = " + modele);
    }

    public static void main(String[] args) {

        over_loding ov1 = new over_loding();
        over_loding ov2 = new over_loding(2007);
        over_loding ov3 = new over_loding(2008, "gamma");

        ov1.display();
        ov2.display();
        ov3.display();
    }
}
