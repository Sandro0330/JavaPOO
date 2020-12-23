package com.sandro.heranca;

public class ProjetoPessoa {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();

        p1.setNome("Sandro");
        p2.setNome("Regina");
        p3.setNome("Maria");
        p4.setNome("Uilson");

        p1.setSexo("M");
        p2.setSexo("F");
        p4.setIdade(10);

        p2.setCurso("Informática");
        p3.setSalario(2500.75f);
        p4.setSetor("Estoque");

        p3.receberAumento(200f);
        p4.mudarTrabalho();

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());

    }
}
