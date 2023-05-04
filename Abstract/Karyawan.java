package Abstract;

public class Karyawan extends PT{
    public Karyawan(String nama, String no_telp) {
        super(nama, no_telp);
    }
    public void tampilIdentitas() {
        System.out.println("Karyawan : "+nama+"\nNo Telepon : "+no_telp);
    }
}
