/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uc.s7_s1;

/**
 *
 * @author flea_
 */
public class PedidoService {
    private EstrategiaDescuento estrategiaDescuento;
    private PedidoValidador pedidoValidador;
    public PedidoService(EstrategiaDescuento estrategiaDescuento,PedidoValidador pedidoValidador){
        this.pedidoValidador=pedidoValidador;
        this.estrategiaDescuento=estrategiaDescuento;
    }
    public double calculatTotal(Pedido pedido){
        pedidoValidador.validar(pedido);
        return estrategiaDescuento.aplicarDescuento(pedido.getMonto());
    }
}
