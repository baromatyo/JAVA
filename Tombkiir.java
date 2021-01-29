/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tombkiir;

import java.util.Formatter;
/**
 *
 * @author User
 */
public class Tombkiir {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int tomb[] = new int[10];
        int tomb2[] = new int[10];
        int tomb3[] = new int[10];
        for(int i=0;i<10;i++){
            tomb[i] = (int) (Math.random()*200)-100;
            tomb2[i] = (int) (Math.random()*200)-100;
            tomb3[i] = (int) (Math.random()*200)-100;
        }
        for(int i=0;i<10;i++){
            System.out.print(String.format("%,4d",tomb[i])+" ");
        }
        System.out.println("");
        for(int i=0;i<10;i++){
            System.out.print(String.format("%,4d",tomb2[i])+" ");
        }
        System.out.println("");
        for(int i=0;i<10;i++){
            System.out.print(String.format("%,4d",tomb3[i])+" ");
        }
        
    }
    
}
