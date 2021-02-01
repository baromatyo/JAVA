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
    
    static void kiir(int tomb[]){
        for(int i=0;i<tomb.length;i++){
            System.out.print(String.format("%,4d",tomb[i])+" ");
        }
    }
    static void bubbleSort(int arr[]) 
    { 
        int n = arr.length; 
        for (int i = 0; i < n-1; i++) 
            for (int j = 0; j < n-i-1; j++) 
                if (arr[j] > arr[j+1]) 
                { 
                    // swap arr[j+1] and arr[j] 
                    int temp = arr[j]; 
                    arr[j] = arr[j+1]; 
                    arr[j+1] = temp; 
                } 
    } 

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
        kiir(tomb);
        System.out.println("\n");
        kiir(tomb2);
        System.out.println("\n");
        kiir(tomb3);
        System.out.println("\nsorbarendezve: \n");
        bubbleSort(tomb);
        kiir(tomb);
        System.out.println("\n");
        bubbleSort(tomb2);
        kiir(tomb2);
        System.out.println("\n");
        bubbleSort(tomb3);
        kiir(tomb3);
    }
    
}
