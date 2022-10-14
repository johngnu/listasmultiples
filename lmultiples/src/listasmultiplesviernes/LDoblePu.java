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
public class LDoblePu {
    private NodoPu p;
    LDoblePu()
    {
        p=null;
    }

    public NodoPu getP() {
        return p;
    }

    public void setP(NodoPu p) {
        this.p = p;
    }
    public void adiFinal(int a, int b, int c, String d, LSimpleP e){
        NodoPu nue=new NodoPu();
        nue.setIdArea(a);
        nue.setIdSector(b);
        nue.setIdPuesto(c);
        nue.setNomExpositor(d);
        nue.setLp(e);
        
        if(getP()==null)
            setP(nue);
        else {
            NodoPu r=getP();
            while(r.getSig()!=null)
                r=r.getSig();
            r.setSig(nue);
            nue.setAnt(r);
        }
    }
    public void mostrar()
    {
        NodoPu o=getP();
        while(o!=null)
        {
            System.out.println("\nPUESTO: "+o.getIdArea()+" "+o.getIdSector()+" "+o.getIdPuesto()+" "+o.getNomExpositor());
            o.getLp().mostrar();
            o=o.getSig();
            
        }
    }
    
}
