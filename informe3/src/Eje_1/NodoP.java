package Eje_1;

public class NodoP {
	private String nombre, proveedor;
	private int cantidad,precio;
	private NodoP sig;
	public NodoP() {
		// TODO Auto-generated constructor stub
	}
	public NodoP(String nombre, String proveedor, int cantidad, int precio) {
		super();
		this.nombre = nombre;
		this.proveedor = proveedor;
		this.cantidad = cantidad;
		this.precio = precio;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getProveedor() {
		return proveedor;
	}
	public void setProveedor(String proveedor) {
		this.proveedor = proveedor;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public NodoP getSig() {
		return sig;
	}
	public void setSig(NodoP sig) {
		this.sig = sig;
	}
	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", proveedor=" + proveedor + ", cantidad=" + cantidad + ", precio=" + precio
				+ "]";
	}
	public void mostrar() {
		System.out.println(toString());
	}
}
