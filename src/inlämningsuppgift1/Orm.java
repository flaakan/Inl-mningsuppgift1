package inlämningsuppgift1;

/**
 *
 * @author Johnny
 */
public class Orm extends Djur implements IMataDjur{
    
    Orm(String namn, int vikt){
        super(namn,vikt);
        this.namn = namn;
        this.vikt = vikt;
    }
    
    @Override
    public void Mata(){
        System.out.println("Ormen " + namn + " ska få 20 gram ormpellets");
    }
}

