/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg23176016_latihan25.ejaannama;

/**
 *
 * @author LENOVO
 * NAMA                 : GARNIS FIRDAUS
 * NIM                  : 23176016
 * PRODI                : SISTEM INFORMASI
 * DESKRIPSI PROGRAM    : Program ini untuk menampilkan ejaan nama 
 *                          yang inputannya berasal dari user
 */
import java.util.Scanner;

public class EjaanNama {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Meminta pengguna memasukkan nama
        System.out.print("Masukkan nama depan anda untuk di eja: ");
        String nama = scanner.nextLine();
        
        System.out.println("Ejaan untuk \"" + nama + "\" adalah :");
        
        // Melakukan perulangan untuk setiap huruf dalam nama
        for (int i = 0; i < nama.length(); i++) {
            System.out.println("Huruf ke-" + (i + 1) + " : " + nama.charAt(i));
        }
        
        // Menutup scanner
        scanner.close();
        
        System.out.println("BUILD SUCCESSFUL");
    }
    
}
