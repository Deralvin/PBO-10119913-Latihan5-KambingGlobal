/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan5kambingglobal;

/**
  * @author Muhammad Alvin Rizqi Ramadhan
 * @author NIM 10119913
 * Kelas : IF10K
 * Deskripsi Program : Program Class Kambing Static
 */
public class PBO1010119913KambingGlobal {
    //Variable Jumlah Kambing menjadi variable instance
    int jumlahKambing = 88;
    
    //method menampilkan jumlah kambing
    public void getJumlahKambing(){
        System.out.println("Jumlah Kambing: "+jumlahKambing);
    }
    
   
    public void tambahKambing(){
        jumlahKambing = jumlahKambing + 5;
        System.out.println("Jumlah Kambing setelah ditambah: "+jumlahKambing);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PBO1010119913KambingGlobal kambingSusu = new PBO1010119913KambingGlobal();
   
        //menampilkan jumlah kambing yang ada saat program pertama kali berjalan
        kambingSusu.getJumlahKambing();
        
        //menambah satu kambing
        kambingSusu.tambahKambing();
        
        //menambahkan jumlah kambing yang ada
        kambingSusu.getJumlahKambing();
        
    }
    
}
