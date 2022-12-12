package br.com.leonardo.loja;

import java.math.BigDecimal;

import br.com.leonardo.loja.descontos.CalculadoraDeDescontos;
import br.com.leonardo.loja.orcamento.ItemOrcamento;
import br.com.leonardo.loja.orcamento.Orcamento;


public class TesteDescontos {
    public static void main(String[] args) {
        Orcamento primeiro = new Orcamento(null, 0);
        primeiro.adcionarItem(new ItemOrcamento(new BigDecimal("200")));

        Orcamento segundo = new Orcamento(null, 0);
        segundo.adcionarItem(new ItemOrcamento(new BigDecimal("1000")));

        CalculadoraDeDescontos calculadora = new CalculadoraDeDescontos();
        System.out.println(calculadora.calcular(primeiro));
        System.out.println(calculadora.calcular(segundo));
        
    }
} 
