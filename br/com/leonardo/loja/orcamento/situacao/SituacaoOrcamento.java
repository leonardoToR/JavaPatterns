package br.com.leonardo.loja.orcamento.situacao;

import java.math.BigDecimal;

import br.com.leonardo.loja.DomainException;
import br.com.leonardo.loja.orcamento.Orcamento;

public abstract class SituacaoOrcamento{
    public BigDecimal calcularValorDoDescontoExtra(Orcamento orcamento){
        return BigDecimal.ZERO;
    }

    public void aprovar(Orcamento orcamento){
        throw new DomainException("Orçamento nao pode ser aprovado");
    }

    public void reprovar(Orcamento orcamento){
        throw new DomainException("Orçamento nao pode ser reprovado");
    }
    public void finalizar(Orcamento orcamento){
        throw new DomainException("Orçamento nao pode ser finalizado");
    }
}
