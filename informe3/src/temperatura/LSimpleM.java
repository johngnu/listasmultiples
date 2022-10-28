package temperatura;

public class LSimpleM {

	private NodoM p;
    public LSimpleM()
    {
        p=null;
    }
    public NodoM getP() {
        return p;
    }
    public void setP(NodoM p) {
        this.p = p;
    }
    public boolean esvacia() {
    	return p==null;
    }
    public void adiFinal_2(NodoM nuevo){
        if(getP()==null)
            setP(nuevo);
        else
        {
        	NodoM r=getP();
            while(r.getSig()!=null)
                r=r.getSig();
            r.setSig(nuevo);
        }
    }
	public void mostrar()
    {
		System.out.println("---------Meses---------");
		NodoM r=getP();
        while(r!=null){
        	r.mostrar();
        	r=r.getSig();
        }
    }
	public void leer2() {
		
	}
	public int nroNodos() {
		int c=0;
		NodoM w=getP();
		while(w!=null) {
			c++;
			w=w.getSig();
		}
		return c;
	}

}
