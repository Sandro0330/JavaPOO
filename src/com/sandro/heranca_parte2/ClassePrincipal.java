package com.sandro.heranca_parte2;

public class ClassePrincipal {
    public static void main(String[] args) {
       // Pessoa p1 = new Pessoa(); Objeto não pode ser instanciado de uma Classe abstrata
//        Visitante v1 = new Visitante();
//        v1.setNome("Sandro");
//        v1.setIdade(35);
//        v1.setSexo("Masculino");
//        System.out.println("O visitante é " + v1.toString());

        Aluno a1 = new Aluno();
        a1.setNome("Regina");
        a1.setIdade(31);
        a1.setSexo("Feminino");
        a1.setCurso("Analises Clínicas");
        a1.setMatricula(12345);
        a1.pagarMensalidade();

        Bolsista b1 = new Bolsista();
        b1.setNome("Uilson");
        b1.setMatricula(1111);
        b1.setBolsa(12.5f);
        b1.setSexo("Masculino");
        b1.pagarMensalidade();

        Professor prof = new Professor();
        prof.setNome("Thiago");
        prof.setSalario(1000.00);
        System.out.println("Salário atual " + prof.getSalario());
        prof.receberAumento();
        System.out.println("Salário com aumento " + prof.getSalario());
        System.out.println();
    }
}
