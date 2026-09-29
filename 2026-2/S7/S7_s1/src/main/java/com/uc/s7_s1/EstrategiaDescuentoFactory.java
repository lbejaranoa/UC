/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uc.s7_s1;

/**
 *
 * @author flea_
 */
public class EstrategiaDescuentoFactory {
    public static EstrategiaDescuento crear(String tipoCliente){
        if(tipoCliente==null || tipoCliente.isBlank()){
            return new SinDescuento(); 
        }
        return switch(tipoCliente.trim().toUpperCase()){
            case "VIP"-> new DescuentoVip();
            case "FRECUENTE"-> new DescuentoClienteFrecuente();
            case "PLATINUM"-> new DescuentoPlatinum(); 
            default -> new SinDescuento();
        };
    }
}
