import java.util.Scanner;

public class Latihan1{
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Masukan nilai Mahasiswa (A/B/C/D/E):");
    String nilai = s.next();
    String ket = "";
    switch (nilai) {
      case "A":
        ket = "Excellent!";
        break;
      case "B":
        ket = "Good job!";
        break;
      case "C":
        ket = "Study Harder!";
        break;
      default:
        ket = "Sorry, you failed.";
        break;
    }
    System.out.println("Comment: "+ket);
	
	System.out.println("Masukkan tiga nilai ujian anda untuk dihitung rata-ratanya:");
    int nilai1 = s.nextInt();
    int nilai2 = s.nextInt();
    int nilai3 = s.nextInt();

    double eva = (double)(nilai1+nilai2+nilai3)/3;
    if (eva >= 60) {
      System.out.println("Nilai rata-rata ujian anda adalah "+eva+", Congratulations :D");
    }else{
      System.out.println("Nilai rata-rata ujian anda adalah "+eva+", Belajar lebih baik lagi :(");
  }
  }