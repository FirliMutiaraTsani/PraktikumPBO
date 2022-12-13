package com.firlimutiaratsani.praktikumpbo.pertemuan5;

import java.util.Scanner;


public class DynamicArray {
    public static void main(String[] args) {
        //deklarasi scanner utk user input nanti
        Scanner input = new Scanner(System.in);
        
        int i, n;
        float jml, x, rata;
        System.out.println("Banyaknya Data : ");
        n = input.nextInt();
        jml = 0;
        i=1;
        while (i<=n){
            System.out.println("Data ke-" + i + ": ");
            x = input.nextFloat();
            jml = x;
            i++;
        }
        rata = jml / n;
        System.out.println("Rata-Rata : " + rata);
        System.out.println("Jumlah : " + jml);
        
        
        }
    }
    

