package temperatura;

public class Pronostico {

    private String fecha, cielo;
    private int temMax, temMin, precipitacion, humedad, velVieento;

    public Pronostico() {
        // TODO Auto-generated constructor stub
    }

    public Pronostico(String fecha, String cielo, int temMax, int temMin, int precipitacion, int humedad, int velVieento) {
        super();
        this.fecha = fecha;
        this.cielo = cielo;
        this.temMax = temMax;
        this.temMin = temMin;
        this.precipitacion = precipitacion;
        this.humedad = humedad;
        this.velVieento = velVieento;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getCielo() {
        return cielo;
    }

    public void setCielo(String cielo) {
        this.cielo = cielo;
    }

    public int getTemMax() {
        return temMax;
    }

    public void setTemMax(int temMax) {
        this.temMax = temMax;
    }

    public int getTemMin() {
        return temMin;
    }

    public void setTemMin(int temMin) {
        this.temMin = temMin;
    }

    public int getPrecipitacion() {
        return precipitacion;
    }

    public void setPrecipitacion(int precipitacion) {
        this.precipitacion = precipitacion;
    }

    public int getHumedad() {
        return humedad;
    }

    public void setHumedad(int humedad) {
        this.humedad = humedad;
    }

    public int getVelVieento() {
        return velVieento;
    }

    public void setVelVieento(int velVieento) {
        this.velVieento = velVieento;
    }

    @Override
    public String toString() {
        return "Pronostico [fecha=" + fecha + ", cielo=" + cielo + ", temMax=" + temMax + ", temMin=" + temMin
                + ", precipitacion=" + precipitacion + ", humedad=" + humedad + ", velVieento=" + velVieento + "]";
    }

    public void mostrar() {
        System.out.println(toString());
    }

}
