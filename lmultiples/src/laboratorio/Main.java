
package laboratorio;


public class Main {

    public static void main(String[] args) {
        // productos 
        ListaDP lp = new ListaDP();
        lp.adiFinal("p1", 5);
        lp.adiFinal("p2", 10);
        lp.adiFinal("p3", 15);
        
        lp.mostrar();
        
        // expositores
        ListaSE le = new ListaSE();
        le.adiFinal("juan");
        le.adiFinal("oscar");
        le.adiFinal("ana");
        
        le.mostrar();
        
        // carpas 
        ListaSC lc = new ListaSC();
        lc.adiFinal(1, "ubic 1", le, lp);
        
        lc.mostrar();
    }
    
}
