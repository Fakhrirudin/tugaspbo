package Abstract;

public class Manager extends PT{
    public Manager(String nama, String no_telp) {
        super(nama, no_telp);
    }
    public void tampilIdentitas(){
        System.out.println("Manager : "+nama+"\nNo Telepon : "+no_telp);
    
    }
}
