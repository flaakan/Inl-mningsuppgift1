package inlämningsuppgift1;

/**
 *
 * @author Johnny
 */
public class Hund extends Djur implements IMataDjur{
    
    Hund(String namn, int vikt){
        super(namn, vikt);
        this.namn = namn;
        this.vikt = vikt;
    }
    
    @Override
    public void Mata(){
        System.out.println("Hunden " + namn + " ska få " + vikt*1000/100 + " gram hundfoder");
    }
}
