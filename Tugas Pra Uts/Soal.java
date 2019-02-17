/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

/**
 *
 * @author Advan
 */
public class Soal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Employee boss = new Manager(12000000, "Bayu", "Jl.Maleber Utara no.160", 100000000);
        Employee staff1 = new Staff("Ilham", "jl.Kolong Jembatan", 25000000);
        Employee staff2 = new Staff("Kiki", "jl.Kolong Kasur", 20000000);
        
        System.out.println("nama boss : " +boss.getName());
        System.out.println("alamat boss : " +boss.getAddress());
        System.out.println("gaji boss : " +boss.getSalary());
        System.out.println("nama staff1 : " +staff1.getName());
        System.out.println("alamat staff1 : " +staff1.getAddress());
        System.out.println("gaji staff1 : " +staff1.getSalary());
        System.out.println("nama staff2 : " +staff2.getName());
        System.out.println("alamat staff2 : " +staff2.getAddress());
        System.out.println("gaji staff2 : " +staff2.getSalary());
                
    }
    
}
