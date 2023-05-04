package Abstract;

public class Spv extends PT{
    public Spv(String nama, String no_telp) {
        super(nama, no_telp);
    }

    public void tampilIdentitas(){
    System.out.println("Supervisor : "+nama+"\nNo Telepon : "+no_telp);
    }
}
