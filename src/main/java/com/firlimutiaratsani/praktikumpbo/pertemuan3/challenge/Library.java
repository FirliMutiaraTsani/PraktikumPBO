
package com.firlimutiaratsani.praktikumpbo.pertemuan3.challenge;
//deklarasi package merupakan sebuah folder yang berisi sekumpulan program java

public class Library { //bagian class agar bisa dibuat menjadi objek
    private String name;
    private int visitorsToday;
    private int yearBuilt; 

    public Library (){}
    
    public Library (String name, int visitorsToday, int yearBuilt) {
        this.name = name;
        this.visitorsToday = visitorsToday;
        this.yearBuilt = yearBuilt;
    }
    public void showProfile (){ 
    //method main merupakan blok program yang akan dieksekusi
        System.out.println("Name : " + name);
        System.out.println("VisitorsToday : " + visitorsToday);
        System.out.println("YearBuilt : " + yearBuilt);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVisitorsToday() {
        return visitorsToday;
    }

    public void setVisitorsToday(int visitorsToday) {
        this.visitorsToday = visitorsToday;
    }

    public int getYearBuilt() {
        return yearBuilt;
    }

    public void setYearBuilt(int yearBuilt) {
        this.yearBuilt = yearBuilt;
    }
    
    
    
}
