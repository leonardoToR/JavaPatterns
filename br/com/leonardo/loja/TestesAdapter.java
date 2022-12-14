package br.com.leonardo.loja;

import java.math.BigDecimal;

import br.com.leonardo.loja.http.ApacheHttpAdapter;
import br.com.leonardo.loja.orcamento.Orcamento;
import br.com.leonardo.loja.orcamento.RegistroOrcamento;

public class TestesAdapter {

	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento(BigDecimal.TEN, 1);
		orcamento.aprovar();
		orcamento.finalizar();

		RegistroOrcamento registro = new RegistroOrcamento(new ApacheHttpAdapter());
		registro.registrar(orcamento);
	}

}
