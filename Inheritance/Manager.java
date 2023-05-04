package Inheritance;

public class Manager {
    protected String nama;
    protected String jabatan;
    protected int jamlembur;
    protected int gaji;

    public Manager(String nama, String jabatan, int jamlembur, int gaji) {
        this.nama = nama;
        this.jabatan = jabatan;
        this.jamlembur = jamlembur;
        this.gaji = gaji;
    }
    long hitungLembur() {
        long lemburan = 0;
        if (this.jamlembur < 2) {
            lemburan = 200000;
        } else if (this.jamlembur < 4) {
            lemburan = 400000;
        } else if (this.jamlembur < 6) {
            lemburan = 600000;
        }
        return lemburan;
    }

    int gaji() {
        return gaji;
    }
    long hitungGajiTotal() {
        long total = this.hitungLembur() + this.gaji();
        return total;
    }

    public void printManager() {
        System.out.println("Nama        : " + nama);
        System.out.println("Jabatan     : " + jabatan);
        System.out.println("Jam Lembur  : " + jamlembur);
        System.out.println("Gaji Total  : " + hitungGajiTotal());
        System.out.println();
    }
}
