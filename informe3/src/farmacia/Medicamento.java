package farmacia;

public class Medicamento {

    private String nombre, marca;
    private int stock;

    public Medicamento() {
        // TODO Auto-generated constructor stub
    }

    public Medicamento(String nombre, String marca, int stock) {
        super();
        this.nombre = nombre;
        this.marca = marca;
        this.stock = stock;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void mostrar() {
        System.out.println("Medicamento [nombre=" + nombre + ", marca=" + marca + ", stock=" + stock + "]");
    }

}
