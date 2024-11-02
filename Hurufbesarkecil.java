/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg23176016_latihan27.hurufbesarkecil;

/**
 *
 * @author LENOVO
 * NAMA                 : GARNIS FIRDAUS
 * NIM                  : 23176016
 * PRODI                : SISTEM INFORMASI
 * DESKRIPSI PROGRAM    : MENAMPILKAN FORMATTING KALIMAT
 *                        MENJADI HURUF BESAR DAN KECIL
 */

import java.util.Scanner;

public class Hurufbesarkecil {
    
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan Kalimat : ");
        String kalimat = scanner.nextLine();
        
        System.out.println("====Hasil Formatting====");
        System.out.println("Huruf Besar : " + kalimat.toUpperCase());
        System.out.println("Huruf Kecil : " + kalimat.toLowerCase());
        
        System.out.println("BUILD SUCCESSFUL (total time: 2 minutes)");
  
    }
    
}
