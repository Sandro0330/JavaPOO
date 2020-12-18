package com.sandro.projetolivro;

public class ProjetoLivro {
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];

        p[0] = new Pessoa("Sandro", 35, "Masculino");
        p[1] = new Pessoa("Regina", 31, "Feminino");

        l[0] = new Livro("Java 8", "Curso em Video", 234, p[0]);
        l[1] = new Livro("Sprin Boot", "AlgaWorks",196, p[1]);
        l[2] = new Livro("PHP", "Udemy", 320, p[0]);

        l[0].abrir();
        l[0].folhear(301);
        System.out.println(l[0].detalhes());

        l[1].abrir();
        l[1].folhear(100);
        l[1].avancarPag();
        l[1].fechar();
        System.out.println(l[1].detalhes());

    }
}
