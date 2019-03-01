/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan;

import java.io.FileOutputStream;
import java.util.Scanner;

/**
 *
 * @author Advan
 */
public class Latihan1 {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner c = new Scanner(System.in);
        System.out.println("Nama : Bayu Pamungkas ");
        System.out.println("NPM : 1841801 ");
        System.out.println("Jurusan : Sistem Informasi ");
        try {
            FileOutputStream output = new FileOutputStream("Latihan.dat");
            System.out.println("Masukan Data: ");
            output.write(c.next().getBytes());
            output.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
