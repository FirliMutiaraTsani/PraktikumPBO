package com.firlimutiaratsani.praktikumpbo.pertemuan2;//deklarasi package merupakan sebuah folder yang berisi sekumpulan program java

public class Loop { //bagian class agar bisa dibuat menjadi objek
    public static void main(String[] args) { //method main merupakan blok program yang akan dieksekusi pertama kali
        
        // While
    int j = 1;
    while(j <= 100) {
      System.out.println("Loading... (" + j + "%)");
      j += 10;

      if(j == 50) {
        System.out.println("Udah ah, capek!");
        break;
      }
    }
    System.out.println("Looping While selesai! \n");
    }       
}
