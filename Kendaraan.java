/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kendaraan;

/**
 *
 * @author Elemental Hue Bracer
 */
public class Kendaraan {
    private boolean Nyala;
    private int KecepatanAktual;
    private int Percepatan;
    private final int KecepatanMaksimal;
    
    public boolean Nyala(){
        return Nyala;
    }

    public Kendaraan(){
        Nyala = false;
        KecepatanAktual = 0;
        Percepatan = 0;
        KecepatanMaksimal = 200;
    }
    
    public void stop(){
        if(KecepatanAktual == 0){
            this.Nyala = false;
            System.out.println("Mobil berhenti dan dimatikan!");
        }else{
            System.out.println("Mobil masih bergerak!");
        }
    }
    
    public void rem(){
        if(KecepatanAktual != 0){
            this.Nyala = false;
            System.out.println("Direm -> Kecepatan saat ini: " +KecepatanAktual);
        }else{
            System.out.println("Mobil dalam keadaan diam");
        }
    }
    
    public void gantiGigi(int gigi){
        this.Percepatan = gigi*15;
        System.out.println("Transmisi saat ini: " +gigi);
        System.out.println("Percepatan saat ini: " +Percepatan);
    }
    
    public void gas(){
        if(Percepatan != 0){
            if(KecepatanAktual >= KecepatanMaksimal){
                System.out.println("Kecepatan anda sudah maksimal!");
                System.out.println("Kecepatan saat ini: " +KecepatanAktual);
            }else{
                this.KecepatanAktual = KecepatanAktual + Percepatan;
                System.out.println("Digas -> Kecepatan saat ini: " +KecepatanAktual);
            }
        }else{
                System.out.println("Masukkan transmisi terlebih dahulu");
            }
        }
    }
    