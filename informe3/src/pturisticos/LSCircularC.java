package pturisticos;

public class LSCircularC {
	private NodoC p;
    LSCircularC()
    {
        p=null;
    }
    public NodoC getP() {
        return p;
    }
    public void setP(NodoC p) {
        this.p = p;
    }
    public void adiFinal(String ci,String nombre){
        NodoC nuevo=new NodoC();
        nuevo.setNombre(nombre);
        nuevo.setCi(ci);
        if(getP()==null)
            setP(nuevo);
        else
        {
        	NodoC r=getP();
            while(r.getSig()!=getP())
                r=r.getSig();
            r.setSig(nuevo);
        }
        nuevo.setSig(getP());
    }
    public void adiPrincipio(String ci,String nombre){
        NodoC nuevo=new NodoC();
        nuevo.setNombre(nombre);
        nuevo.setCi(ci);
        if(getP()==null) {
        	 setP(nuevo);
        }
        else
        {
        	NodoC r=getP();
        	while(r.getSig()!=getP())
                r=r.getSig();
            r.setSig(nuevo);
            nuevo.setSig(getP());
            setP(nuevo);
        }
	}
	public void mostrar()
    {
		if(getP()!=null) {
			System.out.println("---------CLIENTES-------");
			NodoC r=getP();//null
	        while(r.getSig()!=getP()){
	        	System.out.println("Cliente [nombre= "+r.getNombre()+", ci="+r.getCi()+"]");
	            r=r.getSig();
	        }
	        System.out.println("Cliente [nombre= "+r.getNombre()+", ci="+r.getCi()+"]");
		}
		else
			System.out.println("Lista vacia");
    }
	public int nroNodos() {
		int c=0;
		if(getP()!=null) {
			NodoC r=getP();
			while(r.getSig()!=getP()){
		       	c++;
		        r=r.getSig();
		    }
			c++;
		}
		return c;
	}
	public void leer2() {
		adiFinal("111", "alan");
		adiFinal("222", "jorge");
		adiFinal("333", "rolando");
		adiFinal("444", "pepe");
		adiFinal("555", "lucy");
	}
}
