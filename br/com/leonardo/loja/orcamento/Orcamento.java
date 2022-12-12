package br.com.leonardo.loja.orcamento;

import java.math.BigDecimal;

import br.com.leonardo.loja.orcamento.situacao.EmAnalise;
import br.com.leonardo.loja.orcamento.situacao.SituacaoOrcamento;

public class Orcamento {
    private BigDecimal valor;
    private int quantidadeItens;
    private SituacaoOrcamento situacao;
    
    
    public Orcamento(BigDecimal valor, int quantidadeItens) {
        this.valor = valor;
        this.quantidadeItens = quantidadeItens;
        this.situacao = new EmAnalise();
    }
    public void aplicarDesconstoExtra(){
        BigDecimal valorDoDescontoExtra = this.situacao.calcularValorDoDescontoExtra(this);
        this.valor = this.valor.subtract(valorDoDescontoExtra);
    }
    public void aprovar(){
        this.situacao.aprovar(this);
    }
    public void reprovar(){
        this.situacao.reprovar(this);
    }
    public void finalizar(){
        this.situacao.finalizar(this);
    }
    public void setSituacao(SituacaoOrcamento situacao) {
        this.situacao = situacao;
    }
    public SituacaoOrcamento getSituacao() {
        return situacao;
    }
    
    
    
    public BigDecimal getValor() {
        return valor;
    }
    
        public int getQuantidadeItens() {
            return quantidadeItens;
        }
    
}
