package pturisticos;

public class NodoDV {
	private LSimpleA la;
	private NodoDV ant,sig;
	public NodoDV() {
		// TODO Auto-generated constructor stub
	}
	public NodoDV(LSimpleA la) {
		super();
		this.la = la;
	}
	public LSimpleA getLa() {
		return la;
	}
	public void setLa(LSimpleA la) {
		this.la = la;
	}
	
	public NodoDV getAnt() {
		return ant;
	}
	public void setAnt(NodoDV ant) {
		this.ant = ant;
	}
	public NodoDV getSig() {
		return sig;
	}
	public void setSig(NodoDV sig) {
		this.sig = sig;
	}
	public void mostrar() {
		la.mostrar();
	}
}
