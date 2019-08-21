
package pbo2;

/**
 *
 * @author Praktikan
 */
public class Minuman {
    String kodeMinuman, nama;
    float harga;

    public Minuman(String kodeMinuman, String nama, float harga) {
        this.kodeMinuman = kodeMinuman;
        this.nama = nama;
        this.harga = harga;
    }

    public String getKodeMinuman() {
        return kodeMinuman;
    }

    public void setKodeMinuman(String kodeMinuman) {
        this.kodeMinuman = kodeMinuman;
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
