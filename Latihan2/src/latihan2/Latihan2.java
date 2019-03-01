/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan2;

import java.io.FileInputStream;

/**
 *
 * @author Advan
 */
public class Latihan2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            FileInputStream input = new FileInputStream("lirik.txt");
            int s;
            while ((s = input.read()) != -1) {
                if (s == 32) {
                    System.out.print("_");
                } else {
                    System.out.print((char) s);
                }
            }
            input.close();

        } catch (Exception e) {
            e.printStackTrace();

        }

    }
}
