package br.com.leonardo.loja;

import java.math.BigDecimal;

import br.com.leonardo.loja.http.JavaHttpClient;
import br.com.leonardo.loja.orcamento.Orcamento;
import br.com.leonardo.loja.orcamento.RegistroOrcamento;

public class TesteAdapter {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(BigDecimal.TEN, 1);
        orcamento.aprovar();
        orcamento.finalizar();

        RegistroOrcamento registro = new RegistroOrcamento(new JavaHttpClient());
        registro.registrar(orcamento);
    }
}
