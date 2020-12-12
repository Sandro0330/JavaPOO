package com.sandro.exemplo_objetos;

public class TesteContaBanco {
    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(11111);
        p1.setDono("Sandro Aparecido");
        p1.abrirConta("CC");
        p1.depositar(300);
        p1.sacar(350);
        p1.fecharConta();
        p1.estadoAtual();

        System.out.println("-------------------------");

        ContaBanco p2 = new ContaBanco();
        p2.setNumConta(2222);
        p2.setDono("Regina Castro");
        p2.abrirConta("CP");
        p2.depositar(500);
        p2.sacar(1400);
        p2.estadoAtual();

    }
}
