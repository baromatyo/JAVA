/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parosindexek;

import java.util.Scanner;
/**
 *
 * @author User
 */
public class ParosIndexek {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner bemenet = new Scanner(System.in);
        
        int szamtomb1 [] = new int [20];
        for (int i = 0; i < 20; i++) {
            szamtomb1[i] = (int) (Math.random()*100)+1;
        }
        for (int i = 0; i < 20; i++) {
            System.out.print(szamtomb1[i]+", ");
        }
        System.out.println("\n");
        for (int i = 0; i < 20; i+=3) {
            System.out.print(szamtomb1[i]+", ");
        }
        System.out.println("melyik ele sorszámára vagyunk kiváncsiak: ");
        int keresettSzam = bemenet.nextInt();
        int j=0;
        for (int i = 0; i < 20; i++) {
            if(szamtomb1[i] == keresettSzam){
                System.out.println("A keresett szám indexe: "+(i+1)); 
                break;
            }
            j++;
        }
        if(20 == j){
            System.out.println("nincs benne");
        }
        
        
        bemenet.close();
    }
    
}
