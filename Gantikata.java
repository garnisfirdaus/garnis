/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg23176016_latihan28.gantikata;

/**
 *
 * @author LENOVO
 */

import java.util.Scanner;

public class Gantikata {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("====Program Mengganti Kata====");
        System.out.print("Masukkan Kalimat : ");
        String kalimat = input.nextLine();

        System.out.print("Ganti Kata : ");
        String kataGanti = input.nextLine();

        System.out.print("Menjadi Kata : ");
        String kataBaru = input.nextLine();

        // Mengganti kata yang diminta dengan kata baru
        String kalimatBaru = kalimat.replace(kataGanti, kataBaru);

        // Menampilkan hasil
        System.out.println("\n====Hasil Formatting====");
        System.out.println("Kalimat awal : " + kalimat);
        System.out.println("Kalimat baru : " + kalimatBaru);

        input.close();
    }
}
