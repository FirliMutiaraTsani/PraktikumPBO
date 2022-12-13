
package com.firlimutiaratsani.praktikumpbo.pertemuan4.kendaraan;


public class Main {
    public static void main(String[] args) {
        //Class object 
        //Class object = new class()
        Mobil mb = new Mobil();
        Kendaraan kn = new Kendaraan();
        
        //Memasukkan nilai attribute
        mb.nama = " Mitsubishi ";
        mb.jmlRoda = 4;
        mb.maxGear= 6;
        
        kn.nama = "Kendaraan misterius";
        kn.jmlRoda = 3;
                
        
        //Uji coba pemanggilan method
        mb.showInfo();
        mb.belok("Kanan");
        mb.belok();
        
        kn.showInfo();
        kn.nyalakanMesin();
        
        
        
    }
    
}
