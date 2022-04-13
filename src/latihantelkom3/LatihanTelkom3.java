/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihantelkom3;

import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class LatihanTelkom3 {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
     System.out.println("Menghitung Bilangan 1 sampai n bilangan");
     System.out.println("________________________________________________");
    
     int n;
     int hasil = 0;

     Scanner angka = new Scanner(System.in);
     System.out.print("Masukan banyak bilangan = ");
     n = angka.nextInt();

     for (int i=1; i<=n; i++) {
	     hasil += i;
     }
     System.out.println("Hasil Bilangan = " + hasil);
    }
}
