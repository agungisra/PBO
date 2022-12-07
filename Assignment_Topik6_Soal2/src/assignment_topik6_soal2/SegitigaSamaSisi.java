/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment_topik6_soal2;

/**
 *
 * @author Agung Isra
 */
public class SegitigaSamaSisi {

    private int sisi;

    public SegitigaSamaSisi(int sisi) {
        this.sisi = sisi;
    }

    public void kelilingSegitiga() {
        int keliling = sisi * 3;
        System.out.println("\nKeliling segitiga: " + keliling);
    }

    public void luasSegitiga() {
        double tinggi = Math.sqrt(sisi * sisi - (sisi / 2 * sisi / 2));
        double luas = (sisi * tinggi) / 2;

        System.out.printf("\nLuas segitiga: %.2f", luas);
    }

    class Main {

        public static void main(String[] args) {
            SegitigaSamaSisi s1 = new SegitigaSamaSisi(3);
            
            s1.luasSegitiga();
            s1.kelilingSegitiga();
        }
    }
}