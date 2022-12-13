
package com.firlimutiaratsani.praktikumpbo.pertemuan3.animal;
//deklarasi package merupakan sebuah folder yang berisi sekumpulan program java

public class Main { //bagian class agar bisa dibuat menjadi objek
    //'main' + [Tab]
    public static void main(String[] args) { 
//method main merupakan blok program yang akan dieksekusi
        //Membuat object dari class animal
        Animal cat = new Animal("kuki",3,"white");
        Animal dog = new Animal("blacky", 4,"brown");
        Animal rabbit = new Animal();
        
        //Memanggil Method
        cat.showProfile ();
        dog.showProfile ();
        rabbit.showProfile ();
        
        //Demo Getter&Setter
        System.out.println("Dog's name (before) :" + dog.getName());
        System.out.println("blacky");
        System.out.println("Dog's name (after) : " + dog.getName());
        
        
    }
    
}
