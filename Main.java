/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kendaraan;
import java.util.Scanner;
/**
 *
 * @author Elemental Hue Bracer
 */
public class Main {
    static boolean isRunning = true;
    
    public static void main(String[] args) {
        Kendaraan bis = new Kendaraan();
        Scanner input = new Scanner(System.in);
        
        do{
            System.out.println("Yang dapat dilakukan:");
            System.out.println("1 => Start\t 4 => Ganti transmisi");
            System.out.println("2 => Gas\t 5 => Stop");
            System.out.println("3 => Rem\t 6 => Exit");
            
            System.out.println("Masukkan opsi pilihan anda");
            int opsi = input.nextInt();
            switch(opsi){
                case 1:
                    bis.start();
                    break;
                case 2:
                    if(bis.isNyala() == false){
                        System.out.println("Mobil dalam keadaan mati!");
                    }else{
                        bis.gas();
                    }
                break;
                case 3:
                    if(bis.isNyala() == false){
                        System.out.println("Mobil dalam keadaan mati!");
                    }else{
                        bis.rem();
                    }
                break;
                case 4:
                    if(bis.isNyala() == false){
                        System.out.println("Mobil dalam keadaan mati!");
                    }else{
                        System.out.println("Masukkan Transmisi:");
                        int gigi = input.nextInt();
                        bis.gantiGigi(gigi);
                    }
                break;
                case 5:
                    bis.stop();
                    break;
                case 6:
                    System.exit(0);
                    break;
                default :
                    System.out.println("Perintah Salah!");
            }
        }while(isRunning);
    }
    
}
