package inlämningsuppgift1;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Inlämningsuppgift1 {
      
    Inlämningsuppgift1(){
        
        Hund sixten = new Hund("Sixten" , 5);
        Hund dogge = new Hund ("Dogge",10);
        Katt venus = new Katt("Venus" ,5);
        Katt ove = new Katt("Ove" ,3);
        Orm hypno = new Orm("Hypno",1);

        List<Djur> alladjur = new ArrayList<>();
        alladjur.add(sixten);
        alladjur.add(dogge);
        alladjur.add(venus);
        alladjur.add(ove);
        alladjur.add(hypno);

        while(true){
            String s = JOptionPane.showInputDialog("Skriv ett namn");
            if( s == null)
                break;

            int i;
            for(i = 0; i<alladjur.size(); i++){
                if(alladjur.get(i).namn.equalsIgnoreCase(s))
                    break;
            }

            if(i<alladjur.size()){
                printMata(alladjur.get(i));                 //Listan alladjur är av typen Djur men anroppar subklassen metod mha polymorfism.
                break;
            }
            else
                System.out.println("Ingen heter så");
            }
    }

    public void printMata(MataDjur djuret){
        djuret.Mata();
    }


    public static void main(String[] args) {

        Inlämningsuppgift1 inlupp1 = new Inlämningsuppgift1();
    }
}
