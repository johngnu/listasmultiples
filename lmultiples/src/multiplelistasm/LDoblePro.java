/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiplelistasm;

/**
 *
 * @author Carmen Huanca
 */
public class LDoblePro {
    private NodoPro p;
    LDoblePro(){
        p=null;
    }

    public NodoPro getP() {
        return p;
    }

    public void setP(NodoPro p) {
        this.p = p;
    }
    public void adiFinal(String a, String b, String c, int d){
        NodoPro nuevo=new NodoPro();
        nuevo.setNombre(a);
        nuevo.setTipo(b);
        nuevo.setEntrega(c);
        nuevo.setPrecio(d);
        
        if(getP()==null)
            setP(nuevo);
        else {
            NodoPro r=getP();
            while(r.getSig()!=null)
                r=r.getSig();
            r.setSig(nuevo);
            nuevo.setAnt(r);
        }
    }
    public void mostrar()
    {
        System.out.println("");
        NodoPro o=getP();
        while(o!=null)
        {
            System.out.print("["+o.getNombre()+" "+o.getTipo()+" "+o.getEntrega()+" "+o.getPrecio()+"] ");
            o=o.getSig();
        }
    }
    
}
