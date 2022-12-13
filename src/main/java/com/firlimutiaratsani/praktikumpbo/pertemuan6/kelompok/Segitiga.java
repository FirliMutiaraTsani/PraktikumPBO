package com.firlimutiaratsani.praktikumpbo.pertemuan6.kelompok;

public class Segitiga extends Bentuk2D{
    private double alas, tinggi;
    
    public Segitiga(double alas, double tinggi){
        this.alas = alas;
        this.tinggi = tinggi;
        
    }
    public double luas(){
        return (alas*tinggi)/2;
    }
    public double keliling(){
        double miring = Math.sqrt((alas*alas) + (tinggi*tinggi));
        return 2* (alas+tinggi+miring);
    }
    
}
