/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.id.stmikamik;

/**
 *
 * @author user-4
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Circle s = new Circle(50, "Bola Voli");
        System.out.println("Nama benda: " +s.getName());
        System.out.println("Radius benda: " +s.getRadius());
        System.out.println("Luasnya: " +s.getArea());
        
        Rectangle b =  new Rectangle("Balok", 20, 15);
        System.out.println("Nama Persegi Panjang: " +b.getName());
        System.out.println("Panjang benda: " +b.getLength());
        System.out.println("Lebar benda: " +b.getWidth());
        System.out.println("Luasnya: " +b.getArea());
    }
    
}
