package Inheritance;

public class Staff extends Manager {
    
    //constructor
    Staff(String nama, String jabatan, int jamlembur, int gaji) {
        super(nama, jabatan, jamlembur, gaji);
    }

    long hitungLembur() {
        long lemburan = 0;
        if (this.jamlembur > 2) {
            lemburan = 500000;
        } else if (this.jamlembur > 4) {
            lemburan = 700000;
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
