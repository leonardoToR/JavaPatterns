package br.com.leonardo.loja.orcamento;

import java.math.BigDecimal;

public class OrcamentoProxy extends Orcamento {
    private BigDecimal valor;
    private Orcamento orcamento;
    
    public OrcamentoProxy(BigDecimal i, int quantidadeItens, Orcamento orcamento) {
        super(i, quantidadeItens);
        this.orcamento = orcamento;
    }

    /**
     * @param orcamento
     */
    
   
    @Override
    public BigDecimal getValor() {
        if(valor == null){
            this.valor = orcamento.getValor();
        }

        return this.valor;
    }

    
}
