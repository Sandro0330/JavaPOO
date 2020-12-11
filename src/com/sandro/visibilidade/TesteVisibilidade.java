package com.sandro.visibilidade;

//Criando Classes e Objetos
public class TesteVisibilidade {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.modelo = "Bic cristal";
        c1.cor = "Preta";
       // c1.ponta = 0.7f;
        c1.carga = 75;
        c1.tampada = true;
      //  c1.rabiscar();
        c1.status();

    }

}
