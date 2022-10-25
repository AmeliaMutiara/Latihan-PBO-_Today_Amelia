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
public class LuasKelBalok {
    public static void main(String[] args) {
        //deklarasi
        double luas, kel;
        int panjang, lebar, tinggi;
        
        //membuat scanner baru
        Scanner hitung = new Scanner(System.in);
        
        //input
        System.out.println("****Program Hitung Luas Permukaan dan Keliling Balok");
        System.out.println("Input Panjang : ");
        panjang = hitung.nextInt();
        System.out.println("Input Lebar : ");
        lebar = hitung.nextInt();
        System.out.println("Input Tinggi :");
        tinggi = hitung.nextInt();
        
        //proses
        luas = 2 * (panjang * lebar + tinggi * lebar + panjang * tinggi);
        kel = 4 * (panjang + lebar + tinggi);
        
        //output
        System.out.println("Luas Permukaan Balok = " + luas);
        System.out.println("Keliling Balok = " + kel);
    }
}
