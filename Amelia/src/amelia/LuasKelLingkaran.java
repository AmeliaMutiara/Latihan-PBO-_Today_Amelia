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
public class LuasKelLingkaran {
    public static void main(String[] args) {
        //deklarasi
        double luas, kel, PI;
        int r;
        
        //membuat sacnner baru
        Scanner hitung = new Scanner(System.in);
        
        //input
        System.out.println("****Program Hitung Luas Dan Keliling Lingkaran");
        System.out.println("Input Jari - jari : ");
        r = hitung.nextInt();
        
        //proses
        PI = 3.14;
        luas = PI * r * r;
        kel = 2 * PI * r;
        
        //output
        System.out.println("Luas Lingkaran = " + luas);
        System.out.println("Keliling Lingkaran = " + kel);
    }
}
