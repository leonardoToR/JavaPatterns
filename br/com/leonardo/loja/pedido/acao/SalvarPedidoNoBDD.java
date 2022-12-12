package br.com.leonardo.loja.pedido.acao;

import br.com.leonardo.loja.pedido.Pedido;

public class SalvarPedidoNoBDD implements AcaoAposGerarPedido {
    
    public void executarAcao(Pedido pedido){
        System.out.println("Salvando pedido no BDD");
    }

}
