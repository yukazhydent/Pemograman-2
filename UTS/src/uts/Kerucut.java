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
public class Kerucut extends BangunRuang {
    private double radius;
    private double tinggi;

    public Kerucut(double radius, double tinggi) {
        this.radius = radius;
        this.tinggi = tinggi;
    }

    public Kerucut() {
        
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }
    
    

    @Override
    public double getLuas() {
        double s = Math.sqrt(Math.pow(radius, 2) + Math.pow(tinggi, 2));
        double luas = Math.PI * radius * (radius + s);
        return luas;
    }

    @Override
    public double getVolume(){
        double volume = (Math.PI * Math.pow(radius, 2) * tinggi)/3;
        return volume;
    }
    
}
