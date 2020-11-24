/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ora_11_11;

/**
 *
 * @author User
 */
public class Ora_11_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Jakab Mátyás 113/c");
        
        int[] tomb = new int [5];
        tomb[0] =3;
        tomb[1] =4;
        tomb[2] =2;
        tomb[3] =22;
        tomb[4] =33;
        
        for(int i=0;i<5;i++){
            System.out.print(tomb[i]+" ");
        }
        System.out.println("");
        int[] tomb2 = new int [5];
        for(int i=0;i<5;i++){
            tomb2[i] = (int) (Math.random()*99);
            System.out.print(tomb2[i]+" ");
            
        }
        int osszeg1 = 0;
        int osszeg2 = 0;
        for(int i=0;i<5;i++){
            osszeg1 += tomb[i];
            osszeg2 += tomb2[i];
        }
        System.out.println("\na tomb1 átlaga: "+osszeg1/tomb.length);
        System.out.println("a tomb2 átlaga: "+osszeg2/tomb2.length);
        
    }
    
}
