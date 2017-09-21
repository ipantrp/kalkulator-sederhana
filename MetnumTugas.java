/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metnumtugas;

/**
 *
 * @author I P A N
 */
import com.sun.org.apache.bcel.internal.generic.GOTO;
import javax.swing.*;
import java.util.Scanner;
public class MetnumTugas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        int a, b;
        System.out.println("Menu Pilihan : ");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Pembagian");
        System.out.println("5. Pemangkatan");
        System.out.println("6. Deret f(x) = 2X^2 - 4X + 1");
        
        String pilihan = JOptionPane.showInputDialog("Masukkan pilihan anda ( 1 - 6) : ");
        int pilih = Integer.parseInt(pilihan);
        System.out.println("Masukkan nilai A : ");
        a = id.nextInt();
        System.out.println("Masukkan nilai B : ");
        b = id.nextInt();
        
        switch(pilih){
            case 1 : {
                int jumlah = a + b;
                System.out.println("Hasil penjumlahan antara "+a+" dan "+b+" adalah : "+jumlah);
                break;
            }
            case 2 : {
                int jumlah = a - b;
                System.out.println("Hasil pengurangan antara "+a+" dan "+b+" adalah : "+jumlah);
                break;
            }
            case 3 : {
                int jumlah = a * b;
                System.out.println("Hasil perkalian antara "+a+" dan "+b+" adalah : "+jumlah);
                break;
            }
            case 4 : {
                if(b == 0){
                    System.out.print("nilai b tidak boleh 0");
                }
                else{
                    double jumlah = a / b;
                System.out.println("Hasil pembagian antara "+a+" dan "+b+" adalah : "+jumlah);
                }
                break;
            }
            case 5 : {
                int i, jumlah = 1;
                for(i = 1; i <= b; i++){
                    jumlah = jumlah * a;
                }
                System.out.println("Hasil pemangkatan antara "+a+" dan "+b+" adalah : "+jumlah);
                break;
            }
            case 6 : {
                int i, jumlah;
                for(i = a; i <= b; i++){
                    jumlah = (2 * (a * a)) - ((4 * a) + 1); 
                    System.out.print(""+jumlah+", ");
                    a++;
                }
                
                break;
            }
            default : {
                System.out.println("Pilihan anda salah");
            }
        }
    }
    
    
    
}
