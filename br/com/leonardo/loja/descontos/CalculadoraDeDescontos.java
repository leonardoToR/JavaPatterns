package br.com.leonardo.loja.descontos;

import java.math.BigDecimal;

import br.com.leonardo.loja.orcamento.Orcamento;

public class CalculadoraDeDescontos {
    

    public BigDecimal calcular(Orcamento orcamento){
        Desconto desconto = new DescontoParaOrcamentoParaMaisDeCincoItens(
            new DescontoParaOrcamentoParaValorMaiorQueQuientos(
                new SemDesconto()));
        
        return desconto.efetuarCalculo(orcamento);
    }
}
