package Eje_1;

public class LSimpleV {

	private NodoV p;
    public LSimpleV()
    {
        p=null;
    }
    public NodoV getP() {
        return p;
    }
    public void setP(NodoV p) {
        this.p = p;
    }
    public boolean esvacia() {
    	return p==null;
    }
    public void adiFinal_2(NodoV nuevo){
        if(getP()==null)
            setP(nuevo);
        else
        {
        	NodoV r=getP();
            while(r.getSig()!=null)
                r=r.getSig();
            r.setSig(nuevo);
        }
    }
	public void mostrar()
    {
		System.out.println("---------Ventas---------");
		NodoV r=getP();
        while(r!=null){
        	r.mostrar();
        	r=r.getSig();
        }
    }
	public void leer2() {
	}
	public int nroNodos() {
		int c=0;
		NodoV w=getP();
		while(w!=null) {
			c++;
			w=w.getSig();
		}
		return c;
	}

}
