/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment_topik7topik8;

/**
 *
 * @author Agung Isra
 */
public class Main {
    public static void main(String[] args) {
        Dress dress = new Dress("Piyama");
        Trousers tros = new Trousers("Satin");
        
        //Dress
        System.out.println("\n--Dress---");
        dress.stok();
        System.out.println("Stoknya sekarang " + dress.stokTersedia());
        System.out.println("Dijual 50");
        dress.jualProduk(50);
        
        //Trousers
        System.out.println("\n---Trousers---");
        tros.stok();
        System.out.println("Stoknya sekarang " + tros.stokTersedia());
        System.out.println("Dijual 50");
        tros.jualProduk(50);
    }
}
