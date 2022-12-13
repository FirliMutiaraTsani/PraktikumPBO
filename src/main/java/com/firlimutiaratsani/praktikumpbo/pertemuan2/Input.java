
package com.firlimutiaratsani.praktikumpbo.pertemuan2; //deklarasi package merupakan sebuah folder yang berisi sekumpulan program java

import java.util.Scanner;// impor library merupakan sekumpulan class dan fungsi yang bisa digunakan dalam membuat program

public class Input { //bagian class agar bisa dibuat menjadi objek
    public static void main(String[] args) { //method main merupakan blok program yang akan dieksekusi pertama kali
        String nama, jurusan;
        int nim;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("---Halaman Login Mahasiswa---");
        System.out.print("Nama Mahasiswa : ");
        nama = input.nextLine();
        
        System.out.print("Jurusan : ");
        jurusan = input.nextLine ();
        
        System.out.print("Nim : ");
        nim = input.nextInt ();
        
        System.out.println("---------------");
        System.out.println("Nama Mahasiswa : " + nama);
        System.out.println("Jurusan : " + jurusan);
        System.out.println("NIM :" + nim);
    }
    
}
