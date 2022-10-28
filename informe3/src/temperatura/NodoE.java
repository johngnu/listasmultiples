package temperatura;

public class NodoE {
	private String ciudad;
	private LSimpleM m;
	private NodoE sig;
	public NodoE() {
		// TODO Auto-generated constructor stub
	}
	public NodoE(String ciudad, LSimpleM m) {
		super();
		this.ciudad = ciudad;
		this.m = m;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public LSimpleM getM() {
		return m;
	}
	public void setM(LSimpleM m) {
		this.m = m;
	}
	public NodoE getSig() {
		return sig;
	}
	public void setSig(NodoE sig) {
		this.sig = sig;
	}

	public void mostrar() {
		System.out.println("Estacion [ciudad=" + ciudad +  "]");
		m.mostrar();
	}
}
