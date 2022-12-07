/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment_topik6_soal1;

/**
 *
 * @author Agung Isra
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Lingkaran dengan jejari 7");
        System.out.printf("Keliling     : %.2f \n", kelilingLingkaran(7));
        System.out.printf("Luas         : %.2f \n", luasLingkaran(7));
        
        System.out.println("Lingkaran dengan jejari 5,5");
        System.out.printf("Keliling     : %.2f \n", kelilingLingkaran(5.5f));
        System.out.printf("Luas         : %.2f \n", luasLingkaran(5.5f));
        
        System.out.println("Lingkaran dengan diameter 20.4");
        System.out.printf("Keliling     : %.2f \n", kelilingLingkaran(20.4));
        System.out.printf("Luas         : %.2f \n", luasLingkaran(20.4));
        
        

    }
    
    private static double kelilingLingkaran(float j){
        double phi, keliling;
        phi = 3.14;
        keliling = phi * (2*j);
        return keliling;
    }
    
    private static double kelilingLingkaran(double d){
        double phi, keliling;
        phi = 3.14;
        keliling = phi * d;
        return keliling;
    }
    
    private static double luasLingkaran(float j){
        double phi, luas;
        phi = 3.14;
        luas = phi * j * j;
        return luas;
    }
    
    private static double luasLingkaran(double d){
        double phi, luas, j;
        phi = 3.14;
        j = d/2;
        luas = phi * j * j;
        return luas;
    }
   
}
