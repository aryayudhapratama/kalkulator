package com.kalkulator;

public class utamaKalkulator {

    public static void main(String[] args){

        double Penambahan;
        double Pengurangan;
        double Perkalian;
        double Pembagian;


        awalKalkulator kalkulator = new awalKalkulator();
        Penambahan = kalkulator.getPenambahan(10,2);
        Pengurangan = kalkulator.getPengurangan(15.2,2);
        Perkalian = kalkulator.getPerkalian(5,10);
        Pembagian = kalkulator.getPembagian(5,2);

        System.out.println("Hasil penambahan adalah "+Penambahan);
        System.out.println("Hasil pengurangan adalah "+Pengurangan);
        System.out.println("Hasil perkalian adalah "+Perkalian);
        System.out.println("Hasil pembagian adalah "+Pembagian);
    }
}
