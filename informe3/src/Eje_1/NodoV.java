package Eje_1;

public class NodoV {
	private String ci, codEmpleado , nombre, hora;
	private LSimpleP p;
	private NodoV sig;
	public NodoV() {
		// TODO Auto-generated constructor stub
	}
	public NodoV(String ci, String codEmpleado, String nombre, String hora, LSimpleP p) {
		super();
		this.ci = ci;
		this.codEmpleado = codEmpleado;
		this.nombre = nombre;
		this.hora = hora;
		this.p = p;
	}
	public String getCi() {
		return ci;
	}
	public void setCi(String ci) {
		this.ci = ci;
	}
	public String getCodEmpleado() {
		return codEmpleado;
	}
	public void setCodEmpleado(String codEmpleado) {
		this.codEmpleado = codEmpleado;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getHora() {
		return hora;
	}
	public void setHora(String hora) {
		this.hora = hora;
	}
	public LSimpleP getP() {
		return p;
	}
	public void setP(LSimpleP p) {
		this.p = p;
	}
	public NodoV getSig() {
		return sig;
	}
	public void setSig(NodoV sig) {
		this.sig = sig;
	}
	@Override
	public String toString() {
		return "Venta [ci=" + ci + ", codEmpleado=" + codEmpleado + ", nombre=" + nombre + ", hora=" + hora + "]";
	}
	public void mostrar() {
		System.out.println(toString());
		p.mostrar();
	}
}
