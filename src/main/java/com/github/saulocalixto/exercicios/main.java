/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.saulocalixto.exercicios;




/**
 *Main para chamar a classe CPF e verificar o tempo de execução de cada método.
 * @author Saulo de Araújo Calixto
 */
public class main {
    
    public static void main(String[] args) {
        int[] cpf = {3, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5};
        
        long startTime = System.nanoTime();
        System.out.println(Cpf.verificaCpf1(cpf));
        long tempo  = System.nanoTime() - startTime;
        System.out.println("O tempo de execução foi de " + tempo
                + " nanosegundos");
        
        startTime = System.nanoTime();
        System.out.println(Cpf.verificaCpf2(cpf));
        tempo  = System.nanoTime() - startTime;
        System.out.println("O tempo de execução foi de " + tempo
                + " nanosegundos");
        
        startTime = System.nanoTime();
        System.out.println(Cpf.verificaCpf3(cpf));
        tempo  = System.nanoTime() - startTime;
        System.out.println("O tempo de execução foi de " + tempo
                + " nanosegundos");
    }
    
}
