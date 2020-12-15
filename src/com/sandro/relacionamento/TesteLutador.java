package com.sandro.relacionamento;

public class TesteLutador {
    public static void main(String[] args) {
        Lutador l[] = new Lutador[6]; //Vetor

        l[0] =  new Lutador("Ricardo Arona", "Brasileiro", 27, 1.85f, 72.1f, 12,3, 4 );

        l[1] = new Lutador("Wanderley Silva", "Brasilerio", 28, 1.77f, 73.4f, 15, 3, 2);

        l[2] = new Lutador("Fedor Emilianenko", "Russo", 28, 1.83f, 100, 10, 2, 2);

        l[3] = new Lutador("Rogério Nogueira", "Brasileiro", 29, 1.88f, 92.3f, 15, 4, 3);

        l[4] = new Lutador("José Aldo", "Brasileiro", 25, 1.70f, 61.3f, 11, 2, 1);

        l[5] = new Lutador("Conor Mcgregor", "Irlandes", 24, 1.73f, 77.4f, 9, 2, 1);

        l[2].status();

        l[2].ganharLuta();
        l[2].status();
    }
}
