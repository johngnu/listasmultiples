package Eje_2_;

public class NodoM {
	private String mes;
	private LSimpleD d;
	private NodoM sig;
	public NodoM() {
		// TODO Auto-generated constructor stub
	}
	public NodoM(String mes, LSimpleD d) {
		super();
		this.mes = mes;
		this.d = d;
	}
	public String getMes() {
		return mes;
	}
	public void setMes(String mes) {
		this.mes = mes;
	}
	public LSimpleD getD() {
		return d;
	}
	public void setD(LSimpleD d) {
		this.d = d;
	}
	public NodoM getSig() {
		return sig;
	}
	public void setSig(NodoM sig) {
		this.sig = sig;
	}
	public void mostrar() {
		System.out.println("NodoM [mes=" + mes + "]");
		d.mostrar();
	}
}
