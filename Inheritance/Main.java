package Inheritance;

public class Main {
    public static void main(String[] args) {
        //data Manager
        Manager m1 = new Manager("Jane", "Manager", 1, 1000000);
        m1.printManager();
        //data supervisor
        Spv m2 = new Spv("John", "Supervisor", 3, 7500000);
        m2.printManager();
        //data staff
        Staff m3 = new Staff("Opick", "Staff", 5, 5000000);
        m3.printManager();
    }
}

