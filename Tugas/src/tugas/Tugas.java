/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas;
import java.util.Scanner;
import tugas.source.Buku;
/**
 *
 * @author Elemental Hue Bracer
 */
public class Tugas {
static Buku d = new Buku();
static Scanner s = new Scanner(System.in);
static String[][] data = new String[150][4];

private static void input(String nama, String alamat, String telepon, String email){
    d.setNama(nama);
    d.setAlamat(alamat);
    d.setTelepon(telepon);
    d.setEmail(email);
}

@SuppressWarnings("UnnecessaryContinue")
private static void insert(){
    if (data[0][0] == null){
    data[0][0] = d.getNama();
    data[0][1] = d.getAlamat();
    data[0][2] = d.getTelepon();
    data[0][3] = d.getEmail();
    }else{
        for(int i = 0; i < 150; i++){
            if(data[i][0] != null){
                continue;
            }else{
               data[i][0] = d.getNama();
               data[i][1] = d.getAlamat();
               data[i][2] = d.getTelepon();
               data[i][3] = d.getEmail();
               break;
            }
        }
    }
}
private static void update(int ind1, int ind2, String update){
    data[ind1-1][ind2-1] = update;
}
private static void delete(int ind1){
    for(int i = (ind1-1); i < 149; i++){
    data[i][0] = data[i+1][0];
    data[i][1] = data[i+1][1];
    data[i][2] = data[i+1][2];
    data[i][3] = data[i+1][3];
}
data[149][0] = null;
data[149][1] = null;
data[149][2] = null;
data[149][3] = null;
}
private static void show(){
    int i = 0;
    if(data[i][0] == null){
        System.out.println("data masih kosong");
    }else{
        System.out.println("Berikut data yang sudah terkumpul:");
        while(data[i][0] != null){
        System.out.println((i+1)+" =>\t"+data[i][0]+"\t"+data[i][1]+"\t"+data[i][2]+"\t"+data[i][3]);
        i++;
}
        System.out.println("Jumlah data: "+i);
}
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        do{
            System.out.println("Selamat Datang!");
            System.out.println("Silahkan pilih salah satu opsi berikut:");
            System.out.println("1 => Insert Data\t3 => Delete Data");
            System.out.println("2 => Update Data\t4 => Show Data");
            System.out.println("Untuk menghentikan program masukan 0.");
            int opsi = s.nextInt();
        
            switch(opsi){
                case 1:
                    System.out.println("Silahkan masukan data:");
                    System.out.print("Nama:\t\t");
                    String nama = s.next();
                    System.out.print("Alamat:\t\t");
                    String alamat = s.next();
                    System.out.print("No.Telepon:\t");
                    String telepon = s.next();
                    System.out.print("E-mail:\t\t");
                    String email = s.next();
                    input(nama, alamat, telepon, email);
                    System.out.println("Sedang memproses...");
                    insert();
                    System.out.println("Selesai...");
                    break;
                case 2:
                    if(data[0][0] != null){
                        System.out.println("Sebaiknya menjalankan dulu Show data sebelum merubah, masih ingin melanjutkan?(y/n)");
                        String y = s.next();
                        if(y.equalsIgnoreCase("y")){
                            System.out.println("Silahkan masukan no. urut data yang akan dirubah");
                            int j = s.nextInt();
                            System.out.println("Data diambil...");
                    
                            System.out.println("Masukan data mana yang akan dirubah:");
                            System.out.println("1. Nama\t2. Alamat\t3. No. Telepon\t4. Email");
                            int k = s.nextInt();
                            System.out.println("Data diambil...");
                    
                            System.out.println("Masukan data yang baru:");
                            String update = s.next();
                            System.out.println("Memproses....");
                            update(j, k, update);
                            System.out.println("Selesai...");
                        } else {
                            break;
                        }
                    } else {
                        System.out.println("Data Kosong! Tidak ada yang bisa dirubah!");
                    }
                    break;
                case 3:
                    if(data[0][0] == null){
                        System.out.println("Data masih kosong!");
                    } else {
                        System.out.println("Masukan nomor urut data yang akan dihapus:");
                        int u = s.nextInt();
                        delete(u);
                    }
                    break;
                case 4:
                    show();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opsi tidak sesuai!");
            }
            System.out.println();
        } while(true);
    }
}
