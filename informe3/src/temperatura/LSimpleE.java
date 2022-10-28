package temperatura;

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
	public void mostrar()
    {
		System.out.println("---------Estaciones---------");
		NodoE r=getP();
        while(r!=null){
        	r.mostrar();
        	r=r.getSig();
        }
    }
	public void leer2() {
		LSimpleM m1 = new LSimpleM();
		LSimpleP p1 = new LSimpleP();
		p1.adiFinal_2(new Pronostico("02/10/17", "nublado", 18, 5, 2, 18, 15));
		p1.adiFinal_2(new Pronostico("02/10/17", "soleado", 21, 5, 2, 18, 15));
		p1.adiFinal_2(new Pronostico("22/10/17", "nuboso", 17, 3, 5, 18, 40));
		p1.adiFinal_2(new Pronostico("30/10/17", "parcial", 30, 8, 2, 18, 15));
		m1.adiFinal_2(new NodoM("octubre", p1));
		adiFinal_2(new NodoE("La Paz", m1));
		
		LSimpleM m2 = new LSimpleM();
		LSimpleP p2 = new LSimpleP();
		p2.adiFinal_2(new Pronostico("02/01/17", "nublado", 18, 5, 5, 18, 15));
		p2.adiFinal_2(new Pronostico("02/01/17", "soleado", 21, 5, 2, 18, 15));
		
		LSimpleP p3 = new LSimpleP();
		p3.adiFinal_2(new Pronostico("02/01/17", "nublado", 18, 5, 2, 18, 15));
		p3.adiFinal_2(new Pronostico("02/01/17", "soleado", 21, 5, 2, 18, 15));
		p3.adiFinal_2(new Pronostico("22/01/17", "nuboso", 17, 3, 2, 18, 15));
		p3.adiFinal_2(new Pronostico("30/01/17", "parcial", 30, 8, 2, 18, 15));

		m2.adiFinal_2(new NodoM("enero", p2));
		m2.adiFinal_2(new NodoM("noviembre", p3));

		adiFinal_2(new NodoE("La Paz", m2));
		
		LSimpleM m3 = new LSimpleM();
		LSimpleP p4 = new LSimpleP();
		p4.adiFinal_2(new Pronostico("02/01/17", "nublado", 18, 5, 2, 18, 15));
		p4.adiFinal_2(new Pronostico("02/01/17", "soleado", 21, 5, 2, 18, 15));
		
		LSimpleP p5 = new LSimpleP();
		p5.adiFinal_2(new Pronostico("02/01/17", "nublado", 18, 5, 2, 18, 15));
		p5.adiFinal_2(new Pronostico("02/01/17", "soleado", 21, 5, 2, 18, 15));
		p5.adiFinal_2(new Pronostico("30/01/17", "parcial", 30, 8, 2, 18, 15));

		m3.adiFinal_2(new NodoM("enero", p4));
		m3.adiFinal_2(new NodoM("noviembre", p5));

		adiFinal_2(new NodoE("Cochabamba", m3));
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
