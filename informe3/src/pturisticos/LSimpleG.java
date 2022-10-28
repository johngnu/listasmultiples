package pturisticos;

public class LSimpleG {

	private NodoG p;
    public LSimpleG()
    {
        p=null;
    }
    public NodoG getP() {
        return p;
    }
    public void setP(NodoG p) {
        this.p = p;
    }
    public boolean esvacia() {
    	return p==null;
    }
    public void adiFinal(String cod, String nombre){
        NodoG nuevo=new NodoG(cod,nombre);
        if(getP()==null)
            setP(nuevo);
        else
        {
            NodoG r=getP();
            while(r.getSig()!=null)
                r=r.getSig();
            r.setSig(nuevo);
        }
    }
    public void adiFinal_2(NodoG nuevo){
        if(getP()==null)
            setP(nuevo);
        else
        {
        	NodoG r=getP();
            while(r.getSig()!=null)
                r=r.getSig();
            r.setSig(nuevo);
        }
    }
    public void adiPrincipio(String cod, String nombre){
        NodoG nuevo=new NodoG(cod,nombre);
        if(getP()==null)
            setP(nuevo);
        else
        {
            nuevo.setSig(getP());
            setP(nuevo);
        }
	} 
	public void mostrar()
    {
		System.out.println("---------Guias---------");
		NodoG r=getP();
        while(r!=null){
        	r.mostrar();
        	r=r.getSig();
        }
    }
	public void leer2() {
		
	}
	public int nroNodos() {
		int c=0;
		NodoG w=getP();
		while(w!=null) {
			c++;
			w=w.getSig();
		}
		return c;
	}

}
