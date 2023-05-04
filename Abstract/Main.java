package Abstract;

public class Main {
public static void main(String[] args) {
    //membuat objek karyawan
    Karyawan karyawan = new Karyawan("Jhono", "089622387612");
    karyawan.tampilIdentitas();

    //membuat objek manager
    Manager manager = new Manager("Jarwo", "081246891029");
    manager.tampilIdentitas();

    //membuat objek supervisor
    Spv spv = new Spv("Maman","087898126643");
    spv.tampilIdentitas();
    }
}