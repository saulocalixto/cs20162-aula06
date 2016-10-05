/*
 * UNIVERSIDADE FEDERAL DE GOIÁS
 * ENGENHARIA DE SOFTWARE
 * Discente : Saulo de Araújo Calixto
 */
package com.github.saulocalixto.exercicios;

import static com.github.saulocalixto.exercicios.RestoDivisao.obterResto;

/**
 *Algortimo que Implementa a validade de um CPF
 * @author Saulo Calixto
 */
public class Cpf {
    
    /**
     * O usuário fornece um CPF e a Classe verifica através de 3 metodos
     * diferentes se o CPF é valido ou não.
     * @param d : entra com um cpf de 11 posições
     * @return : retorna se o CPF é válido ou não
     */
    public static boolean verificaCpf1 (int d[]) {
        
        if(d.length != 11) {
            throw new IllegalArgumentException("O CPF precisa ter 11 dígitos."); 
                //To change body of generated methods, choose Tools | Templates.
        }
        
        int sj = d[0] + 2*d[1] + 3*d[2] + 4*d[3] + 5*d[4] + 6*d[5] + 7*d[6] 
                + 8*d[7] + 9*d[8];
        int sk = d[1] + 2*d[2] + 3*d[3] + 4*d[4] + 5*d[5] + 6*d[6] + 7*d[7] 
                + 8*d[8] + 9*d[9];
        
        int j = obterResto(obterResto(sj, 11), 10);
        int k = obterResto(obterResto(sk, 11), 10);
        
        System.out.println("J: " + j + " d[9] " + d[9]);
        System.out.println("K: " + k + " d[10] " + d[10]);
        
        return (j == d[9] && k == d[10]);
        
    }
    
    /**
     *
     * @param d entra com um cpf de 11 posições
     * @return retorna se o CPF é válido ou não
     */
    public static boolean verificaCpf2 (int d[]) {
        
        if(d.length != 11) {
            throw new IllegalArgumentException("O CPF precisa ter 11 dígitos."); 
                //To change body of generated methods, choose Tools | Templates.
        }
        
        int c = 7;
        int p = d[8];
        int s = d[8];
        
        while(0 <= c) {
            p += d[c];
            s += p;
            c--;
        }
        
        int j = obterResto(obterResto(s, 11), 10);
        int k = obterResto(obterResto((s - p + 9 * j), 11), 10);
        
        return j == d[9] && k == d[10];
    }
    
    /**
     *
     * @param d entra com um cpf de 11 posições
     * @return retorna se o CPF é válido ou não
     */
    public static boolean verificaCpf3 (int d[]) {
        
        if(d.length != 11) {
            throw new IllegalArgumentException("O CPF precisa ter 11 dígitos."); 
                //To change body of generated methods, choose Tools | Templates.
        }
        
        int p = d[8] + d[7] + d[6] + d[5] + d[4] + d[3] + d[2] + d[1] + d[0];
        int s = d[8] + p;
        
        
        int j = obterResto(obterResto(s, 11), 10);
        int k = obterResto(obterResto((s - p + 9 * j), 11), 10);
        
        return j == d[9] && k == d[10];
    }
    
}
