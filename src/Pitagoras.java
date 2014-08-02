/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 30
 */
public class Pitagoras {
    
    double hipotenusa;
    public double CalcularHipotenusa(double catetoA,double catetoB){
        hipotenusa= Math.sqrt (Math.pow(catetoA,2)+ Math.pow(catetoB,2));
        return hipotenusa;
                
            }
   
}
