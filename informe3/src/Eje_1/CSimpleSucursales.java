package Eje_1;

public class CSimpleSucursales {
	private int max = 40;
    private Sucursal v[] = new Sucursal[max+1];
    private int ini,fin;
	public CSimpleSucursales(){
	        ini=fin=0;
    }
	public boolean esvacia (){
	if (ini == 0 && fin == 0)
	    return (true);
	return (false);
    }
    public boolean esllena (){
		if (fin == max)
		    return (true);
		return (false);
	}
	public int nroelem (){
		return (fin - ini);
    }
	public void adicionar (Sucursal elem) {
		if (!esllena ()) {
		    fin++;
		    v [fin] = elem;
		}
		else
		    System.out.println ("Cola Simple llena Mascota");
    }
	public Sucursal eliminar (){
		Sucursal elem = new Sucursal();
		if (!esvacia ()){
		    ini++;
		    elem = v [ini];
		    if (ini == fin)
		    	ini = fin = 0;
		}
		else
		    System.out.println ("Cola Simple vacia");
		return (elem);
    }
	public void mostrar (){
		Sucursal elem;
		if (esvacia ())
		    System.out.println ("Cola vacia");
		else{
		    System.out.println ("\n Datos de la Cola ");
		    CSimpleSucursales aux = new CSimpleSucursales();
		    while (!esvacia ()){
				elem = eliminar ();
				aux.adicionar (elem);
				elem.mostrar ();
				System.out.println();
		    }
		    while (!aux.esvacia ()){
				elem = aux.eliminar ();
				adicionar (elem);
		    }
		}
	 }
	 public void vaciar (CSimpleSucursales a){
		while (!a.esvacia ())
		    adicionar (a.eliminar ());
	 }
	 public void llenar2() {
		 LSimpleE e1 = new LSimpleE();
		LSimpleD d1 = new LSimpleD();
		LSimpleV v1 = new LSimpleV();
		LSimpleV v2 = new LSimpleV();
		LSimpleP p1 = new LSimpleP();
		
		p1.adiFinal_2(new NodoP("pan", "san gabriel", 15, 8));
		p1.adiFinal_2(new NodoP("helado", "delizia", 12, 4));
		p1.adiFinal_2(new NodoP("carne", "sofia", 8, 22));
		
		v1.adiFinal_2(new NodoV("111", "E111", "juan", "15:13", p1));
		v2.adiFinal_2(new NodoV("222", "E444", "pedro", "11:30",p1));
		
		d1.adiFinal_2(new NodoD(v1));
		d1.adiFinal_2(new NodoD(v2));
		
		e1.adiFinal("E111", "juan");
		e1.adiFinal("E222", "jorge");
		e1.adiFinal("E333", "pedro");
		e1.adiFinal("E444", "lucas");
		adicionar(new Sucursal("golden", d1, e1));
		
		LSimpleE e2 = new LSimpleE();
		LSimpleD d2 = new LSimpleD();
		LSimpleV v3 = new LSimpleV();
		LSimpleV v4 = new LSimpleV();
		LSimpleP p2 = new LSimpleP();
		LSimpleP p3 = new LSimpleP();
		
		p2.adiFinal_2(new NodoP("pan", "san gabriel", 15, 8));
		p2.adiFinal_2(new NodoP("helado", "delizia", 12, 4));
		p2.adiFinal_2(new NodoP("carne", "sofia", 8, 22));
		
		v3.adiFinal_2(new NodoV("111", "E222", "juan", "15:13", p2));
		
		p3.adiFinal_2(new NodoP("matequilla", "regia", 2, 15));
		p3.adiFinal_2(new NodoP("leche", "pil", 12, 5));
		v4.adiFinal_2(new NodoV("333", "E222", "pedro", "11:30",p3));
		
		d2.adiFinal_2(new NodoD(v3));
		d2.adiFinal_2(new NodoD(v4));
		
		e2.adiFinal("E111", "juan");
		e2.adiFinal("E222", "jorge");
		e2.adiFinal("E666", "lucy");
		adicionar(new Sucursal("primavera", d2, e2));	
		 
		LSimpleE e3 = new LSimpleE();
		LSimpleD d3 = new LSimpleD();
		LSimpleV v5 = new LSimpleV();
		LSimpleV v6 = new LSimpleV();
		LSimpleP p4 = new LSimpleP();
		LSimpleP p5 = new LSimpleP();
		
		p4.adiFinal_2(new NodoP("galletas", "san gabriel", 15, 8));
		p4.adiFinal_2(new NodoP("leche", "delizia", 12, 4));
		p4.adiFinal_2(new NodoP("embutidos", "sofia", 8, 22));
		
		v5.adiFinal_2(new NodoV("111", "E666", "juan", "15:13", p4));
		
		p5.adiFinal_2(new NodoP("matequilla", "regia", 15, 15));
		p5.adiFinal_2(new NodoP("leche", "pil", 12, 5));
		p5.adiFinal_2(new NodoP("carne", "sofia", 8, 20));
		v6.adiFinal_2(new NodoV("111", "E666", "pedro", "11:30",p5));
		
		d3.adiFinal_2(new NodoD(v5));
		d3.adiFinal_2(new NodoD(v6));
		
		e3.adiFinal("E111", "juan");
		e3.adiFinal("E222", "jorge");
		e3.adiFinal("E444", "lucas");
		e3.adiFinal("E666", "lucy");
		adicionar(new Sucursal("lurdes", d3, e3));	
		
	 }
}

