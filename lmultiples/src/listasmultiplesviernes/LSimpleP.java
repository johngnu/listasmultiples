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
public class LSimpleP {
    private NodoP p;
    
    LSimpleP()
    {
        p=null;
    }

    public NodoP getP() {
        return p;
    }

    public void setP(NodoP p) {
        this.p = p;
    }
    public void adiFinal(String n, int pr){
        NodoP nuevo=new NodoP();
        nuevo.setNombre(n);
        nuevo.setPrecioUnit(pr);
        
        if(getP()==null)
            setP(nuevo);
        else {
            NodoP r=getP();
            while(r.getSig()!=null)
                r=r.getSig();
            r.setSig(nuevo);
        }
    }
    public void mostrar()
    {
        NodoP o=getP();
        System.out.println("LISTA PRODUCTOS :");
        while(o!=null)
        {
            System.out.print("<"+o.getNombre()+" "+o.getPrecioUnit()+"> ");
            o=o.getSig();
        }
    }
}
