package com.firlimutiaratsani.praktikumpbo.pertemuan5;


public class Array2 {
    public static void main(String[] args) {
        //pembuatan array
        String[] names = {
            "Firli",
            "Thunder",
            "Storm"
        };
    
       //cek panjang array
        System.out.println("Panjang array : " + names.length);
        
        //memasukkan nilai ke array
        names[0] = "Firli";
        names[1] = "Thunder";
        names[2] = "Storm";
        
        //menampilkan semua nilai array
        for(int i=0; i<names.length; i++){
            System.out.println(i + ": " + names[i]);
        }
    }
    
}
