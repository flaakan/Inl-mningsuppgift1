package inlämningsuppgift1;

/**
 *
 * @author Johnny
 */
public class Katt extends Djur implements IMataDjur{
    
    Katt(String namn, int vikt){
        super(namn,vikt);
        this.namn = namn;
        this.vikt = vikt;
    }
    
    @Override
    public void Mata(){
        System.out.println("Katten " + namn + " ska få " + vikt*1000/150 + " gram kattfoder");
    }
}
    

