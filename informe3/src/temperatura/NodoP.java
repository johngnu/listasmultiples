package temperatura;

public class NodoP {
	private Pronostico p;
	private NodoP sig;
	public NodoP() {
		// TODO Auto-generated constructor stub
	}
	public NodoP(Pronostico p) {
		super();
		this.p = p;
	}
	public Pronostico getP() {
		return p;
	}
	public void setP(Pronostico p) {
		this.p = p;
	}
	public NodoP getSig() {
		return sig;
	}
	public void setSig(NodoP sig) {
		this.sig = sig;
	}
	
}
