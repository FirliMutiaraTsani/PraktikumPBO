
package com.firlimutiaratsani.praktikumpbo.pertemuan3.animal;
//deklarasi package merupakan sebuah folder yang berisi sekumpulan program java


public class Animal { //bagian class agar bisa dibuat menjadi objek 
    //Attribute
    private String name;
    private int age;
    private String color;
    
    //Constructor
    public Animal(){}
    
    //[Alt] + (Fn) + [Insert] -> Constructor -> Select All

    public Animal(String name, int age, String color) {
        this.name = name ;
        this.age = age;
        this.color = color;
    }
   
    
    //Method mencetak semua attribute
    public void showProfile(){ 
//method main merupakan blok program yang akan dieksekusi
        System.out.println("Name : " + name);
        System.out.println("Age : " + age + "years old");
        System.out.println("Color : " + color);
    }
    //[Alt] + (Fn) + [Insert] -> Getter & Setter -> Select All

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
