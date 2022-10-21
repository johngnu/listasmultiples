package listasm;

public class TipoVehiculo {

    private int idTipo;
    private String nomTipo;

    public TipoVehiculo(int idTipo, String nomTipo) {
        this.idTipo = idTipo;
        this.nomTipo = nomTipo;
    }

    public int getIdTipo() {
        return idTipo;
    }

    public void setIdTipo(int idTipo) {
        this.idTipo = idTipo;
    }

    public String getNomTipo() {
        return nomTipo;
    }

    public void setNomTipo(String nomTipo) {
        this.nomTipo = nomTipo;
    }

}
