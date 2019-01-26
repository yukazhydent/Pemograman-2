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
  }
  }