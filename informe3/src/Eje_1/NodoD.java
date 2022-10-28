package Eje_1;

public class NodoD {
	private LSimpleV v;
	private NodoD sig;
	public NodoD() {
		// TODO Auto-generated constructor stub
	}
	public NodoD(LSimpleV v) {
		super();
		this.v = v;
	}
	public LSimpleV getV() {
		return v;
	}
	public void setV(LSimpleV v) {
		this.v = v;
	}
	public NodoD getSig() {
		return sig;
	}
	public void setSig(NodoD sig) {
		this.sig = sig;
	}
	public void mostrar() {
		v.mostrar();
	}
}
