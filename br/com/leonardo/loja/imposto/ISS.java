package br.com.leonardo.loja.imposto;

import java.math.BigDecimal;

import br.com.leonardo.loja.orcamento.Orcamento;

public class ISS extends Imposto {

	public ISS(Imposto outro) {
		super(outro);
	}
	
	public BigDecimal realizarCalculoEspecifico(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.06"));
	}

}
