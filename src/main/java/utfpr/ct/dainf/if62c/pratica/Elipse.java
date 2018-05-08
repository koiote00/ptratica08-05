/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.ct.dainf.if62c.pratica;

public class Elipse {
    public double r;
    public double s;
    
    public Elipse(double r, double s){
        this.r=r;
        this.s=s;
    }

    Elipse() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public double getArea() {
    return Math.PI*r*s;
    
}
    public double getPerimetro(){
        return Math.PI*(3*(r+s) - Math.sqrt( (3*r+s)*(r+3*s)));
    }
}