/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ora_11_12;

/**
 *
 * @author User
 */
public class Ora_11_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] tomb2 = new int [5];
        int szamlalo = 0;
        int paros = 0;
        for(int i=0;i<5;i++){
            tomb2[i] = (int) (Math.random()*99);
            
            if(tomb2[i]%2 ==0){
                paros++;
                szamlalo++;
                System.out.println(tomb2[i]+" ");
            }
            else{
                
                System.out.println(tomb2[i]+" páratlan");  
                szamlalo+=1;
            }
            
        }
        System.out.println("\nennyi elemü a tömb: "+szamlalo);
        System.out.println("ennyi páros van benne "+paros);
    }
    
}
