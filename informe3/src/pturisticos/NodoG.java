package pturisticos;

public class NodoG {
	private String codGuia, nombre;
	private NodoG sig;
	public NodoG() {
		// TODO Auto-generated constructor stub
	}
	public NodoG(String codGuia, String nombre) {
		super();
		this.codGuia = codGuia;
		this.nombre = nombre;
	}
	public String getCodGuia() {
		return codGuia;
	}
	public void setCodGuia(String codGuia) {
		this.codGuia = codGuia;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public NodoG getSig() {
		return sig;
	}
	public void setSig(NodoG sig) {
		this.sig = sig;
	}
	public void mostrar() {
		System.out.println("Guia [codGuia=" + codGuia + ", nombre=" + nombre + "]");
	}
	
}
