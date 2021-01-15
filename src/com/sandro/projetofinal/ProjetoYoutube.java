package com.sandro.projetofinal;

public class ProjetoYoutube {
    public static void main(String[] args) {

        Video video[] = new Video[4];
        video[0] = new Video("Aula Java POO");
        video[1] = new Video("Aula PHP");
        video[2] = new Video("Aula Python");
        video[3] = new Video("Aula de JavaScript");

        Usuario usuario[] = new Usuario[2];
        usuario[0] = new Usuario("Sandro ", 34, " M ", "sandro0330");
        usuario[1] = new Usuario("Maria ", 45, "F", "maria00");
        //usuario[2] = new Usuario("Uilson ", 12, "M ", "zezinho");

//        System.out.println("Videos\n --------------------------------");
//        System.out.println(video[0].toString());
//        System.out.println(video[1].toString());
//        System.out.println("\n Usuários\n --------------------------------");
//        System.out.println(usuario[1].toString());
//        System.out.println(usuario[0].toString());

        Visualizacao visualizacao[] = new Visualizacao[5];

        visualizacao[0] = new Visualizacao(usuario[0], video[2]); //Sandro  assiste Python
        visualizacao[0].avaliar();
        System.out.println(visualizacao[0].toString());

        visualizacao[1] = new Visualizacao(usuario[1], video[3]); //Maria assistindo JavaScript
        visualizacao[0].avaliar(80);
        System.out.println(visualizacao[1].toString());


        visualizacao[2] = new Visualizacao(usuario[1], video[3]);
        visualizacao[2].avaliar(80.0f);
        System.out.println(visualizacao[1].toString());
    }
}
