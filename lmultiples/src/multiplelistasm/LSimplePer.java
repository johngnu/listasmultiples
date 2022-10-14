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
public class LSimplePer {
    private NodoPer p;
    
    LSimplePer()
    {
        p=null;
    }

    public NodoPer getP() {
        return p;
    }

    public void setP(NodoPer p) {
        this.p = p;
    }
    public void adiFinal(String a, String b){
        NodoPer nuevo=new NodoPer();
        nuevo.setNombre(a);
        nuevo.setCargo(b);
        
        if(getP()==null)
            setP(nuevo);
        else {
            NodoPer r=getP();
            while(r.getSig()!=null)
                r=r.getSig();
            r.setSig(nuevo);
        }
    }
    public void mostrar()
    { 
        System.out.println("");
        NodoPer o=getP();
        while(o!=null)
        {
            System.out.print("<"+o.getNombre()+" "+o.getCargo()+"> ");
            o=o.getSig();
        }
    }
    
}
