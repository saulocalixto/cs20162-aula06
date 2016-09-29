/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.saulocalixto.exercicios;

import com.github.saulocalixto.exercicios.Cpf;




/**
 *
 * @author guest-vcbtgq
 */
public class main {
    
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        int[] cpf = {5,4,6,3,4,5,3,6,5,9,5};
        
        long startTime = System.nanoTime();
        System.out.println(Cpf.verificaCpf1(cpf));
        long tempo  = System.nanoTime() - startTime;
        System.out.println(tempo);
        
        startTime = System.nanoTime();
        System.out.println(Cpf.verificaCpf2(cpf));
        tempo  = System.nanoTime() - startTime;
        System.out.println(tempo);
        
        startTime = System.nanoTime();
        System.out.println(Cpf.verificaCpf3(cpf));
        tempo  = System.nanoTime() - startTime;
        System.out.println(tempo);
    }
    
}
