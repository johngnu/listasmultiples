package listasm;

public class RangoModelo {

    private int idRango;
    private String nomRango;

    public RangoModelo(int idRango, String nomRango) {
        this.idRango = idRango;
        this.nomRango = nomRango;
    }

    public void mostrar() {
        System.out.println("idRango: " + idRango + ", nomRango: " + nomRango);
    }

    public int getIdRango() {
        return idRango;
    }

    public void setIdRango(int idRango) {
        this.idRango = idRango;
    }

    public String getNomRango() {
        return nomRango;
    }

    public void setNomRango(String nomRango) {
        this.nomRango = nomRango;
    }

}
