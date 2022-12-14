package br.com.leonardo.loja;

import br.com.leonardo.loja.imposto.CalculadoraDeImpostos;
import br.com.leonardo.loja.imposto.ICMS;
import br.com.leonardo.loja.imposto.ISS;
import br.com.leonardo.loja.orcamento.Orcamento;


public class TesteImposto {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(100, 1);
        CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos();

        System.out.println(calculadora.calcular(orcamento, new ISS(new ICMS(null))));
    }
}
