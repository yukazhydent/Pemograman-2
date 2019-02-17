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
public class Soal2 {
    public static void main(String[] args) {
        int array [] = {14, 12, 4, 3, 10, 11, 21, 15};
        int s;
        for(int i = 0; i < array.length -1; i++){
        for(int y = 0; y < array.length -1 -i; y++){
            int j = y + 1;
            if(array[y] > array[j]){
               s = array[y];
               array[y] = array[j];
               array[j] = s;
            }
        }
    }
        for(int y = 7; y > 4; y--){
            System.out.println(array[y]);
        }
}
}
