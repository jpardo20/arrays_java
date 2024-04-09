package arrays_java.src;

public class VectorNombresTest {
    // Definició de variables globals

    // vectorAProvar definició del vector que es farà servir
    static VectorNombres vectorAProvar;
    // tipusClasse = la primera passada ho farà amb el tipus ArrayDoubles
    // la segona passada ho farà amb el tipus VectorDouble
    static int[] tipusClasse = {0,1};
    // el de 100 es perquè tot s'executi una vegada
    // tempsInici per obtenir el temps abans de l'execució
    static long tempsInici;
    // tempsOmple, tempsBarreja, tempsInversa, tempsInversa2
    // per poder obtenir els diferents temps de l'execució
    static long tempsOmple, tempsBarreja, tempsInversa, tempsInversa2;

    public static void test01ArraysVectors() {
        // Definició de variables NO globals
        int[] mides= {100,100000,1000000,10000000,100000000};
        System.out.println("TEST 1: ARRAYS i VECTORS");
        System.out.println("========================\n");

        System.out.println("Classe\t\t       Mida\t   omple()\t barreja()\t inversa()\tinversa2()" );
        System.out.println("============     ==========    ===========    ============    ============    ============" );
        tempsInici = System.nanoTime();
        // 
        for (int mida : mides) {        
            for (int classe : tipusClasse ) {
                // Escollim el tipus de la variable que volem definir     
                vectorAProvar = (classe == 1)? new ArrayDoubles(mida): new VectorDouble(mida);

                // CÀLCUL MÈTODE omple()
                // Obtenim el temps per poder fer el càlcul 
                tempsInici = System.nanoTime();
                // Executem el mètode omple()
                vectorAProvar.omple();
                // Calculem el temps que ha trigat
                tempsOmple = System.nanoTime() - tempsInici;
                
                // CÀLCUL MÈTODE inversa()
                // Obtenim el temps per poder fer el càlcul 
                tempsInici = System.nanoTime();
                // Executem el mètode inversa()
                vectorAProvar.inversa();
                // Calculem el temps que ha trigat
                tempsInversa = System.nanoTime() - tempsInici;
                
                // CÀLCUL MÈTODE barreja()
                // Obtenim el temps per poder fer el càlcul 
                tempsInici = System.nanoTime();
                vectorAProvar.barreja();
                // Calculem el temps que ha trigat
                tempsBarreja=System.nanoTime()-tempsInici;
                
                // CÀLCUL MÈTODE inversa()
                // Obtenim el temps per poder fer el càlcul 
                tempsInici = System.nanoTime();
                vectorAProvar.inversa();
                // Calculem el temps que ha trigat
                tempsInversa2 = System.nanoTime() - tempsInici;
                // escriu el temps en microsegons
                System.out.format(
                    ((classe == 1)? "ArrayDoubles": "VectorDouble") + " %14d\t%10.3f\t%10.3f \t%10.3f\t%10.3f\n",
                    mida,
                    tempsOmple / 1000000000.0,
                    tempsBarreja / 1000000000.0,
                    tempsInversa / 1000000000.0,
                    tempsInversa2 / 1000000000.0 ) ; 
            }
        }
        System.out.println("FINAL TEST 1");
        System.out.println("------------");
    }
    
    public static void test02Ordena() {
        int[]  classes= {0,1};
        int[]  mides= {16,32,64,128,256,512,1024,2048,4096,8192,16384,32768,65536,131072};
        //int[]  mides= {500,1000,1500,2000,2500,3000,3500,4000,4500,5000,5500,6000,6500,7000,7500,8000,8500,9000,9500,10000};        
        long tempsInici;
        long tempsOmple, tempsOrdena;
        
        System.out.println("TEST 2: ORDENA");
        System.out.println("==============\n");

        System.out.println("Classe\t\t       Mida\t   omple()\t  ordena()" );
        System.out.println("============   ============   ============    ============");

        vectorAProvar = new VectorDouble(100);
        vectorAProvar.omple();
        vectorAProvar.inversa();
        vectorAProvar.barreja();
        vectorAProvar.inversa();    

        tempsInici = System.nanoTime();

        for (int mida : mides) {
            for (int classe : classes ) {
                vectorAProvar = (classe == 1)? new ArrayDoubles(mida): new VectorDouble(mida);
                tempsInici = System.nanoTime();
                // CÀLCUL MÈTODE omple()
                // Obtenim el temps per poder fer el càlcul
                // Executem el mètode omple()
                vectorAProvar.omple();
                // Calculem el temps que ha trigat
                tempsOmple = System.nanoTime()-tempsInici;
                // CÀLCUL MÈTODE ordena()
                // Obtenim el temps per poder fer el càlcul
                tempsInici = System.nanoTime();
                // Executem el mètode ordena()
                vectorAProvar.ordena();
                // Calculem el temps que ha trigat
                tempsOrdena = System.nanoTime() - tempsInici;
                
                System.out.format(
                    ( (classe == 1)? "ArrayDoubles": "VectorDouble") +
                    " %14d\t%10.6f\t%10.6f\n",
                    mida,
                    tempsOmple / 1000000000.0,
                    tempsOrdena / 1000000000.0
                ); 
            }
        }
        System.out.println("FINAL TEST 2");
        System.out.println("------------");
    }
    
    
    public static void main(String[] args) {
        test01ArraysVectors();
        test02Ordena();       
    }
}
