package inlämningsuppgift1;

/**
 *
 * @author Johnny
 */
public class Hund extends Djur implements MataDjur{
    
    Hund(String namn, int vikt){
        super(namn, vikt);
        this.namn = namn;
        this.vikt = vikt;
    }
    
    @Override
    public void Mata(){
        System.out.println("hunden " + getNamn() + " ska få " + getVikt()*1000/100 + " gram mat");
    }
}
