package Eje_2_;


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
    public void adiFinal(Atencion a){
        NodoD nuevo=new NodoD();
        nuevo.setA(a);
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
    public void adiPrincipio(Atencion a){
        NodoD nuevo=new NodoD();
        nuevo.setA(a);
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
		System.out.println("---------Dias_Atencion------");
        NodoD r=getP();
        while(r!=null){
        	r.getA().mostrar();
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
