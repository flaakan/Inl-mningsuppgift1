package inlämningsuppgift1;

/**
 *
 * @author Johnny
 */
public class Katt extends Djur implements MataDjur{
    
    Katt(String namn, int vikt){
        super(namn,vikt);
        this.namn = namn;
        this.vikt = vikt;
    }
    
    public void Mata(){
        System.out.println("Katten " + getNamn() + " ska få " + getVikt()*1000/150 + " gram mat");
    }
}
    

