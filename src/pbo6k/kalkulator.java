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
public class kalkulator {
    public int value1;
    public int value2;

    public kalkulator(int value1, int value2){
        this.value1 = value1;
        this.value2 = value2;
    }

    /**
     * @param args the command line arguments
     */
   public void tambahBilangan(){
        System.out.println("Hasil Pertambahan\t: ".concat(String.valueOf(value1 + value2)));
    }

    public void kurangBilangan(){
        System.out.println("Hasil Perkurangan\t: ".concat(String.valueOf(value1 - value2)));
    }

    public void kaliBilangan(){
        System.out.println("Hasil Perkalian\t\t: ".concat(String.valueOf(value1 * value2)));
    }

    public void bagiBilangan(){
        System.out.println("Hasil Pembagian\t\t: ".concat(String.valueOf(value1 / value2)));
    }

    public void sisaBilangan(){
        System.out.println("Hasil Sisa\t\t: ".concat(String.valueOf(value1 % value2)));
    }
    
}
