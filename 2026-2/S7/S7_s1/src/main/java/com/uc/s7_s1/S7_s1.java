/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.uc.s7_s1;

/**
 *
 * @author flea_
 */
public class S7_s1 {

    public static void main(String[] args) {
        Pedido pedido= new Pedido(200,"Frecuente");
        EstrategiDescuentoFactoryV2 estrategiaDescuentoFactory= new EstrategiDescuentoFactoryV2();
        EstrategiaDescuento estrategiaDescuento= estrategiaDescuentoFactory.obtenerEstrategia(pedido.getTipoCliente());
        
        PedidoValidador pedidoValidador= new PedidoValidador();
        PedidoService pedidoService= new PedidoService(estrategiaDescuento,pedidoValidador);
        try{
            double total=pedidoService.calculatTotal(pedido); 
            System.out.println("Monto Original: "+ pedido.getMonto());
            System.out.println("Tipo Cliente: "+ pedido.getTipoCliente());
            System.out.println("Total: "+ total);
        }catch(PedidoInvalidoException e){
            System.out.println("Error"+e.getMessage());
        }   
    }
}
