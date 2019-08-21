
package pbo2;

public class Manusia {
    String nama, jenisKelamin, panggilan;
    int umur;
    Pesanan pesanan;

    public Manusia(String nama, String jenisKelamin, int umur, Pesanan pesanan) {
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.umur = umur;
        this.pesanan = pesanan;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public Pesanan getPesanan() {
        return pesanan;
    }

    public void setPesanan(Pesanan pesanan) {
        this.pesanan = pesanan;
    }
    
    public String getPanggilan() {
        if (15 > umur) {
            if ("L".equalsIgnoreCase(jenisKelamin) || "P".equals(jenisKelamin)){
                panggilan = "Adek";
            } 
        } else if (30 > umur && umur > 15) {
            if ("L".equalsIgnoreCase(jenisKelamin)){
                panggilan = "Mas";
            } else {
                panggilan = "Mba";
            }
        } else if (50 > umur && umur > 30) {
            if ("L".equalsIgnoreCase(jenisKelamin)){
                panggilan = "Bapak";
            } else {
                panggilan = "Ibu";
            }
        } else if (umur > 50) {
            if ("L".equalsIgnoreCase(jenisKelamin)){
                panggilan = "Kakek";
            } else {
                panggilan = "Nenek";
            }
        }
        return panggilan;
    }
    
    public void tampilPesanan(float jumlahMakanan, float jumlahMinuman) {
        System.out.println("Pesanan " + panggilan + " " + nama);
        System.out.println("Makanan \t\t: " + pesanan.food.getNama());
        System.out.println("Jumlah Makanan \t\t: " + jumlahMakanan);
        System.out.println("Minuman \t\t: " + pesanan.drink.getNama());
        System.out.println("Jumlah Minuman \t\t: " + jumlahMinuman);
        System.out.println("Bayar \t\t: Rp " + pesanan.total);
        System.out.println("======================");
    }
}
