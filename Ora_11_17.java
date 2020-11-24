/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ora_11_17;


import java.util.Scanner;

/**
 *
 * @author User
 */
public class Ora_11_17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner bemenet = new Scanner(System.in);
        int szam;
        
        System.out.println("1. tömb hány elemü legyen?: ");
        szam = bemenet.nextInt();
        
        
        int tomb1[] = new int [szam];
        int tomb2[] = new int [szam];
        
        for(int i=0;i<szam;i++){
            tomb1[i] = (int) (Math.random()*999);
            tomb2[i] = (int) (Math.random()*999);
        }
        System.out.println("A tömbök elemei");
        for(int i=0;i<szam;i++){
            int sorOsszeg=0;
            sorOsszeg = tomb1[i]+tomb2[i];
            System.out.print(i+1+".: ");
            System.out.print(String.format("%,3d",tomb1[i])+" + ");
            System.out.print(String.format("%,3d",tomb2[i])+" = ");
            System.out.print(String.format("%,3d",sorOsszeg));
            System.out.println("");
        }
                
       
        
    }
    
}
