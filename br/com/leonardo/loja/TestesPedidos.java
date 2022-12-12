package br.com.leonardo.loja;

import java.math.BigDecimal;
import java.util.Arrays;

import br.com.leonardo.loja.pedido.GeraPedido;
import br.com.leonardo.loja.pedido.GeraPedidoHandler;
import br.com.leonardo.loja.pedido.acao.EnviarEmailPedido;
import br.com.leonardo.loja.pedido.acao.LogDePedido;
import br.com.leonardo.loja.pedido.acao.CriarPedidoNoBanco;

public class TestesPedidos {

	public static void main(String[] args) {
		String cliente = "Ana da Silva";
		BigDecimal valorOrcamento = new BigDecimal("745.99");
		int quantidadeItens = 3;
		
		GeraPedido gerador = new GeraPedido(cliente, valorOrcamento, quantidadeItens);
		GeraPedidoHandler handler = new GeraPedidoHandler(Arrays.asList(
			new EnviarEmailPedido(), 
			new CriarPedidoNoBanco(), 
			new LogDePedido() ));
		handler.executar(gerador);
	}

}
