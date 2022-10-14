/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listasmultiplesviernes;

/**
 *
 * @author Carmen Huanca
 */
public class NodoPu {
    private int idArea, idSector, idPuesto;
    private String nomExpositor;
    private LSimpleP lp;
    private NodoPu ant,sig;
    NodoPu()
    {
        ant=sig=null;
    }

    public int getIdArea() {
        return idArea;
    }

    public void setIdArea(int idArea) {
        this.idArea = idArea;
    }

    public int getIdSector() {
        return idSector;
    }

    public void setIdSector(int idSector) {
        this.idSector = idSector;
    }

    public int getIdPuesto() {
        return idPuesto;
    }

    public void setIdPuesto(int idPuesto) {
        this.idPuesto = idPuesto;
    }

    public String getNomExpositor() {
        return nomExpositor;
    }

    public void setNomExpositor(String nomExpositor) {
        this.nomExpositor = nomExpositor;
    }

    public LSimpleP getLp() {
        return lp;
    }

    public void setLp(LSimpleP lp) {
        this.lp = lp;
    }

    public NodoPu getAnt() {
        return ant;
    }

    public void setAnt(NodoPu ant) {
        this.ant = ant;
    }

    public NodoPu getSig() {
        return sig;
    }

    public void setSig(NodoPu sig) {
        this.sig = sig;
    }
    
    
}
