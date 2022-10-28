package Eje_1;

public class LSimpleP {

	private NodoP p;
    public LSimpleP()
    {
        p=null;
    }
    public NodoP getP() {
        return p;
    }
    public void setP(NodoP p) {
        this.p = p;
    }
    public boolean esvacia() {
    	return p==null;
    }
    public void adiFinal_2(NodoP nuevo){
        if(getP()==null)
            setP(nuevo);
        else
        {
        	NodoP r=getP();
            while(r.getSig()!=null)
                r=r.getSig();
            r.setSig(nuevo);
        }
    }
	public void mostrar()
    {
		System.out.println("---------Productos---------");
		NodoP r=getP();
        while(r!=null){
        	r.mostrar();
        	r=r.getSig();
        }
    }
	public void leer2() {
		
	}
	public int nroNodos() {
		int c=0;
		NodoP w=getP();
		while(w!=null) {
			c++;
			w=w.getSig();
		}
		return c;
	}

}
