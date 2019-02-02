/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bukualamat;
import bukualamat.Buku.buku;
import java.util.Scanner;
/**
 *
 * @author Elemental Hue Bracer
 */
public class BukuAlamat {
Buku d = new Buku();
Scanner s = new Scanner(System.in);
String[][] data = new String[150][4];

private void input(String nama, String alamat, String telepon, String email){
    d.setNama(nama);
    d.setAlamat(alamat);
    d.setTelepon(telepon);
    d.setEmail(email);
}
private void insert(int ind1){
    data[ind1-1][0] = d.getNama();
    data[ind1-1][1] = d.getAlamat();
    data[ind1-1][2] = d.getTelepon();
    data[ind1-1][3] = d.getEmail();
}
private void update(int ind1, int ind2, String update){
    data[ind1-1][ind2-1] = update;
}
private void delete(int ind1){
    data[ind1-1][0] = null;
    data[ind1-1][1] = null;
    data[ind1-1][2] = null;
    data[ind1-1][3] = null;
}
private void show(){
    for(int i = 0; i < 150; i++){
        System.out.println((i+1)+" => "+data[i][0]+"\t"+data[i][1]+"\t"+data[i][2]+"\t"+data[i][3]);
    }
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
