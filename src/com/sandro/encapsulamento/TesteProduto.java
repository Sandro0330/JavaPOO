package com.sandro.encapsulamento;

import java.util.Locale;
import java.util.Scanner;

public class TesteProduto {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe os dados produto: ");
        System.out.print("Nome: ");
        String nome= sc.nextLine();
        System.out.print("Preço: ");
        double preco = sc.nextDouble();
        Produto produto = new Produto(nome, preco);

        produto.setNome("Computador"); //acessando o atirubuto (private nome)
        System.out.println("Nome atualizado: " + produto.getNome()); // obtendo o nome atualizado do produto
        produto.setPreco(1200.00);
        System.out.println("Preço atualizado: " + produto.getPreco());

        System.out.println();
        System.out.print("Dados do produto: " + produto);

        System.out.println();
        System.out.print("Quantidade de produtos a ser adicionado ao estoque: ");
        int quantidade = sc.nextInt();
        produto.addProduto(quantidade);

        System.out.println();
        System.out.print("Informe os produtos para ser removido do estoque: ");
        quantidade = sc.nextInt();
        produto.removerProduto(quantidade);

        System.out.println();
        System.out.println("Atualize os dados: " + produto);

        sc.close();
    }
}
