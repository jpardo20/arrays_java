
package arrays_java;
import java.util.Random; 

public class VectorDouble extends VectorNombres{
    // Atributs
    private double[] dades;    

    // Constructor
    public VectorDouble(int _mida) {
        super(_mida);
        this.dades = new double[_mida];
    }

    // Mètodes
    @Override
    /** 
     * Afegeix valors aleatoris al vector
     */
    public void omple() {
        Random aleatori = new Random(4); 
        for (int i=0; i<mida; i++) {
            this.dades[i] = 1.0 + (aleatori.nextDouble() * this.max);
        }    
    }

    /**
     * Ordena els elements del vector
     */
    @Override
    public void ordena() {
        ;
    }

    /** 
     *  Inverteix l'ordre del vector
     */
    @Override
    public void inverteix() {
        for (int i = 0; i < this.mida / 2; i++) {
            int j = this.mida - i;
            double aux = this.dades[j];
            this.dades[j] = this.dades[i];
            this.dades[i] = aux;
        }        
    }    
    
    /** 
     *  Substitueix cada element per la seva inversa 
     */
    @Override
    public void inversa() {
        for (int i = 0; i < this.mida / 2; i++) {
            this.dades[i] = 1.0 / this.dades[i];
        }            
    }

    /**
     * Es barregen els elements del vector
     * intercanviant-los de lloc
     */
    @Override
    public void barreja() {
        Random aleatori = new Random(3); 
        for (int i = 0; i < mida; i++) {
            int j = aleatori.nextInt(mida - 1);
            double aux = this.dades[j];
            this.dades[j] = this.dades[i];
            this.dades[i] = aux;
        }            
    }
}
