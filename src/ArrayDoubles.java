package arrays_java.src;
import java.util.Random; 

public class ArrayDoubles extends VectorNombres{
    // Atributs
    private Double[] dades;    

    // Constructor
    public ArrayDoubles(int _mida) {
        super(_mida);
        this.dades = new Double[_mida];
    }

    // Mètodes
    /** 
     * Afegeix valors aleatoris al vector
     */
    @Override
    public void omple() {
        // Posem un valor inicial al random perquè
        // les execucions siguin sempre iguals
        Random aleatori = new Random(4);
        for (int i = 0; i < this.mida; i++) {
            // mètode deprecated, no s'hauria d'usar
            // perquè com diu la documentació
            // és poc eficient... però precisament
            // això és el que es vol veure....
            this.dades[i] = new Double(1.0+aleatori.nextDouble()*this.max);
            // s'hauria de fer amb 
            // dades[i]=Double.valueOf(rand.nextDouble()*max);
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
        for (int i=0; i < mida / 2; i++) {
            int j = mida-i;
            Double aux = this.dades[j];
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
        for (int i = 0; i<mida; i++) {
            int j = aleatori.nextInt(mida-1);
            Double aux = this.dades[j];
            this.dades[j] = this.dades[i];
            this.dades[i] = aux;
        }            
    }
}