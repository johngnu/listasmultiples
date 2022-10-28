package Eje_1;

public class LSimpleD {

	private NodoD p;
    public LSimpleD()
    {
        p=null;
    }
    public NodoD getP() {
        return p;
    }
    public void setP(NodoD p) {
        this.p = p;
    }
    public boolean esvacia() {
    	return p==null;
    }
    public void adiFinal_2(NodoD nuevo){
        if(getP()==null)
            setP(nuevo);
        else
        {
        	NodoD r=getP();
            while(r.getSig()!=null)
                r=r.getSig();
            r.setSig(nuevo);
        }
    }
	public void mostrar()
    {
		System.out.println("---------Dias_Trabajados---------");
		NodoD r=getP();
        while(r!=null){
        	r.mostrar();
        	r=r.getSig();
        }
    }
	public void leer2() {
		
	}
	public int nroNodos() {
		int c=0;
		NodoD w=getP();
		while(w!=null) {
			c++;
			w=w.getSig();
		}
		return c;
	}

}
