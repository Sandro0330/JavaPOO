package com.sandro.metodos_especiais;

public class TesteProduto {
    public static void main(String[] args) {

        Produto p1 = new Produto();
        p1.setProduto("Televisão 42 Polegadas");
        p1.setPreco(1899.00);
        p1.setQuantidade(2);

        p1.status();

    }

}
