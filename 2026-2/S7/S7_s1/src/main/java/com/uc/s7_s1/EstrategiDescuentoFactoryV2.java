/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uc.s7_s1;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author flea_
 */
public class EstrategiDescuentoFactoryV2 {
    private static final Map <String, EstrategiaDescuento> estrategias= new HashMap<>(); 
    static {
        registrar("VIP", new DescuentoVip());
        registrar("NORMAL", new SinDescuento());
        registrar("FRECUENTE", new DescuentoClienteFrecuente());
        registrar("PLATINUM", new DescuentoPlatinum());
        registrar("INICIAL", new DescuentoInicial());
        
    }
    public static void registrar(String tipoCliente, EstrategiaDescuento estrategiaDescuento){
        estrategias.put(tipoCliente, estrategiaDescuento);
    }
    public static EstrategiaDescuento obtenerEstrategia(String tipoCliente){
        String tipo = tipoCliente==null?"":tipoCliente.trim().toUpperCase();
        return estrategias.getOrDefault(tipo,new SinDescuento()); 
    }
}
