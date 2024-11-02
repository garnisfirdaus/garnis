/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg23176016_latihan24.perbandinganduabuahnilai;

/**
 *
 * @author LENOVO
 * NAMA                 : GARNIS FIRDAUS
 * NIM                  : 23176016
 * PRODI                : SISTEM INFORMASI
 * DESKRIPSI PROGRAM    : Dua buah nilai yang inputannya berasal dari
 *                          usernya
 */

import java.util.Scanner;

public class PerbandinganDuaBuahNilai {

   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("===== Progam Perbandingan Nilai =====");
        boolean ulangi = true;
        
        while(ulangi){
            System.out.print("\nMasukkan nilai pertama\t: ");
            int nilai1 = input.nextInt();
            System.out.print("Masukkan nilai kedua\t: ");
            int nilai2 = input.nextInt();                                    
            
            if(nilai1 > nilai2){
                System.out.println("hasil : " +nilai1+ " lebih besar dari " +nilai2);
            } else if(nilai1 < nilai2){
                System.out.println("hasil : " +nilai1+" lebih kecil dari " +nilai2);
            } else{
                System.out.println("hasil : " +nilai1+ " sama dengan " +nilai2);
            }
            
            System.out.print("\nulangi aktifitas? (ya/tidak)");
            String aktifitas = input.next().toUpperCase();                                
            
            if(aktifitas.equals("YA")){
                System.out.print("Program akan diulangi\n");                
            } else if(aktifitas.equals("TIDAK")){
                System.out.print("Program Berhenti Terimakasih\n");
                ulangi = false;
            }
        }
    }
    
}
