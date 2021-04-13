
package iskola0412;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;

public class Iskola0412 {
    public static ArrayList<Tanulo> lista = new ArrayList<>();
    
    public static void beolvasas(){
        
      try{
        RandomAccessFile raf = new RandomAccessFile("C:\\Users\\User\\Desktop\\Széchenyi\\Java\\Iskola0412\\nevek.txt","r");
        String elsosor = raf.readLine();
        if(elsosor.contains(";")){
            lista.add(new Tanulo(elsosor));
        }
        //int rekordszam = Integer.parseInt(raf.readLine());
        //System.out.println(rekordszam);
        while(raf.getFilePointer()<raf.length()){
            lista.add(new Tanulo(raf.readLine()));
        }
        raf.close();
        }
      catch(IOException e){
          System.out.println(e);
      }
      
       
    }
   
    public static void main(String[] args) {
        // TODO code application logic here
        beolvasas();
        
        
    }
}   
class Tanulo{
    private int kezdesEve;
    private char osztaly;
    private String nev;
    
    public Tanulo(String sor){
        System.out.println(sor);
        String[] adatok = sor.split(";");
        this.kezdesEve = Integer.parseInt(adatok[0]);
        this.osztaly = adatok[1].charAt(0);
        this.nev = adatok[2];
    }

        public int getKezdesEve() {
            return kezdesEve;
        }

        public void setKezdesEve(int kezdesEve) {
            this.kezdesEve = kezdesEve;
        }

        public char getOsztaly() {
            return osztaly;
        }

        public void setOsztaly(char osztaly) {
            this.osztaly = osztaly;
        }

        public String getNev() {
            return nev;
        }

        public void setNev(String nev) {
            this.nev = nev;
        }
    
    
}

