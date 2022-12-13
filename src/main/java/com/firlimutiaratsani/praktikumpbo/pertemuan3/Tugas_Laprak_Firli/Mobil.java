package com.firlimutiaratsani.praktikumpbo.pertemuan3.Tugas_Laprak_Firli;

public class Mobil { 
    String warna = "Putih";
    String merk = "Jazz";
    
    void maju (){
        System.out.println(" Mobil " + merk + " warna " + warna + " bergerak maju ");
    }
    
    void mundur () {
        System.out.println(" Mobil " + merk + " warna" + warna + " bergerak mundur ");
    }
    
    public static void main(String[] args){
//membuat object mobil

Mobil mobilSaya = new Mobil();

//untuk memanggil object

mobilSaya.maju();
mobilSaya.mundur();

    }
}




