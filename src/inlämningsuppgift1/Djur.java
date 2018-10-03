package inlämningsuppgift1;

/**
 *
 * @author Johnny
 */
public class Djur implements MataDjur {
    protected String namn;
    protected int vikt;
    
    Djur(String namn,int vikt){
        this.namn = namn;
        this.vikt = vikt;
    }
    
    public String getNamn(){
        return namn;
    }
    
    public int getVikt(){
        return vikt;
    }

    @Override
    public void Mata() {
    }
}
