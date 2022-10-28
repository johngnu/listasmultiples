package pturisticos;

public class NodoD {
	private String codDestino,nombre;
	private int costo;
	private NodoD ant,sig;
	public NodoD() {
		// TODO Auto-generated constructor stub
	}
	public NodoD(String codDestino, String nombre, int costo) {
		super();
		this.codDestino = codDestino;
		this.nombre = nombre;
		this.costo = costo;
	}
	public String getCodDestino() {
		return codDestino;
	}
	public void setCodDestino(String codDestino) {
		this.codDestino = codDestino;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getCosto() {
		return costo;
	}
	public void setCosto(int costo) {
		this.costo = costo;
	}
	public NodoD getAnt() {
		return ant;
	}
	public void setAnt(NodoD ant) {
		this.ant = ant;
	}
	public NodoD getSig() {
		return sig;
	}
	public void setSig(NodoD sig) {
		this.sig = sig;
	}
	public void mostrar() {
		System.out.println("Des_turitico [codDestino=" + codDestino + ", nombre=" + nombre + ", costo=" + costo + "]");
	}
	
}
