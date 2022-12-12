package br.com.leonardo.loja;

import java.math.BigDecimal;
import java.util.Arrays;

import br.com.leonardo.loja.pedido.GeraPedido;
import br.com.leonardo.loja.pedido.GeraPedidoHandler;
import br.com.leonardo.loja.pedido.acao.EnviarEmailPedido;
import br.com.leonardo.loja.pedido.acao.SalvarPedidoNoBDD;

public class TestePedido {
    public static void main(String[] args) {
        String cliente ="Leonard Ramos";
        BigDecimal valorOrcamento = new BigDecimal("300");
        int quantidadeItens = Integer.parseInt("2");

        GeraPedido gerador = new GeraPedido(cliente, valorOrcamento, quantidadeItens);
        GeraPedidoHandler handler = new GeraPedidoHandler(
            Arrays.asList(new SalvarPedidoNoBDD(), 
            new EnviarEmailPedido()));
        handler.execute(gerador);
    }
}