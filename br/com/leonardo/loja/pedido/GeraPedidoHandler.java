package br.com.leonardo.loja.pedido;

import java.time.LocalDateTime;
import java.util.List;

import br.com.leonardo.loja.orcamento.Orcamento;
import br.com.leonardo.loja.pedido.acao.AcaoAposGerarPedido;

public class GeraPedidoHandler {

    private List<AcaoAposGerarPedido> acoes;

    //construtor com injeção de dependencias : repository, service, etc

    public GeraPedidoHandler(List<AcaoAposGerarPedido> acoes) {
        this.acoes = acoes;
    }

    public void execute(GeraPedido dados){
        Orcamento orcamento = new Orcamento(dados.getValorOrcamento(), dados.getQuantidadeItens());
        String cliente = dados.getCliente();
        LocalDateTime data = LocalDateTime.now();

        Pedido pedido = new Pedido(cliente, data, orcamento);

        acoes.forEach(a -> a.executarAcao(pedido));
    }
    
}
