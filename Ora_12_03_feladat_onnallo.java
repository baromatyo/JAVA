/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ora_12_03_feladat_onnallo;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Ora_12_03_feladat_onnallo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String var = "i";
        Scanner sc;
        sc = new Scanner(System.in);
        do{
        int szam1 =(int)  (Math.random()*20)+10;
        int szam2 =(int)  (Math.random()*20)+10;
        int tomb1[] =new int[szam1];
        int tomb2[] =new int[szam2];
        int tombPar[] = new int[szam1+szam2];
        int k = 0;
        for(int i =0;i<szam1;i++){
            tomb1[i] = (int) (Math.random()*100)-50;
        }
        for(int i =0;i<szam2;i++){
            tomb2[i] = (int) (Math.random()*100)-50;
        }
        for(int i =0;i<szam1;i++){
            System.out.print(String.format("%,3d",tomb1[i])+" ");
        }
        System.out.println("\n");
        for(int i =0;i<szam2;i++){
            System.out.print(String.format("%,3d",tomb2[i])+" ");
        }
        for(int i =0;i<szam1;i++){
            if(tomb1[i]%5 == 0 && tomb1[i]%2 ==0){
                tombPar[k] = tomb1[i];
                k++;
            }
        }
        for(int i =0;i<szam2;i++){
            if(tomb2[i]%5 == 0 && tomb2[i]%2 == 0){
                tombPar[k] = tomb2[i];
                k++;
            }
        }
        System.out.println("\n");
        if(k!=0){
            for(int i =0;i<k;i++){
                System.out.print(String.format("%,3d",tombPar[i])+" ");
            }
        
            for(int i =0;i<k-1;i++){
                for(int j =0;j<k-1-i;j++){
                    if(tombPar[j]>tombPar[j+1]){
                       int temp = tombPar[j];
                       tombPar[j] = tombPar[j+1];
                       tombPar[j+1] = temp;
                    }                
                }        
            }
            System.out.println("\n");
            for(int i =0;i<k;i++){
                System.out.print(String.format("%,3d",tombPar[i])+" ");
            }
            int legn = tombPar[k-1];
            int legk = tombPar[0];
            System.out.println("\nlegn: "+legn+"legk: "+legk);
            int min =1000;
            int max = -1000;
            // Szélső érték kiválasztás tétele
            for(int i =0;i<k;i++){
                if(tombPar[i]<min){
                min = tombPar[i]; }
                if(tombPar[i]>max){
                max = tombPar[i]; }
            }
            System.out.println("\nmax= "+max+" min= "+min);
            if(min != 0){
                if(max%min == 0){
                    if(max != min){
                    System.out.println("Igen a max tömbszöröse a min-nek");
                    }
                }
            }
        }
        System.out.println("Szeretné újra futtatni i/n: ");
        var = " ";
        var = sc.nextLine();
        }while("i".equals(var));
        
       
        
    }
    
}
