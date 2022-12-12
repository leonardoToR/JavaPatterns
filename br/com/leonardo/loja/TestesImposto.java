package br.com.leonardo.loja;

import java.math.BigDecimal;

import br.com.leonardo.loja.imposto.ICMS;
import br.com.leonardo.loja.imposto.ISS;
import br.com.leonardo.loja.imposto.Imposto;
import br.com.leonardo.loja.orcamento.Orcamento;

public class TestesImposto {

	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento(new BigDecimal("200"), 6);

		Imposto imposto = new ICMS(new ISS(null));
		System.out.println(imposto.calcular(orcamento));
	}

}
