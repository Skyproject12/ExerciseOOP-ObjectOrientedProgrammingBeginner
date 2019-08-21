
package pbo2;

public class Makanan {
    String kodeMakanan, nama;
    float harga;

    public Makanan(String kodeMakanan, String nama, float harga) {
        this.kodeMakanan = kodeMakanan;
        this.nama = nama;
        this.harga = harga;
    }

    public String getKodeMakanan() {
        return kodeMakanan;
    }

    public void setKodeMakanan(String kodeMakanan) {
        this.kodeMakanan = kodeMakanan;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public float getHarga() {
        return harga;
    }

    public void setHarga(float harga) {
        this.harga = harga;
    }
    
    
}
