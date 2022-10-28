package temperatura;

public class NodoM {
	private String mes;
	private LSimpleP p;
	private NodoM sig;
	public NodoM() {
		// TODO Auto-generated constructor stub
	}
	public NodoM(String mes, LSimpleP p) {
		super();
		this.mes = mes;
		this.p = p;
	}
	public String getMes() {
		return mes;
	}
	public void setMes(String mes) {
		this.mes = mes;
	}
	public LSimpleP getP() {
		return p;
	}
	public void setP(LSimpleP p) {
		this.p = p;
	}
	public NodoM getSig() {
		return sig;
	}
	public void setSig(NodoM sig) {
		this.sig = sig;
	}
	@Override
	public String toString() {
		return "Mes [mes=" + mes + "]";
	}
	public void mostrar() {
		System.out.println(toString());
		p.mostrar();
	}
}
