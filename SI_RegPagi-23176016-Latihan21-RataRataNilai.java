/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg23176016_latihan21.rataratanilai;

/**
 *
 * @author LENOVO
 * NAMA                 : GARNIS FIRDAUS
 * NIM                  : 23176016
 * PRODI                : SISTEM INFORMASI
 * DESKRIPSI PROGRAM    : UNTUK MENAMPILKAN NILAI RATA-RATA
 */
import java.util.Scanner;

public class RataRataNilai {

    
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan Banyaknya Mahasiswa: ");
        int jumlahMahasiswa = input.nextInt();
        int[] nilaiMahasiswa = new int[jumlahMahasiswa];
        int totalNilai = 0;
        
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("Nilai Mahasiswa ke-" + (i + 1) + ": ");
            nilaiMahasiswa[i] = input.nextInt();
            totalNilai += nilaiMahasiswa[i];
        }
        
        double rataRata = (double) totalNilai / jumlahMahasiswa;
        
        System.out.println("\nMaka, Rata-rata Nilainya adalah " + rataRata);
        System.out.println("Developed by : Garnis Firdaus");
        
        input.close();
    }
    
}
