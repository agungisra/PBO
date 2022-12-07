/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment_topik7topik8;

import java.util.Scanner;

/**
 *
 * @author Agung Isra
 */
public class Dress extends Pakaian implements Penjualan {

    private String model;

    public Dress(String model) {
        this.model = model;
    }

    @Override
    public void stok() {
        Scanner in = new Scanner(System.in);

        System.out.println("Input ukuran");
        ukuran = in.next().charAt(0);
        System.out.println("Input warna");
        warna = in.next();
        System.out.println("Input harga");
        harga = in.nextInt();
        System.out.println("Input stok");
        stok = in.nextInt();
    }

    @Override
    public int stokTersedia() {
        return stok;
    }

    @Override
    public int totalPenjualan(int qty) {
        int penjualan = qty * harga;
        return penjualan;
    }

    @Override
    public void jualProduk(int qty) {
        int sisaProduk = stokTersedia()-qty;
        
        System.out.println("Sisa Produk saat ini: " + sisaProduk);
        System.out.println("Total Penjualan: "+ totalPenjualan(qty));
    }
}
