/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uc.s7_s1;

/**
 *
 * @author flea_
 */
public class PedidoValidador {
    public void validar(Pedido pedido){
        if(pedido==null){
            throw new PedidoInvalidoException("El pedido no puede ser nulo");
        }
        if(pedido.getMonto()<=0){
            throw new PedidoInvalidoException("El monto debe ser mayor a cero");
        }
    }
}
