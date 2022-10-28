package pturisticos;

public class NodoC {
	private String ci, nombre;
	private NodoC sig;
	public NodoC() {
		// TODO Auto-generated constructor stub
	}
	public NodoC(String ci, String nombre) {
		super();
		this.ci = ci;
		this.nombre = nombre;
	}
	public String getCi() {
		return ci;
	}
	public void setCi(String ci) {
		this.ci = ci;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public NodoC getSig() {
		return sig;
	}
	public void setSig(NodoC sig) {
		this.sig = sig;
	}
	public void mostrar() {
		System.out.println("NodoC [ci=" + ci + ", nombre=" + nombre + "]");
	}
	
}
