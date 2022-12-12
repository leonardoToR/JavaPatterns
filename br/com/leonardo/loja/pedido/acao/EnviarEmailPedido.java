package br.com.leonardo.loja.pedido.acao;

import br.com.leonardo.loja.pedido.Pedido;

public class EnviarEmailPedido  implements AcaoAposGerarPedido{
    
    public void executarAcao(Pedido pedido){
        System.out.println("Enviar pedido por email");
    }

}
