package Eje_1;

public class LSimpleE {

	private NodoE p;
    public LSimpleE()
    {
        p=null;
    }
    public NodoE getP() {
        return p;
    }
    public void setP(NodoE p) {
        this.p = p;
    }
    public boolean esvacia() {
    	return p==null;
    }
    public void adiFinal(String cod, String nombre){
        NodoE nuevo=new NodoE(cod,nombre);
        if(getP()==null)
            setP(nuevo);
        else
        {
            NodoE r=getP();
            while(r.getSig()!=null)
                r=r.getSig();
            r.setSig(nuevo);
        }
    }
    public void adiFinal_2(NodoE nuevo){
        if(getP()==null)
            setP(nuevo);
        else
        {
        	NodoE r=getP();
            while(r.getSig()!=null)
                r=r.getSig();
            r.setSig(nuevo);
        }
    }
    public void adiPrincipio(String cod, String nombre){
        NodoE nuevo=new NodoE(cod,nombre);
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
		System.out.println("---------Empleados---------");
		NodoE r=getP();
        while(r!=null){
        	r.mostrar();
        	r=r.getSig();
        }
    }
	public void leer2() {
		adiFinal("E111", "juan");
		adiFinal("E222", "jorge");
		adiFinal("E333", "pedro");
		adiFinal("E444", "lucas");
		adiFinal("E555", "maria");
		adiFinal("E666", "lucy");
		
	}
	public int nroNodos() {
		int c=0;
		NodoE w=getP();
		while(w!=null) {
			c++;
			w=w.getSig();
		}
		return c;
	}

}
