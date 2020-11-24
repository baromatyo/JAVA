/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ora_11_19;

import java.util.Scanner;
/**
 *
 * @author User
 */
public class Ora_11_19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner bemenet = new Scanner(System.in);
        int szam;
        int kettesdb=0, eggyesdb=0, harmasdb=0,negyesdb =0,otosdb=0;
        System.out.println("Hány elemü legyen a tömb?: ");
        szam = bemenet.nextInt();
        int tomb[] =new int[szam];
        int eggyestomb[] = new int[szam];
        int kettestomb[] = new int[szam];
        int harmastomb[] = new int[szam];
        int negyestomb[] = new int[szam];
        int otostomb[] = new int[szam];
        for(int i=0;i<szam;i++){
            tomb[i] = (int) (Math.random()*5)+1;
            System.out.print(tomb[i]+ " ");
        }
        
        for(int i=0;i<szam;i++){
            if(tomb[i] == 1){
            eggyestomb[eggyesdb++] = tomb[i]; 
            } 
            else if(tomb[i] == 2){
            kettestomb[kettesdb++] = tomb[i];
            }
            else if(tomb[i] == 3){
            harmastomb[harmasdb++] = tomb[i];
            }
            else if(tomb[i] == 4){
            negyestomb[negyesdb++] = tomb[i];
            }
            else{
            otostomb[otosdb++] = tomb[i];
            }
        }        
        
        System.out.print("\nAz eggyes tomb elemei: ");
        for(int i=0;i<eggyesdb;i++){
            System.out.print(eggyestomb[i]+ " ");        
        }
        System.out.print("\nA kettes tomb elemei: ");
        for(int i=0;i<kettesdb;i++){
            System.out.print(kettestomb[i]+ " ");        
        }
        System.out.print("\nA hármas tomb elemei: ");
        for(int i=0;i<harmasdb;i++){
            System.out.print(harmastomb[i]+ " ");        
        }
        System.out.print("\nA négyes tomb elemei: ");
        for(int i=0;i<negyesdb;i++){
            System.out.print(negyestomb[i]+ " ");        
        }
        System.out.print("\nA ötös tomb elemei: ");
        for(int i=0;i<otosdb;i++){
            System.out.print(otostomb[i]+ " ");        
        }
        
        System.out.println("\nennyi eggyes  volt benne: "+eggyesdb);
        System.out.println("ennyi kettes  volt benne: "+kettesdb);
        System.out.println("ennyi harmas  volt benne: "+harmasdb);
        System.out.println("ennyi negyes  volt benne: "+negyesdb);
        System.out.println("ennyi otos  volt benne: "+otosdb);
    }
    
}
