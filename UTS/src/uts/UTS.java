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
public class UTS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int x = 1;

        do {
            if ((x % 7) == 0) {
                if ((x % 3) == 0) {
                    System.out.println(x + ": Belajar Java Menyenangkan!");
                } else {
                    System.out.println(x + ": Java");
                }
            } else if (x % 3 == 0) {
                    System.out.println(x + ": Belajar");
            }else{
                    System.out.println(x + ": -");
                }
          x++;
    }while (x <= 100);
    }
}

