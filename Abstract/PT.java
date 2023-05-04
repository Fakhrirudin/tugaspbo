package Abstract;

public abstract class PT {
    protected String nama;
    protected String no_telp;

    public PT(String nama, String no_telp) {
        this.nama = nama;
        this.no_telp = no_telp;
    }

    public abstract void tampilIdentitas();
}
