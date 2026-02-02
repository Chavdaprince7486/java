class polymer1 {
    void run() {
        System.out.println("base class");
    }
}

class Father extends polymer1 {
    void run() {
        System.out.println("derived class");
    }
}	
	
class Main {
    public static void main(String[] args) {
        Father f = new Father();
        f.run();
    }
}
