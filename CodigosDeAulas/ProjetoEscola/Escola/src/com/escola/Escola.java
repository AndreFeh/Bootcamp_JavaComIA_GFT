package com.escola;

public class Escola {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        aluno1.setNome("Felipe Silva");
        aluno1.setIdade(10);
        System.out.println("Aluno: " + aluno1.getNome() + ". Idade: " + aluno1.getIdade());
    }
}
