/*
 * UNIVERSIDADE FEDERAL DE GOIÁS
 * ENGENHARIA DE SOFTWARE
 * Discente : Saulo de Araújo Calixto
 */
package com.github.saulocalixto.exercicios;

import static com.github.saulocalixto.exercicios.RestoDivisao.obterResto;

/**
 *Algortimo que Implementa a validade de um CPF.
 * @author Saulo Calixto
 */
public final class Cpf {

    /**
     * Construtor privado para atender ao checkstyle.
     */
    private Cpf() {
    //Para atender ao checkstyle
    }
        /**
     * Primeira posição do vetor, primeiro digito do cpf, número 0.
     */
    public static final int UM = 0;

    /**
     * Segunda posição do vetor, segundo digito do cpf, número 1.
     */
    public static final int DOIS = 1;

    /**
     * Terceira posição do vetor, Terceiro digito do cpf, número 2.
     */
    public static final int TRES = 2;

    /**
     * Quarta posição do vetor, quarto digito do cpf, número 3.
     */
    public static final int QUATRO = 3;

    /**
     * Quinta posição do vetor, quinto digito do cpf, número 4.
     */
    public static final int CINCO = 4;

    /**
     * Sexta posição do vetor, sexto digito do cpf, número 5.
     */
    public static final int SEIS = 5;

    /**
     * Sétima posição do vetor, sétimo digito do cpf, número 6.
     */
    public static final int SETE = 6;

    /**
     * Oitava posição do vetor, oitavo digito do cpf, número 7.
     */
    public static final int OITO = 7;

    /**
     * Nona posição do vetor, nono digito do cpf, número 8.
     */
    public static final int NOVE = 8;

    /**
     * Décima posição do vetor, décimo digito do cpf, número 9.
     */
    public static final int DEZ = 9;

    /**
     * Dec. primeira posição do vetor, dec. primiero digito do cpf, número 11.
     */
    public static final int ONZE = 10;

    /**
     * Tamanho máximo de um cpf.
     */
    public static final int MAX = 11;

    /**
     * Convterte de nanosegundos para segundos.
     */
    public static final double CONVERTE = 1000000000.0;

    /**
     * Número de repetições para testar o tempo de cada método.
     */
    public static final int REPETIR = 100000;

    /**
     * Método para chamar o construtor privado e ter 100% no teste.
     */
    public static void chamarConstrutor() {
        Cpf cpf = new Cpf();
    }

    /**
     * O usuário fornece um CPF e a Classe verifica através de 3 metodos
     * diferentes se o CPF é valido ou não.
     * @param d : entra com um cpf de 11 posições
     * @throws IllegalArgumentException quando é adicionado um cpf menor que 11
     * @return : retorna se o CPF é válido ou não
     */
    public static boolean verificaCpf1(final int[] d) {

        if (d.length != MAX) {
            throw new IllegalArgumentException("O CPF precisa ter 11 dígitos.");
        }

        int sj = d[UM] + TRES * d[DOIS] + QUATRO * d[TRES] + CINCO * d[QUATRO]
                + SEIS * d[CINCO] + SETE * d[SEIS] + OITO * d[SETE]
                + NOVE * d[OITO] + DEZ * d[NOVE];

        int sk = d[DOIS] + TRES * d[TRES] + QUATRO * d[QUATRO]
                + CINCO * d[CINCO] + SEIS * d[SEIS] + SETE * d[SETE]
                + OITO * d[OITO] + NOVE * d[NOVE] + DEZ * d[DEZ];

        int j = obterResto(obterResto(sj, MAX), ONZE);
        int k = obterResto(obterResto(sk, MAX), ONZE);

        return (j == d[DEZ] & k == d[ONZE]);

    }

    /**
     * @param d entra com um cpf de 11 posições
     * @throws IllegalArgumentException quando é adicionado um cpf menor que 11
     * @return retorna se o CPF é válido ou não
     */
    public static boolean verificaCpf2(final int[] d) {

        if (d.length != MAX) {
            throw new IllegalArgumentException("O CPF precisa ter 11 dígitos.");
                //To change body of generated methods, choose Tools | Templates.
        }

        int c = OITO;
        int p = d[NOVE];
        int s = d[NOVE];

        while (0 <= c) {
            p += d[c];
            s += p;
            c--;
        }

        int j = obterResto(obterResto(s, MAX), ONZE);
        int k = obterResto(obterResto((s - p + DEZ * j), MAX), ONZE);

        return j == d[DEZ] & k == d[ONZE];
    }

    /**
     * @param d entra com um cpf de 11 posições
     * @throws IllegalArgumentException quando é adicionado um cpf menor que 11
     * @return retorna se o CPF é válido ou não
     */
    public static boolean verificaCpf3(final int[] d) {

        if (d.length != MAX) {
            throw new IllegalArgumentException("O CPF precisa ter 11 dígitos.");
                //To change body of generated methods, choose Tools | Templates.
        }

        int p = d[NOVE];
        int s = d[NOVE];

        p += d[OITO];
        s += p;
        p += d[SETE];
        s += p;
        p += d[SEIS];
        s += p;
        p += d[CINCO];
        s += p;
        p += d[QUATRO];
        s += p;
        p += d[TRES];
        s += p;
        p += d[DOIS];
        s += p;
        p += d[UM];
        s += p;

        int j = obterResto(obterResto(s, MAX), ONZE);
        int k = obterResto(obterResto((s - p + DEZ * j), MAX), ONZE);

        return j == d[DEZ] & k == d[ONZE];
    }
}
