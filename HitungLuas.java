import java.util.Scanner;
public class HitungLuas{
  Scanner s = new Scanner(System.in);
  public HitungLuas(){
  cariLuasLingkaran();
}
  public void cariLuasLingkaran(){
      System.out.println("Kita akan menghitung luas lingkaran!");
      System.out.println("Masukan nilai dari Jari-jari:");
      int jari = s.nextInt();

      double luasLingkaran = (double)Math.pow(jari, 2) * 3.14;
      System.out.println("Berikut luas Lingkaran dengan  Jari-jari = " + jari + ":");
      System.out.println(luasLingkaran);
}

}
