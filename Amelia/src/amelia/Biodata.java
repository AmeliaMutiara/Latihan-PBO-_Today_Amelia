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
public class Biodata {
    public static void main(String[] args) {
        String nama, alamat, sekolah;
        int usia, kelas;
        
        Scanner biodata = new Scanner(System.in);
        
        //menampilkan output ke user
        System.out.println("----Data Diri----");
        System.out.println("Nama Anda : ");
        
        //membuar variabel untuk menyimpan data yang diketik
        nama = biodata.nextLine();
        System.out.println("Alamat Anda : ");
        alamat = biodata.nextLine();
        System.out.println("Sekolah Anda : ");
        sekolah = biodata.nextLine();
        System.out.println("Usia Anda : ");
        usia = biodata.nextInt();
        System.out.println("Kelas Anda : ");
        kelas = biodata.nextInt();
        
        //menampilkan apa yang sudah disimpan dalam variabel
        System.out.println("-----------");
        System.out.println("Nama : " +nama);
        System.out.println("Alamat : " +alamat);
        System.out.println("Umur : "+usia);
        System.out.println("Kelas : " +kelas);
    }
}
