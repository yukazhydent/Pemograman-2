/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

import java.util.Scanner;

/**
 *
 * @author Advan
 */
public class Soal1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Input koordinat x lingkaran 1:");
        int x1 = input.nextInt();
        System.out.println("Input koordinat y lingkaran 1:");
        int y1 = input.nextInt();
        System.out.println("Input jari-jari lingkaran 1:");
        int r1 = input.nextInt();

        System.out.println("Input koordinat x lingkaran 2:");
        int x2 = input.nextInt();
        System.out.println("Input koordinat y lingkaran 2:");
        int y2 = input.nextInt();
        System.out.println("Input jari-jari lingkaran 2:");
        int r2 = input.nextInt();

        int jarak = (int) Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));

        if (jarak >= (r1 + r2)) {
            System.out.println("C1 dan C2 saling lepas");
        } else if (jarak < (r1 + r2)) {
            if (r1 < r2) {
                if (((x1 + r1) < (x2 + r2)) && ((x1 - r1) > (x2 - r2))) {
                    if (((y1 + r1) < (y2 + r2)) && ((y1 - r1) > (y2 - r2))) {
                        System.out.println("C1 berada di dalam C2");
                    } else {
                        System.out.println("C1 dan C2 saling beririsan");
                    }
                } else {
                    if (((y1 + r1) < (y2 + r2)) && ((y1 - r1) > (y2 - r2))) {
                        System.out.println("C1 berada di dalam C2");
                    } else {
                        System.out.println("C1 dan C2 saling beririsan");
                    }
                }
            } else {
                if (((x1 + r1) > (x2 + r2)) && ((x1 - r1) < (x2 - r2))) {
                    if (((y1 + r1) > (y2 + r2)) && ((y1 - r1) < (y2 - r2))) {
                        System.out.println("C2 berada di dalam C1");
                    } else {
                        System.out.println("C1 dan C2 saling beririsan");
                    }
                } else {
                    if (((y1 + r1) > (y2 + r2)) && ((y1 - r1) < (y2 - r2))) {
                        System.out.println("C2 berada di dalam C1");
                    } else {
                        System.out.println("C1 dan C2 saling beririsan");
                    }
                }
            }
        }
    }
}
