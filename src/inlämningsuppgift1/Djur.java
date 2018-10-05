package inlämningsuppgift1;

/**
 *
 * @author Johnny
 */
public class Djur implements IMataDjur {
    protected String namn;                  //Inkapsling av variabler, skyddad från andra paket
    protected int vikt;
    
    Djur(String namn,int vikt){
        this.namn = namn;
        this.vikt = vikt;
    }

    @Override
    public void Mata() {
    }
}
