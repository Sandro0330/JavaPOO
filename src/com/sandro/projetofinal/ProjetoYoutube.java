package com.sandro.projetofinal;

public class ProjetoYoutube {
    public static void main(String[] args) {

        Video v[] = new Video[4];
        v[0] = new Video("Aula Java POO");
        v[1] = new Video("Aula PHP");
        v[2] = new Video("Aula Python");
        v[3] = new Video("Aula de JavaScript");

        Usuario usuario[] = new Usuario[2];
        usuario[0] = new Usuario("Sandro ", 34, " M ", "sandro0330");
        usuario[1] = new Usuario("Maria ", 45, "F", "maria00");
        //usuario[2] = new Usuario("Uilson ", 12, "M ", "zezinho");

        System.out.println(v[0].toString());
        System.out.println(usuario[1].toString());
    }
}
