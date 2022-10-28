package Eje_2_;

public class NodoD {
	private Atencion a;
	private NodoD sig;
	public NodoD() {
		// TODO Auto-generated constructor stub
	}
	public NodoD(Atencion a) {
		super();
		this.a = a;
	}
	public Atencion getA() {
		return a;
	}
	public void setA(Atencion a) {
		this.a = a;
	}
	public NodoD getSig() {
		return sig;
	}
	public void setSig(NodoD sig) {
		this.sig = sig;
	}
	
}
