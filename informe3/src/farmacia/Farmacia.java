package farmacia;

public class Farmacia {

    private String nombre, direccion, regente;
    private LSimpleM m;

    public Farmacia() {
        // TODO Auto-generated constructor stub
    }

    public Farmacia(String nombre, String direccion, String regente, LSimpleM m) {
        super();
        this.nombre = nombre;
        this.direccion = direccion;
        this.regente = regente;
        this.m = m;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getRegente() {
        return regente;
    }

    public void setRegente(String regente) {
        this.regente = regente;
    }

    public LSimpleM getM() {
        return m;
    }

    public void setM(LSimpleM m) {
        this.m = m;
    }

    public void mostrar() {
        System.out.println("Farmacia [nombre=" + nombre + ", direccion=" + direccion + ", regente=" + regente + "]");
        m.mostrar();
    }

}
