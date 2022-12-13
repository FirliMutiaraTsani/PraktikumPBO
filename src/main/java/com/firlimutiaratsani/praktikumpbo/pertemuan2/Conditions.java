package com.firlimutiaratsani.praktikumpbo.pertemuan2;//deklarasi package merupakan sebuah folder yang berisi sekumpulan program java

import java.util.Scanner;// impor library merupakan sekumpulan class dan fungsi yang bisa digunakan dalam membuat program

public class Conditions { //bagian class agar bisa dibuat menjadi objek
    public static void main(String[] args) { //method main merupakan blok program yang akan dieksekusi pertama kali
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan bilangan bulat : ");
        int bilangan = input.nextInt();
        
        if(bilangan > 0)
            System.out.print(bilangan + " adalah bilangan positif!");
        
        else if(bilangan < 0)
            System.out.print(bilangan + " adalah bilangan negatif!");
        
        else 
            System.out.print(bilangan + " adalah nol!");
        
        
    }
    
}
