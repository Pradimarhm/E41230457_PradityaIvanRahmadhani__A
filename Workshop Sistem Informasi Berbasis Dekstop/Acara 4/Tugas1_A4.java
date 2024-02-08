/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Acara4;

import java.util.Scanner;

public class Tugas1_A4 {
    public static void main(String[]args){
        String nama;
        int b1;
        int b2;
        int b3;
        int b4;
        int b5;
        int nama1;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("----------------------------------------------");
        System.out.println("       Kharisma agung Plaza (KAP)");
        System.out.println("        Promo Belanja Berhadiah");
        System.out.println("    Khusus Pembelian 5 Barang Pertama");
        System.out.println("     Dengan harga minimum Rp 10000,00");
        System.out.println("----------------------------------------------");
        
        System.out.print("Masukkan nama :" );
        nama = sc.nextLine();
        nama1 = nama.length();
        
        if(nama1 <1){
            System.out.println("nama kosong");
        } else{
            System.out.println("");
            System.out.print("Masukkan harga barang ke-1 :  ");
            b1 = sc.nextInt();
            System.out.print("Masukkan harga barang ke-2 :  ");
            b2 = sc.nextInt();
            System.out.print("Masukkan harga barang ke-3 :  ");
            b3 = sc.nextInt();
            System.out.print("Masukkan harga barang ke-4 :  ");
            b4 = sc.nextInt();
            System.out.print("Masukkan harga barang ke-5 :  ");
            b5 = sc.nextInt();
            
            int jumlah;
            jumlah = b1+b2+b3+b4+b5;
            
            if(b1 <10000){
                System.out.println("Total harga pembelian atas nama "+nama+" adalah "+jumlah);
                System.out.println("");
                System.out.println("Maaf Anda tidak mendapatkan hadiah");
                System.out.println("----------------------------------------------");
                System.out.println("               Terima Kasih");
                System.out.println("Anda sudah belanja di Kharisma Agung Plaza");
            } else if(b2 <10000){
                System.out.println("Total harga pembelian atas nama "+nama+" adalah "+jumlah);
                System.out.println("");
                System.out.println("Maaf Anda tidak mendapatkan hadiah");
                System.out.println("----------------------------------------------");
                System.out.println("               Terima Kasih");
                System.out.println("Anda sudah belanja di Kharisma Agung Plaza");
            } else if(b3 <10000){
                System.out.println("Total harga pembelian atas nama "+nama+" adalah "+jumlah);
                System.out.println("");
                System.out.println("Maaf Anda tidak mendapatkan hadiah");
                System.out.println("----------------------------------------------");
                System.out.println("               Terima Kasih");
                System.out.println("Anda sudah belanja di Kharisma Agung Plaza");
            } else if(b4 <10000){
                System.out.println("Total harga pembelian atas nama "+nama+" adalah "+jumlah);
                System.out.println("");
                System.out.println("Maaf Anda tidak mendapatkan hadiah");
                System.out.println("----------------------------------------------");
                System.out.println("               Terima Kasih");
                System.out.println("Anda sudah belanja di Kharisma Agung Plaza");
            } else if(b5 <10000){
                System.out.println("Total harga pembelian atas nama "+nama+" adalah "+jumlah);
                System.out.println("");
                System.out.println("Maaf Anda tidak mendapatkan hadiah");
                System.out.println("----------------------------------------------");
                System.out.println("               Terima Kasih");
                System.out.println("Anda sudah belanja di Kharisma Agung Plaza");
            } else{
                System.out.println("Total harga pembelian atas nama "+nama+" adalah "+jumlah);
                System.out.println("");
                System.out.println("Selamat..........");
                System.out.println("Anda mendapatkan hadiah 1 buah mug cantik");
                System.out.println("----------------------------------------------");
                System.out.println("               Terima Kasih");
                System.out.println("Anda sudah belanja di Kharisma Agung Plaza");
            }
        }
    }
}
