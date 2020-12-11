package com.sandro.objeto;

import java.util.Locale;
import java.util.Scanner;

public class TesteTriangulo {

    public static void main(String[] args) {

            Locale.setDefault(Locale.US);
            Scanner scan = new Scanner(System.in);

            Triangulo x, y;
            x = new Triangulo();
            y = new Triangulo();

             System.out.println("Insira as medidas do Triangulo X: ");
            x.a = scan.nextDouble();
            x.b = scan.nextDouble();
            x.c= scan.nextDouble();
            System.out.println("Insira as medidas do Triangulo X: ");
            y.a = scan.nextDouble();
            y.b =  scan.nextDouble();
            y.c = scan.nextDouble();

            double p = (x.a + x.b + x.c) / 2.0;
            double areaX = Math.sqrt(p * (p - x.a) * (p - x.b) * (p - x.c));

            p = (y.a + y.b + y.c) / 2.0;
            double areaY = Math.sqrt(p * (p - y.a) * (p - y.b) * (p - y.c));
            System.out.printf("Triangle X area: %.4f%n", areaX);
            System.out.printf("Triangle Y area: %.4f%n", areaY);
            if (areaX > areaY) {
                System.out.println("Larger area: X");
            }
            else {
                System.out.println("Larger area: Y");
            }
            scan.close();
    }
}