/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import static jdk.nashorn.tools.ShellFunctions.input;

/**
 *
 * @author Advan
 */
public class TugasIO {

    public static void tambahData() {

        Scanner k = new Scanner(System.in);
        try {
            FileOutputStream z = new FileOutputStream("addressbook.dat", true);

            System.out.print("Masukkan Nama: ");
            String nama = k.nextLine() + "\t";

            System.out.print("Masukkan Alamat: ");
            String alamat = k.nextLine() + "\t";

            System.out.print("Masukkan Nomer Telepon: ");
            String hp = k.nextLine() + "\t";

            System.out.print("Masukkan Email: ");
            String email = k.nextLine() + "\n";

            z.write(nama.getBytes());
            z.write(alamat.getBytes());
            z.write(hp.getBytes());
            z.write(email.getBytes());
            z.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void openFile() throws IOException {
        try {
            FileInputStream input = new FileInputStream("addressbook.dat");
            int data;
            while ((data = input.read()) != -1) {
                System.out.print((char) data);
            }

            input.close();

        } catch (IOException e) {
            System.out.println("Buku Alamat Tidak Ada");
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        Scanner k = new Scanner(System.in);
        while (true) {
            System.out.println("=====WELCOME TO ADDRESS BOOKS=====");
            System.out.println("apa yang akan anda lakukan?");
            System.out.println("1 => Menambah Data pada Buku Alamat\n" + "2 => Menampilkan Data pada Buku Alamat\n" + "3 => Keluar");
            System.out.print("Pilihan Anda");
            int opsi = k.nextInt();
            switch (opsi) {

                case 1:
                    tambahData();
                    break;
                case 2:
                    openFile();
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Masukkan anda salah");
                    break;
            }
            System.out.println();
            System.out.println();
        }
    }
}


