package br.com.leonardo.loja;

import java.math.BigDecimal;

import br.com.leonardo.loja.orcamento.ItemOrcamento;
import br.com.leonardo.loja.orcamento.Orcamento;
import br.com.leonardo.loja.orcamento.OrcamentoProxy;

public class TesteComposicao{

    public static void main(String[] args) {
        Orcamento antigo = new Orcamento(null, 0);
        antigo.adcionarItem(new ItemOrcamento(new BigDecimal("200")));
        antigo.reprovar();

        Orcamento novo  =new Orcamento(null, 0);
        novo.adcionarItem(new ItemOrcamento(new BigDecimal("500")));
        novo.adcionarItem(antigo);

        OrcamentoProxy proxy = new OrcamentoProxy(null, 0, novo);

        System.out.println(proxy.getValor());   
     }
}