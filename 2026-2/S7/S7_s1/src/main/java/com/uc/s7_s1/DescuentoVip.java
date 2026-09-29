/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uc.s7_s1;

/**
 *
 * @author flea_
 */
public class DescuentoVip implements EstrategiaDescuento{

    @Override
    public double aplicarDescuento(double monto) {
        double montoFinal; 
        if (monto>1000){
            montoFinal=monto * 0.88;
        }
        else{
            montoFinal=monto; 
        }
        return montoFinal; 
    }
    
}
