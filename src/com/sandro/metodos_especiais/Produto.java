package com.sandro.metodos_especiais;

public class Produto {
    private String produto;
    private double preco;
    private int quantidade;

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    public double valorTotal() {
        return preco * quantidade;
    }
    

    public void status() {
        System.out.println("Informações sobre o produto");
        System.out.println("Produto " + this.produto );
        System.out.printf("Preço do Produto: R$%.2f\n",  this.preco);
        System.out.println("Quantidade: " + this.getQuantidade());
        System.out.printf("Valor total: R$%.2f ", valorTotal());
    }
}
