package inlämningsuppgift1;

/**
 *
 * @author Johnny
 */
public class Orm extends Djur implements MataDjur{
    
    Orm(String namn, int vikt){
        super(namn,vikt);
        this.namn = namn;
        this.vikt = vikt;
    }
    
    public void Mata(){
        System.out.println("Ormen " + getNamn() + " ska få 20 gram mat");
    }
}

