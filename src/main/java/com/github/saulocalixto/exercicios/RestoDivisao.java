/*UNIVERSIDADE FEDERAL DE GOIÁS - ENGENHARIA DE SOFTWARE
 * Aluno : Saulo de Araújo Calixto - Mt. 201609824
 * Disciplina : Construção de Software
 */
package com.github.saulocalixto.exercicios;

/**
 *Algoritimo retorna o resto da divisão entre dois números.
 * @author Saulo Calixto
 */
public class RestoDivisao {
    
    /**
     *
     * @param x : Dividendo
     * @param y : Divisor
     * @return : Resto da divisão.
     */
    public static int obterResto (int x, int y) {
        
        if(y < 0 || x <= 0) {
            throw new IllegalArgumentException("Número inválido.");
        }
        
        int s = x;
        
        while(y <= s) {
            s -= y;
        }
        
        return (s);
    }
    
}
