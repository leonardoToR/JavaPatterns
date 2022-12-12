package br.com.leonardo.loja.imposto;

import java.math.BigDecimal;

import br.com.leonardo.loja.orcamento.Orcamento;

public class CalculadoraDeImpostos {
    /**
     * @param orcamento
     * @return
     */
    public BigDecimal calcular(Orcamento orcamento, Imposto imposto){
        return imposto.calcular(orcamento);
    }
}
