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
public class LSimpleSta {
    private NodoSta p;
    
    LSimpleSta()
    {
        p=null;
    }

    public NodoSta getP() {
        return p;
    }

    public void setP(NodoSta p) {
        this.p = p;
    }
    public void adiFinal(int a, Empresa b, LSimplePer c, LDoblePro d){
        NodoSta nuevo=new NodoSta();
        nuevo.setNroStand(a);
        nuevo.setE(b);
        nuevo.setA(c);
        nuevo.setB(d);
        
        if(getP()==null)
            setP(nuevo);
        else {
            NodoSta r=getP();
            while(r.getSig()!=null)
                r=r.getSig();
            r.setSig(nuevo);
        }
    }
    public void mostrar()
    { 
       
        NodoSta o=getP();
        while(o!=null)
        {
            System.out.print("\n\nNRO. STAND : "+o.getNroStand());
            o.getE().mostrar();
            o.getA().mostrar();
            o.getB().mostrar();
            o=o.getSig();
        }
    }
    
}
