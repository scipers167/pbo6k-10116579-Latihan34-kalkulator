/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6k;

/**
 *
 * @author Lenovo
 */
import java.util.Scanner;

public class latihan34 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("===== Aplikasi Kalkulator Bilangan =====");
        System.out.print("Masukan Angka ke-1\t: ");
        int value1 = scanner.nextInt();
        System.out.print("Masukan Angka ke-2\t: ");
        int value2 = scanner.nextInt();
        System.out.println();

        kalkulator kal = new kalkulator(value1, value2);
        kal.tambahBilangan();
        kal.kurangBilangan();
        kal.kaliBilangan();
        kal.bagiBilangan();
        kal.sisaBilangan();
    }
}
