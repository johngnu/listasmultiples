package Eje_1;

public class NodoE {
	private String codEmpleado,nombre;
	private NodoE sig;
	public NodoE() {
		// TODO Auto-generated constructor stub
	}
	public NodoE(String codEmpleado, String nombre) {
		super();
		this.codEmpleado = codEmpleado;
		this.nombre = nombre;
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
	public NodoE getSig() {
		return sig;
	}
	public void setSig(NodoE sig) {
		this.sig = sig;
	}
	@Override
	public String toString() {
		return "Empleado [codEmpleado=" + codEmpleado + ", nombre=" + nombre + "]";
	}
	public void mostrar() {
		System.out.println(toString());
	}
}
