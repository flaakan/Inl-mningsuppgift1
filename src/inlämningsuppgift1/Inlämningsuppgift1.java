package inlämningsuppgift1;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Inlämningsuppgift1 {
      
    Inlämningsuppgift1(){
        // Skapar mina djur
        Hund sixten = new Hund("Sixten" , 5);
        Hund dogge = new Hund ("Dogge",10);
        Katt venus = new Katt("Venus" ,5);
        Katt ove = new Katt("Ove" ,3);
        Orm hypno = new Orm("Hypno",1);
        
        // Skapar en lista och lägger in alla djur
        List<Djur> alladjur = new ArrayList<>();
        alladjur.add(sixten);
        alladjur.add(dogge);
        alladjur.add(venus);
        alladjur.add(ove);
        alladjur.add(hypno);
        
        while(true){
            String input = JOptionPane.showInputDialog("Skriv ett namn");   //Tar in ett namn
            if( input == null)              //Om användaren trycker avbryt
                break;
            
            for(int i = 0; i<alladjur.size(); i++)                       //For-loop går igenom listan alladjur
                if(alladjur.get(i).namn.equalsIgnoreCase(input)){       //Om djuret i plats  [i] i listan alladjur stämmer med input
                    alladjur.get(i).Mata();                             //Listan alladjur är av typen Djur men anroppar subklassens metod mha polymorfism.
                    return;
            }  
            
        System.out.println("Ingen heter så");
        }
    }
    public static void main(String[] args) {

        Inlämningsuppgift1 inlupp1 = new Inlämningsuppgift1();
    }
}
