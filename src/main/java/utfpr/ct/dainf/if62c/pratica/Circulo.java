/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.ct.dainf.if62c.pratica;

import java.lang.Math;

/**
 * @author Marcelo G. Costa <marcelo@unicode.com.br>
 */
public class Circulo extends Elipse {

    public Circulo(double r) {
        super(r, r);
    }
    
        
    @Override
    public double getPerimetro(){
        System.out.println("ola");
        return 2*Math.PI*r;
    }
       

}
