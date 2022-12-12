package br.com.leonardo.loja.descontos;

import java.math.BigDecimal;

import br.com.leonardo.loja.orcamento.Orcamento;

public class DescontoParaOrcamentoParaMaisDeCincoItens extends Desconto {
    public DescontoParaOrcamentoParaMaisDeCincoItens(Desconto proximo) {
        super(proximo);
    }

    public BigDecimal efetuarCalculo(Orcamento orcamento){
        
    return orcamento.getValor().multiply(new BigDecimal(0.1));
    }

    @Override
    public boolean deveAplicar(Orcamento orcamento) {
        // TODO Auto-generated method stub
        return orcamento.getQuantidadeItens() > 5;
    }
}