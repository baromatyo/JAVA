/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tetelgyak_11_24;

/**
 *
 * @author User
 */
public class Tetelgyak_11_24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int szam = (int) (Math.random()*10)+10;
        int tombNegativ[] = new int[szam*2];
        int k = 0;
        int tomb1[] = new int[szam];
        int tomb2[] = new int[szam];
        for(int i =0;i<szam;i++){
            tomb1[i] = (int) (Math.random()*200)-100;
            tomb2[i] = (int) (Math.random()*200)-100;
            if(tomb1[i]<0){
                tombNegativ[k] = tomb1[i];
                k++;
            }
            if(tomb2[i]<0){
                tombNegativ[k] = tomb2[i];
                k++;
            }
           
        }
        for(int i =0;i<szam;i++){            
            System.out.print(String.format("%,3d",tomb1[i])+" ");
        }
        System.out.println("");
        for(int i =0;i<szam;i++){            
            System.out.print(String.format("%,3d",tomb2[i])+" ");
        }
        System.out.println("");
        int osszegNeg= 0;
        for(int i =0;i<k;i++){
            osszegNeg+=tombNegativ[i];
            System.out.print(String.format("%,3d",tombNegativ[i])+" ");
        }
        System.out.println("\nEnnyi negatív szám volt: "+k);
        System.out.println("Ennyi a negativ tömb elemeinek az összege: "+osszegNeg);
        System.out.println("Ennyi a negativ tömb elemeinek az átlaga: "+(double)osszegNeg/k);
    }
    
}
