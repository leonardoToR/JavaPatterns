package br.com.leonardo.loja;

import java.math.BigDecimal;

import br.com.leonardo.loja.descontos.CalculadoraDeDescontos;
import br.com.leonardo.loja.orcamento.Orcamento;


public class TesteDescontos {
    public static void main(String[] args) {
        Orcamento primeiro = new Orcamento(new BigDecimal("200"), 6);
        Orcamento segundo = new Orcamento(new BigDecimal("1000"), 1);

        CalculadoraDeDescontos calculadora = new CalculadoraDeDescontos();
        System.out.println(calculadora.calcular(primeiro));
        System.out.println(calculadora.calcular(segundo));
        
    }
} 
