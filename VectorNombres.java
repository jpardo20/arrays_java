package arrays_java;

public abstract class VectorNombres {
    // Atributs
    protected int mida;
    protected double max;

    // Constructor
    public VectorNombres (int _mida) {
        this.mida = _mida;
        this.max = _mida * 100.0;
    }
    
    // Mètodes
    /**
     * Afegeix valors aleatoris al vector
     */
    public abstract void omple();
    
    /**
     * Ordena els elements del vector
     */
    public abstract  void ordena();
        
    /** 
     *  Inverteix l'ordre del vector
     */
    public  abstract  void inverteix();
        
    /** 
     *  Substitueix cada element per la seva inversa 
     */
    public  abstract  void inversa();
            
    /**
     * Es barregen els elements del vector
     * intercanviant-los de lloc
     */
    public abstract   void barreja();    
}
