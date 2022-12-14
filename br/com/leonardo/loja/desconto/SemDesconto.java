package br.com.leonardo.loja.desconto;

import java.math.BigDecimal;

import br.com.leonardo.loja.orcamento.Orcamento;

public class SemDesconto extends Desconto {

	public SemDesconto() {
		super(null);
	}

	

	@Override
	public BigDecimal efetuarCalculo(Orcamento orcamento) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deveAplicar(Orcamento orcamento) {
		// TODO Auto-generated method stub
		return false;
	}

}
