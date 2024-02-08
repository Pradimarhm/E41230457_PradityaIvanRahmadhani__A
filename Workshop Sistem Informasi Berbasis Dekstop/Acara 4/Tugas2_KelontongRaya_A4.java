/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Acara4;

/**
 *
 * @author pradi
 */
import java.util.Scanner;

public class Tugas2_KelontongRaya_A4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String namaPembeli;
        int produkPilihan;
        
        System.out.println("--------------------------------------------------");
        System.out.println("                   KLONTONG RAYA");
        System.out.println("                   Daftar Produk");
        System.out.println("--------------------------------------------------");
        System.out.println("    Nama              Jenis            Harga");
        System.out.println("--------------------------------------------------");
        System.out.println("1. Sunslik          Alat Mandi      Rp.  2.000");
        System.out.println("2. Minyak           Sembako         Rp. 10.000");
        System.out.println("3. Nuvo             Alat Mandi      Rp.  4.000");
        System.out.println("4. Pepsodent        Alat Mandi      Rp. 12.000");
        System.out.println("5. Indomie          Makanan         Rp.  3.000");
        System.out.println("6. Teh Rio          Minuman         Rp. 45.000");
        System.out.println("7. Aqua             Minuman         Rp. 40.000");
        System.out.println("8. Royco            Bahan Dapur     Rp.  5.000");
        System.out.println("9. Ajinomoto        Bahan Dapur     Rp.  4.000");
        System.out.println("10. Santan kelapa   Bahan Dapur     Rp.  8.000");
        System.out.println("--------------------------------------------------");
        
        System.out.print("Masukkan nama pembeli : ");
        namaPembeli = sc.nextLine();
        
        if(namaPembeli.length() >0){
            System.out.print("Silahkan Masukkan pilihan : ");
            produkPilihan = sc.nextInt();
            
            if(produkPilihan >0){
                switch(produkPilihan){
                    case 1:
                        System.out.println("Anda membeli Sunslik");
                        System.out.println("Harga : Rp. 2.000");
                        System.out.println("Terima Kasih "+namaPembeli+" telah berkunjung di Kelontong Raya");
                        break;
                    case 2:
                        System.out.println("Anda membeli Minyak");
                        System.out.println("Harga : Rp. 10.000");
                        System.out.println("Terima Kasih "+namaPembeli+" telah berkunjung di Kelontong Raya");
                        break;
                    case 3:
                        System.out.println("Anda membeli Nuvo");
                        System.out.println("Harga : Rp. 4.000");
                        System.out.println("Terima Kasih "+namaPembeli+" telah berkunjung di Kelontong Raya");
                        break;
                    case 4:
                        System.out.println("Anda membeli Pepsodent");
                        System.out.println("Harga : Rp. 412.000");
                        System.out.println("Terima Kasih "+namaPembeli+" telah berkunjung di Kelontong Raya");
                        break;
                    case 5:
                        System.out.println("Anda membeli Indomie");
                        System.out.println("Harga : Rp. 3.000");
                        System.out.println("Terima Kasih "+namaPembeli+" telah berkunjung di Kelontong Raya");
                        break;
                    case 6:
                        System.out.println("Anda membeli Teh Rio");
                        System.out.println("Harga : Rp. 45.000");
                        System.out.println("Terima Kasih "+namaPembeli+" telah berkunjung di Kelontong Raya");
                        break;
                    case 7:
                        System.out.println("Anda membeli Aqua");
                        System.out.println("Harga : Rp. 40.000");
                        System.out.println("Terima Kasih "+namaPembeli+" telah berkunjung di Kelontong Raya");
                        break;
                    case 8:
                        System.out.println("Anda membeli Royco");
                        System.out.println("Harga : Rp. 5.000");
                        System.out.println("Terima Kasih "+namaPembeli+" telah berkunjung di Kelontong Raya");
                        break;
                    case 9:
                        System.out.println("Anda membeli Ajinomoto");
                        System.out.println("Harga : Rp. 4.000");
                        System.out.println("Terima Kasih "+namaPembeli+" telah berkunjung di Kelontong Raya");
                        break;
                    case 10:
                        System.out.println("Anda membeli Santan Kelapa");
                        System.out.println("Harga : Rp. 8.000");
                        System.out.println("Terima Kasih "+namaPembeli+" telah berkunjung di Kelontong Raya");
                        break;
                    default:
                        System.out.println("Masukkan angka");
                }
            }
        }else{
            System.out.println("Nama Kosong");
        }
    }
}
