package br.com.leonardo.loja.orcamento.situacao;

import br.com.leonardo.loja.orcamento.Orcamento;

public class Reprovado extends SituacaoOrcamento {
    public void finalizar(Orcamento orcamento){
        orcamento.setSituacao(new Finalizado());
    }
}
