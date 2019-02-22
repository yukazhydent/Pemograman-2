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
public class Bola extends BangunRuang {
    private double radius;
    

    public Bola(double radius) {
        this.radius = radius;
    }
    public Bola(){
        
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getLuas(){
        double luas = 4 * Math.PI * Math.pow(radius, 2);
        return luas;
    }

    @Override
    public double getVolume() {
        double volume = (4 * Math.PI * Math.pow(radius, 3))/3;
        return volume;
    }
    
    
}
