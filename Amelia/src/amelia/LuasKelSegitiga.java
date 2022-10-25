/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amelia;

import java.util.Scanner;

/**
 *
 * @author LK5_28
 */
public class LuasKelSegitiga {
    public static void main(String[] args) {
        //deklarasi
        double luas, kel;
        int alas, tinggi, sisi;
        
        //membuat scanner baru
        Scanner hitung = new Scanner(System.in);
        
        //input
        System.out.println("****Program Hitung Luas dan Keliling Segitiga****");
        System.out.println("Input Alas : ");
        alas = hitung.nextInt();
        System.out.println("Input Tinggi : ");
        tinggi = hitung.nextInt();
        System.out.println("Input Sisi : ");
        sisi = hitung.nextInt();
        
        //proses
        luas = Double.valueOf((alas * tinggi)/2);
        kel = alas + tinggi + sisi;
        
        //output
        System.out.println("Luas Segitiga = " + luas);
        System.out.println("Keliling Segitiga = " +kel);
    }
}
