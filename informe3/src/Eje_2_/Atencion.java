package Eje_2_;

public class Atencion {
	private String dia,nombre,tipo,tratamiento;
	public Atencion() {
		// TODO Auto-generated constructor stub
	}
	public Atencion(String dia, String nombre, String tipo, String tratamiento) {
		super();
		this.dia = dia;
		this.nombre = nombre;
		this.tipo = tipo;
		this.tratamiento = tratamiento;
	}
	public String getDia() {
		return dia;
	}
	public void setDia(String dia) {
		this.dia = dia;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getTratamiento() {
		return tratamiento;
	}
	public void setTratamiento(String tratamiento) {
		this.tratamiento = tratamiento;
	}
	public void mostrar() {
		System.out.println("Atencion [dia=" + dia + ", nombre=" + nombre + ", tipo=" + tipo + ", tratamiento=" + tratamiento + "]");
	}
	
}
