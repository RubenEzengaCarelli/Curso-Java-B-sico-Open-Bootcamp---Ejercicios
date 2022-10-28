package com.company;

public class While {

    public static void main(String[] args) {

        String[] nombres = {"Juan", "John", "Pablo", "Analía"};
        String nombresConcatenados = "";

        for (int i = 0; i < nombres.length; i++) {

            nombresConcatenados += nombres[i] + " ";
        }
        System.out.println(nombresConcatenados);
    }
}
