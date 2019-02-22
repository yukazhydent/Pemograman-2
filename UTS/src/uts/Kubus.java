/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts;

/**
 *
 * @author Advan
 */
public class Kubus extends BangunRuang{

    private double sisi;

    public Kubus(double sisi) {
        this.sisi = sisi;
    }

    public Kubus() {
    }
    

    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }
    
    
    
    @Override
    public double getLuas() {
        double luas = 6 * Math.pow(getSisi(), 2);
        return luas;
    }

    @Override
    public double getVolume() {
        double volume = Math.pow(getSisi(), 3);
        return volume;
    }
    
}
