package com.sandro.encapsulamento;

public class TesteControleRemoto {
    public static void main(String[] args) {
        ControleRemoto c1 = new ControleRemoto();
        c1.desligar();
        c1.maisVolume();
        c1.maisVolume();
        c1.play();
        c1.abrirMenu();
        c1.fecharMenu();

    }
}
