package pturisticos;

public class LDobleDT {
	private NodoD p;
	public LDobleDT() {
		p=null;
	}
	public NodoD getP() {
		return p;
	}
	public void setP(NodoD p) {
		this.p = p;
	}
	public void adiprincipio(NodoD nuevo) {
		if(getP()==null)
			setP(nuevo);
		else {
			nuevo.setSig(getP());
			getP().setAnt(nuevo);
			setP(nuevo);
		}
	}
	public void adifinal(NodoD nuevo) {
		if(getP()==null)
			setP(nuevo);
		else{
			NodoD r = getP();
			while(r.getSig()!=null)
				r=r.getSig();
			r.setSig(nuevo);
			nuevo.setAnt(r);
		}
	}
	public int nroNodos() {
		NodoD r = getP();
		int cont=0;
		while(r!=null) {
			cont++;
			r=r.getSig();
		}
		return cont;
	}
	public void mostrar() {
		System.out.println("-----------Des_Turisticos------------ ");
		NodoD z = getP();
		while (z!=null) {
			System.out.println("Des_turitico [codDestino=" + z.getCodDestino() + ", nombre=" + z.getNombre() + ", costo=" + z.getCosto() + "]");
			z=z.getSig();
		}
	}
	public void leer() {
		adifinal(new NodoD("D111", "death road", 150));
		adifinal(new NodoD("D222", "coroico", 900));
		adifinal(new NodoD("D333", "cascadas", 100));
		adifinal(new NodoD("D444", "mirador luna", 250));
		adifinal(new NodoD("D555", "casa moneda", 550));
	}
}

