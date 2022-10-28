package pturisticos;

public class PilaPaquetesTuristicos {
	private int max=10;
    private PaqueteTuristico v[]=new PaqueteTuristico[max+1];
    private int tope;
    
    public PilaPaquetesTuristicos()
    {
        tope=0;
    }
    public boolean esvacia ()//empty
    {
		if (tope == 0)
		    return (true);
		return (false);
    }
    public boolean esllena ()
    {
		if (tope == max)
		    return (true);
		return (false);
    }
    public int nroelem () //size
    {
    	return (tope);
    }
    public void adicionar (PaqueteTuristico elem) //push
    {
		if (!esllena ())
		{
		    tope++;
		    v [tope] = elem;
		}
		else
		    System.out.println ("Pila llena");
    }
    public PaqueteTuristico eliminar () //pop
    {
    	PaqueteTuristico elem = new PaqueteTuristico();
		if (!esvacia ())
		{
		    elem = v [tope];
		    tope--;
		}
		else
		    System.out.println ("Pila vacia");
		return (elem);
    }
    public void mostrar ()
    {
    	PaqueteTuristico elem;
		if (esvacia ())
		    System.out.println ("Pila vacia");
		else{
		    
			PilaPaquetesTuristicos aux = new PilaPaquetesTuristicos ();
		    while (!esvacia ()){
				elem = eliminar ();
				aux.adicionar (elem);
				elem.mostrar();
		    }
		    vaciar(aux);
		}
    }
    public void llenar (int n)
    {
		int i;
		for (i = 1 ; i <= n ; i++)
		{
			PaqueteTuristico l = new PaqueteTuristico();
		    //Leer
		    adicionar (l);
		}
    }
    public void vaciar (PilaPaquetesTuristicos a)
    {
	while (!a.esvacia ())
	    adicionar (a.eliminar ());
    }
	public int nroElem() {
		return tope;
	}
	public void llenar2() {
		LDCircularDV dv1 = new LDCircularDV();
		LSimpleA a1 = new LSimpleA();
		a1.adiFinal("g222", "11:30", "almuerzo");
		a1.adiFinal("g111", "12:30", "paseo");
		a1.adiFinal("g222", "13:30", "visita");
		LSimpleA a2 = new LSimpleA();
		a2.adiFinal("g111", "09:30", "visita");
		a2.adiFinal("g111", "10:30", "tour");
		a2.adiFinal("g222", "11:30", "almuerzo");
		
		dv1.adiFinal(a1);
		dv1.adiFinal(a2);
		LSimpleG g1 = new LSimpleG();
		g1.adiFinal("g111", "juan");
		g1.adiFinal("g222", "lucas");
		g1.adiFinal("g333", "pedro");
		adicionar(new PaqueteTuristico("D111", "111", dv1, g1));
		
		
		LDCircularDV dv2 = new LDCircularDV();
		LSimpleA a3 = new LSimpleA();
		a3.adiFinal("g111", "11:30", "almuerzo");
		a3.adiFinal("g111", "12:30", "paseo");
		a3.adiFinal("g222", "13:30", "visita");
		LSimpleA a4 = new LSimpleA();
		a4.adiFinal("g111", "09:30", "visita");
		a4.adiFinal("g111", "10:30", "tour");
		a4.adiFinal("g111", "11:30", "almuerzo");
		LSimpleA a5 = new LSimpleA();
		a5.adiFinal("g555", "09:30", "visita");
		a5.adiFinal("g555", "10:30", "tour");
		a5.adiFinal("g111", "11:30", "almuerzo");
		
		dv2.adiFinal(a3);
		dv2.adiFinal(a4);
		dv2.adiFinal(a5);
		LSimpleG g2 = new LSimpleG();
		g2.adiFinal("g111", "juan");
		g2.adiFinal("g222", "lucas");
		g2.adiFinal("g333", "pedro");
		g2.adiFinal("g444", "maria");
		g2.adiFinal("g555", "lucia");
		adicionar(new PaqueteTuristico("D222", "111", dv2, g2));
		
	}

}
