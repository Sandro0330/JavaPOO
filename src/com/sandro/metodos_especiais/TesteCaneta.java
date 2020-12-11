package com.sandro.metodos_especiais;

public class TesteCaneta {
    public static void main(String[] args) {
        Caneta c1 = new Caneta("BIC Cristal", "Preta", 0.5f);
        Caneta c2 = new Caneta("Kilometrica", "Azul", 0.7f);
//        c1.setModelo("BIC"); // Usando método acessor
//        c1.modelo = "BIC"; // Acessamdo diretamente o atributo
//
//        c1.setPonta(0.5f);
//        //c1.ponta = 0.5f; não é possivel pois ponta é private
//
//        System.out.println("Tenho uma caneta " + c1.getModelo() + " de ponta " + c1.getPonta());
//        //c1.status();

        c1.status();
        System.out.println("--------------------------------");
        c2.status();
    }
}
