import java.util.Scanner;
public class HitungLuas{
  Scanner s = new Scanner(System.in);
  public HitungLuas(){
  cariLuasPersegiPanjang();
  cariLuasLingkaran();
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
  public void cariLuasLingkaran(){
      System.out.println("Kita akan menghitung luas lingkaran!");
      System.out.println("Masukan nilai dari Jari-jari:");
      int jari = s.nextInt();

      double luasLingkaran = (double)Math.pow(jari, 2) * 3.14;
      System.out.println("Berikut luas Lingkaran dengan  Jari-jari = " + jari + ":");
      System.out.println(luasLingkaran);
}
public static void main(String[] args) {
  new HitungLuas();
}
}
