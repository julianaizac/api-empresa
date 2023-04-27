package com.facens.empresa.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FuncionarioTest {

    private Funcionario f = new Funcionario();

    final String NAO_PODE_TRABALHAR = "Não pode trabalhar";
    final String INTEGRAL = "Integral";
    final String PARCIAL = "Parcial";

    @Test
    void validaIdadeMaiorQue55(){
        assertEquals(NAO_PODE_TRABALHAR, f.validaIdade(60));
    }

    @Test
    void validaIdadeMaiorQue16(){
        assertEquals(NAO_PODE_TRABALHAR, f.validaIdade(12));
    }

    @Test
    void validaIdadeMaiorQue18EMenorQue55(){
        assertEquals(INTEGRAL, f.validaIdade(40));
    }

    @Test
    void validaIdadeMaiorQue16EMenorQue18(){
        assertEquals(PARCIAL, f.validaIdade(17));
    }

}
