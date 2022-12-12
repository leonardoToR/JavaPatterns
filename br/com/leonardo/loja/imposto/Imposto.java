package br.com.leonardo.loja.imposto;

import java.math.BigDecimal;

import br.com.leonardo.loja.orcamento.Orcamento;

public interface Imposto {
    

    BigDecimal calcular(Orcamento orcamento);
}
