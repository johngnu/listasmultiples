package Eje_1;

public class Sucursal {
	private String nombre;
	private LSimpleD d;
	private LSimpleE e;
	public Sucursal() {
		// TODO Auto-generated constructor stub
	}
	public Sucursal(String nombre, LSimpleD d, LSimpleE e) {
		super();
		this.nombre = nombre;
		this.d = d;
		this.e = e;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public LSimpleD getD() {
		return d;
	}
	public void setD(LSimpleD d) {
		this.d = d;
	}
	public LSimpleE getE() {
		return e;
	}
	public void setE(LSimpleE e) {
		this.e = e;
	}
	@Override
	public String toString() {
		return "Sucursal [nombre=" + nombre + "]";
	}
	public void mostrar() {
		System.out.println(toString());
		d.mostrar();
		e.mostrar();
	}
}
