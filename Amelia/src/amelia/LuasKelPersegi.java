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
public class LuasKelPersegi {
    public static void main(String[] args) {
        //deklarasi
        double luas, kel;
        int sisi;
        
        //membuat scanner baru
        Scanner hitung = new Scanner(System.in);
        
        //input
        System.out.println("****Program Hitung Luas dan Keliling Persegi");
        System.out.println("Input Sisi : ");
        sisi = hitung.nextInt();
        
        //proses
        luas = sisi * sisi;
        kel = 4 * sisi;
        
        //output
        System.out.println("Luas Persegi Panjang = " + luas);
        System.out.println("Keliling Persegi Panjang = " + kel);
    }
}
