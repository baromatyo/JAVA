/*
 1. Hozz létre HÁROM azonos elemszámú tömböt: szamtomb1, szamtomb2, szamtomb3 néven!
2. A tömbök elemszámát is véletlenszám generátorral állítsd elő 5 és 10 között.
3. Az elemek a -100 és +100 értéktartományba essenek.
4. Írasd ki a három tömböt egy-egy sorban ügyelve, hogy az elemek helyiérték szerint egymás alá kerüljenek.
5. Írasd ki az azonos indexű tömbelemeket egymás mellé az összegükkel az alábbi módon (az 1. index esetén):
     1. számok: 98 + 65 + 34 = 197
6. Írasd ki a páros indexű tömbelemek legkisebb elemét.
    Legkisebb számok:  56 (2. ), -44 (4.), -5 (6.), ...
7. Fésüld össze a három tömböt egy közös tömbbe teljesTomb néven és írasd ki az elemeket sorbarendezve! 
8. Írasd ki azokat az elemeket, melyekből több is található a teljesTombben! (sorbarendezés tételét gondold újra....)
9. Kérdezd meg, szeretné-e újrafuttatni a felhasználó a programot (i/n)! Ha igen, hajrá...

A feladatrészek elé emeljétek be kommentbe az adott feladat számát + leírását! Ctr C - Ctrl V innen... + (ahol programozási tételt használtok a megoldáshoz () -ben nevezzétek meg, melyiket!) 
Mindenki meg tudja indokolni, mit miért csinált!
Jó munkát!
 */
package keresztmetszet;

import java.util.Scanner;

/**
 *
 * @author jesch
 */
public class Keresztmetszet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("\tKERESZTMETSZET\n\tKészítette: Jakab Mátyás ");
        
        String var = "i";
        Scanner sc;
        sc = new Scanner(System.in);
        do{
        //1. Hozz létre HÁROM azonos elemszámú tömböt: szamtomb1, szamtomb2, szamtomb3 néven!
        //2. A tömbök elemszámát is véletlenszám generátorral állítsd elő 5 és 10 között.
        int elemszam = (int) (Math.random()*5)+5;
        int szamtomb1 [] = new int [elemszam];
        int szamtomb2 [] = new int [elemszam];
        int szamtomb3 [] = new int [elemszam];
        int temp = 0;
        int legkisebb = 0;
        int mi =1000;
        
        //3. Az elemek a -100 és +100 értéktartományba essenek.
        for (int i = 0; i < elemszam; i++) {
            szamtomb1[i] = (int) (Math.random()*200)-100;
            szamtomb2[i] = (int) (Math.random()*200)-100;
            szamtomb3[i] = (int) (Math.random()*200)-100;
        }
        
        //4. Írasd ki a három tömböt egy-egy sorban ügyelve, hogy az elemek helyiérték szerint egymás alá kerüljenek.
        System.out.println("\nAz első tömb elemei: ");
        for (int i = 0; i < elemszam; i++) {
            System.out.print(String.format("%,4d",szamtomb1[i])+" ");
        }
        System.out.println("\nA második tömb elemei: ");
        for (int i = 0; i < elemszam; i++) {
            System.out.print(String.format("%,4d",szamtomb2[i])+" ");
        }
        
        System.out.println("\nA harmadik tömb elemei: ");
        for (int i = 0; i < elemszam; i++) {
            System.out.print(String.format("%,4d",szamtomb3[i])+" ");
        }
        
        /*5. Írasd ki az azonos indexű tömbelemeket egymás mellé az összegükkel az alábbi módon (az 1. index esetén):
            1. számok: 98 + 65 + 34 = 197*/
        System.out.println("");
        for (int i = 0; i < elemszam; i++) {
            temp = szamtomb3[i]+szamtomb1[i]+szamtomb2[i];
            System.out.println((i+1)+".számok: "+String.format("%,4d",szamtomb1[i])+" + "+String.format("%,4d",szamtomb2[i])+
                    " + "+String.format("%,4d",szamtomb3[i])+" = "+String.format("%,4d",temp));
        }
        
        /*6. Írasd ki a páros indexű tömbelemek legkisebb elemét.
            Legkisebb számok:  56 (2. ), -44 (4.), -5 (6.), ...*/
        System.out.print("Legkisebb számok: ");
        for (int i = 0; i < elemszam; i++) {
            if (i % 2 == 0){
                
                legkisebb = Math.min(szamtomb1[i],szamtomb2[i]);
                legkisebb = Math.min(szamtomb3[i], legkisebb);
                System.out.print(legkisebb+" ("+i+".) ,");
            }
        }
        
        //7. Fésüld össze a három tömböt egy közös tömbbe teljesTomb néven és írasd ki az elemeket sorbarendezve! 
        int teljesTomb[] = new int[3*elemszam];
        int teljesTombDb = 0;
        for (int i = 0; i < elemszam; i++) {
                teljesTomb[teljesTombDb++] = szamtomb1[i];                         
        }
        for (int i = 0; i < elemszam; i++) {
                teljesTomb[teljesTombDb++] = szamtomb2[i];              
        }
        for (int i = 0; i < elemszam; i++) {
                teljesTomb[teljesTombDb++] = szamtomb3[i];
        }
        for (int i = 0; i < teljesTombDb-1; i++) {
            for (int j = 0; j <teljesTombDb-i-1; j++) {
                if (teljesTomb[j]>teljesTomb[j+1]){
                    temp =teljesTomb[j];
                    teljesTomb[j]=teljesTomb[j+1];
                    teljesTomb[j+1]=temp;
                }
            }
        }
        System.out.println("\nA teljesTomb elemei sorban: ");
        for (int i = 0; i < teljesTombDb; i++) {
            System.out.print(String.format("%,4d",teljesTomb[i])+" ");
        }        
        //8. Írasd ki azokat az elemeket, melyekből több is található a teljesTombben! (sorbarendezés tételét gondold újra....)
        System.out.print("\n Amikből több van: ");
        for (int i = 0; i < teljesTombDb-1; i++) {
            if(teljesTomb[i] == teljesTomb[i+1] && teljesTomb[i] != mi){
            System.out.print(String.format("%,4d",teljesTomb[i])+" ");
            mi = teljesTomb[i];
            }
        }        
        System.out.println("");
        System.out.println("Szeretné újra futtatni i/n: ");
        var = sc.nextLine();
        
    }while("i".equals(var));
    }
    
}