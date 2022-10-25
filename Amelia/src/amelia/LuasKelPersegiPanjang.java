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
public class LuasKelPersegiPanjang {
    public static void main(String[] args) {
        //deklarasi
        double luas, kel;
        int panjang, lebar;
        
        //membuat scanner baru
        Scanner hitung = new Scanner(System.in);
        
        //input
        System.out.println("****Program Hitung Luas dan Keliling Persegi Panjang");
        System.out.println("Input Panjang : ");
        panjang = hitung.nextInt();
        System.out.println("Input Lebar : ");
        lebar = hitung.nextInt();
        
        //proses
        luas = panjang * lebar;
        kel = 2 * (panjang + lebar);
        
        //output
        System.out.println("Luas Persegi Panjang = " + luas);
        System.out.println("Keliling Persegi Panjang = " + kel);
    }
}
