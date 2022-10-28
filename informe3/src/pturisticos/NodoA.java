package pturisticos;

public class NodoA {
	private String codGuia, hora, nombre;
	private NodoA sig;
	
	public NodoA() {
		// TODO Auto-generated constructor stub
	}
	public NodoA(String codGuia, String hora, String nombre) {
		super();
		this.codGuia = codGuia;
		this.hora = hora;
		this.nombre = nombre;
	}

	public String getCodGuia() {
		return codGuia;
	}

	public void setCodGuia(String codGuia) {
		this.codGuia = codGuia;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public NodoA getSig() {
		return sig;
	}

	public void setSig(NodoA sig) {
		this.sig = sig;
	}

	public void mostrar() {
		System.out.println("Actividad [codGuia=" + codGuia + ", hora=" + hora + ", nombre=" + nombre + "]");
	}
	
}
