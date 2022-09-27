/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projectpertama;

import java.util.Scanner;

/**
 *
 * @author Iis
 */
public class ProjectPertama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         //TODO code application logic here
        String nik, nama, tmptLahir, tglLahir, alamat, jKel;
        int usia;
        Scanner in = new Scanner(System.in);
        System.out.print("Masukan NIK = ");
        nik = in.nextLine();
        System.out.print("Masukan Nama = ");
        nama = in.nextLine();
        System.out.print("Masukan Tempat Lahir = ");
        tmptLahir = in.nextLine();
        System.out.print("Masukan Tanggal Lahir = ");
        tglLahir = in.nextLine();
        System.out.print("Masukan Alamat = ");
        alamat = in.nextLine();
        System.out.print("Masukan Jenis Kelamin [L/P] = ");
        jKel = in.next();
        System.out.print("Masukan usia = ");
        usia = in.nextInt();
        System.out.println("Identitas Pribadi");
        System.out.println("=================");
        System.out.println("Nik = " + nik);
        System.out.println("Nama = " + nama);
        System.out.println("Tempat, Tanggal Lahir = " 
                + tmptLahir + tglLahir);
        System.out.println("Alamat = " + alamat);
        System.out.println("Usia = " + usia);
        System.out.println("Jenis Kelamin" +jKel);
        
    }
    
}
