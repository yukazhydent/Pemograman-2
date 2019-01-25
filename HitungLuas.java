import java.util.Scanner;
public class HitungLuas {
  Scanner s = new Scanner(System.in);

  public HitungLuas(){
    cariLuasPersegiPanjang();
  }

  public void cariLuasPersegiPanjang(){
    System.out.println("Kita akan menghitung luas Persegi Panjang!");
    System.out.println("Masukan nilai dari Panjang:");
    int panjang = s.nextInt();
    System.out.println("Masukan nilai dari Lebar:");
    int lebar = s.nextInt();

    int luasPersegiPanjang = panjang * lebar;
    System.out.println("Berikut luas Persegi Panjang dengan panjang = " + panjang + " dan lebar = " + lebar + ":");
    System.out.println(luasPersegiPanjang);
  }
public static void main(String[] args) {
  new HitungLuas();
}
}
