/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2;
import java.util.*;
/**
 *
 * @author Praktikan
 */
public class PBO2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner (System.in);
        String repeat, nama, jenisKelamin,kodeMakanan, kodeMinuman, namaMakanan, namaMinuman;
        float jumlahMakanan, jumlahMinuman, hargaMakanan, hargaMinuman;
        int umur;
        int ulang = 1;
        
        

        do {
        
        
        System.out.println("== WARTEG MR.KAB ==");
        System.out.println("===================");
        System.out.println("LIST MAKANAN : ");
        System.out.println("-------------------");
        System.out.println("1. MM1 \t: BASO SAPI \t -> \t Rp.5000");
        System.out.println("2. MM2 \t: MIE AYAM \t -> \t Rp.3000");
        System.out.println("===================");
        System.out.println("LIST MINUMAN : ");
        System.out.println("-------------------");
        System.out.println("1. NN1 \t: JOSUA \t -> \t Rp.1000");
        System.out.println("2. NN2 \t: NUTRISARI \t -> \t Rp.2000");
        System.out.println("===================");
        System.out.println("");
        System.out.println("SILAHKAN MEMESAN");
        System.out.println("-------------------");
        System.out.print("Nama \t\t: ");
        nama = in.nextLine();
        System.out.print("Gender (L/P) \t: ");
        jenisKelamin = in.nextLine();
        System.out.print("Umur \t\t: ");
        umur = in.nextInt();
        System.out.print("Kode Makanan \t: ");
        kodeMakanan = in.next();
        System.out.print("Jumlah \t\t: ");
        jumlahMakanan = in.nextFloat();
        System.out.print("Kode Minuman \t: ");
        kodeMinuman = in.next();
        System.out.print("Jumlah \t\t: ");
        jumlahMinuman = in.nextFloat();
        System.out.println("");
        
        if (kodeMakanan.equalsIgnoreCase("MM1")){
            namaMakanan = "BASO SAPI";
            hargaMakanan = 5000;
        } else if (kodeMakanan.equalsIgnoreCase("MM2")) {
            namaMakanan = "MIE AYAM";
            hargaMakanan = 3000;
        } else {
            namaMakanan = "-";
            hargaMakanan = 0;
        }
        
        if (kodeMinuman.equalsIgnoreCase("NN1")) {
            namaMinuman = "JOSUA";
            hargaMinuman = 1000;
        } else if (kodeMinuman.equalsIgnoreCase("NN2")){
            namaMinuman = "NUTRISARI";
            hargaMinuman = 2000;
        } else {
            namaMinuman = "-";
            hargaMinuman = 0;
        }
        System.out.println("===================");
        Makanan Makanan = new Makanan(kodeMakanan, namaMakanan, hargaMakanan);
        Minuman Minuman = new Minuman(kodeMinuman, namaMinuman, hargaMinuman);
        Pesanan Pesanan = new Pesanan(Makanan, Minuman);
        Pesanan.getJumlahBayar(jumlahMakanan, jumlahMinuman);
        Manusia Manusia = new Manusia(nama, jenisKelamin, umur, Pesanan);
       
        Manusia.getPanggilan();
        Manusia.tampilPesanan(jumlahMakanan, jumlahMinuman);
        System.out.println("");
        System.out.print("INGIN PESAN LAGI ?? (y/n) : ");
        repeat = in.next();
        if (repeat.equalsIgnoreCase("y")){
            ulang = 1;
        } else {
            ulang = 0;
        }
        } while (ulang == 1);
    }
    
}
