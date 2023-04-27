package com.facens.empresa.model;

import java.util.UUID;

public class Funcionario {

    private int idade;

    public Funcionario() {
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    /*Regra de Negócio: Idade de contratação de um funcionário: A empresa não contrata pessoas com idade inferior da 16 anos.
    Caso a pessoa tenha 16 anos até 18, ela pode ser contratada apenas em tempo parcial.
    Se a pessoa tiver de 18 a 55 anos, ela poderá ser contratada em período integral.
    Pessoas com idade superior a 55 não serão contratadas.
     */

    public String validaIdade(int idade){
        setIdade(idade);
        if (idade <= 55) { // 1
            if (idade >= 18) { // 2
                return "Integral"; // 3
            } else if (idade >= 16) { // 4
                return "Parcial"; // 5
            }
        }
        return "Não pode trabalhar"; //6
    }
}
