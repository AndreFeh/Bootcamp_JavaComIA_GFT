package com.lanchonete.atendimento.cozinha;

public class Almoxarife {
    /*Os unicos que podem visualizar sao Almoxarife e Cozinheiro*/
    /*Entao as declarações tem que ser Default/Protect (Visto para Classe)*/
    public void controlarEntrada() {
        System.out.println("CONTROLANDO A ENTRADA DOS ITENS");
    }
    public void controlarSaida() {
        System.out.println("CONTROLANDO A SAIDA DOS ITENS");
    }
    protected void entregarIngredientes() {
        System.out.println("ENTREGANDO INGREDIENTES");
        // o estabelecimento nao precisa saber dessa informacao
    }
    void trocarGas() {
        System.out.println("ALMOXARIFE TROCANDO O GÁS");
    }
}