package com.github.saulocalixto.exercicios;

import java.util.Scanner;

/**
 *Algoritmo que faz soma dos números naturais.
 * @author Saulo Calixto
 */
public class SomNumnat {

    /**
     *
     * @param i representa quantos números naturais serão somados.
     */
    public static void somNume(int i) {
        if(i < 0) {
            throw new IllegalArgumentException("Número inválido."); //To change body of generated methods, choose Tools | Templates.
        }
        int resultado;
        
        resultado = i * (i + 1) / 2;
    }

}