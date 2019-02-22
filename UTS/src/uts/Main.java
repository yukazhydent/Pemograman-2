/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts;

import java.util.Scanner;

/**
 *
 * @author Advan
 */
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Program Menghitung Luas Permukaan dan Volume Bangun Ruang");
        System.out.println("=========================================================");
        do{
            System.out.println("Pilih (pilih 0 untuk keluar):");
            System.out.println("1 = Kubus");
            System.out.println("2 = Bola");
            System.out.println("3 = Kerucut");
            System.out.print("Pilihan Anda? (1/2/3/0)");
            int z = s.nextInt();
            switch (z){
                case 1:
                    Kubus kubus = new Kubus();
                    System.out.print("Input nilai sisi dari kubus: ");
                    kubus.setSisi(s.nextDouble());
                    
                    System.out.println("Nilai Luas Permukaan dan Volume dengan sisi: " +kubus.getSisi()+ "cm adalah: ");
                    System.out.println("Luas Permukaan: " +kubus.getLuas()+ "cm persegi");
                    System.out.println("Volume Kubus: " +kubus.getVolume()+ "cm kubik");
                    break;
                case 2:
                    Bola bola = new Bola();
                    System.out.println("Input jari-jari bola: ");
                    bola.setRadius(s.nextDouble());
                    
                    System.out.println("Nilai Luas Permukaan dan Volume dengan jari-jari: " +bola.getRadius()+ "cm adalah: ");
                    System.out.println("Luas Permukaan: " +bola.getLuas()+ "cm persegi");
                    System.out.println("Volume Bola: " +bola.getVolume()+ "cm kubik");
                    break;
                case 3:
                    Kerucut kerucut = new Kerucut();
                    System.out.println("Input jari-jari kerucut: ");
                    kerucut.setRadius(s.nextDouble());
                    System.out.println("Input tinggi kerucut: ");
                    kerucut.setTinggi(s.nextDouble());
                    
                    System.out.println("Nilai Luas Permukaan dan Volume dengan jari-jari: " +kerucut.getRadius()+ "cm dan tinggi " +kerucut.getTinggi()+ " cm adalah: ");
                    System.out.println("Luas Permukaan: " +kerucut.getLuas()+ "cm persegi");
                    System.out.println("Volume Kerucut: " +kerucut.getVolume()+ "cm kubik");
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid/tidak benar");
            }
        System.out.println();
        }while(true);
    }
}
