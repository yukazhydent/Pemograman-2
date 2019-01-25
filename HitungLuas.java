import java.util.Scanner;
public class HitungLuas{
  public static void luasPersegiPanjang() {
          int panjang;
          int lebar;
          int luas;
          Scanner masukkan = new Scanner(System.in);

          System.out.print("Masukan panjang: ");
          panjang = masukkan.nextInt();

          System.out.print("Masukan Lebar: ");
          lebar = masukkan.nextInt();

          luas = panjang * lebar;

          System.out.println("Luas dari persegi panjang dari panjang " + panjang + " cm dan lebar " + lebar + " cm adalah " + luas);
          System.out.println("");
}

}
