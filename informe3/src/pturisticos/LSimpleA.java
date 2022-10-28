package pturisticos;


public class LSimpleA {

	private NodoA p;
    public LSimpleA()
    {
        p=null;
    }
    public NodoA getP() {
        return p;
    }
    public void setP(NodoA p) {
        this.p = p;
    }
    public boolean esvacia() {
    	return p==null;
    }
    public void adiFinal(String cod,String hora,String nombre){
        NodoA nuevo=new NodoA(cod,hora,nombre);
        if(getP()==null)
            setP(nuevo);
        else
        {
            NodoA r=getP();
            while(r.getSig()!=null)
                r=r.getSig();
            r.setSig(nuevo);
        }
    }
    public void adiFinal_2(NodoA nuevo){
        if(getP()==null)
            setP(nuevo);
        else
        {
        	NodoA r=getP();
            while(r.getSig()!=null)
                r=r.getSig();
            r.setSig(nuevo);
        }
    }
    public void adiPrincipio(String cod,String hora,String nombre){
        NodoA nuevo=new NodoA(cod,hora,nombre);
        if(getP()==null)
            setP(nuevo);
        else
        {
            nuevo.setSig(getP());
            setP(nuevo);
        }
	}
    public void leer2(int n)
    {
        for(int i=1;i<=n;i++){

        }
    }
    public void leer1(int n)
    {
        for(int i=1;i<=n;i++){

        }
    } 
	public void mostrar()
    {
		System.out.println("---------Actividades---------");
		NodoA r=getP();
        while(r!=null){
        	r.mostrar();
        	r=r.getSig();
        }
    }
	public void leer2() {
		
	}
	public int nroNodos() {
		int c=0;
		NodoA w=getP();
		while(w!=null) {
			c++;
			w=w.getSig();
		}
		return c;
	}

}
