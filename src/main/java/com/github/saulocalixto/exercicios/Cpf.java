/*
 * Copyright (c) 2016. Engenharia de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
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
    public static final int POSICAOUM = 0;

    /**
     * Segunda posição do vetor, segundo digito do cpf, número 1.
     */
    public static final int POSICAODOIS = 1;

    /**
     * Terceira posição do vetor, Terceiro digito do cpf, número 2.
     */
    public static final int POSICAOTRES = 2;

    /**
     * Quarta posição do vetor, quarto digito do cpf, número 3.
     */
    public static final int POSICAOQUATRO = 3;

    /**
     * Quinta posição do vetor, quinto digito do cpf, número 4.
     */
    public static final int POSICAOCINCO = 4;

    /**
     * Sexta posição do vetor, sexto digito do cpf, número 5.
     */
    public static final int POSICAOSEIS = 5;

    /**
     * Sétima posição do vetor, sétimo digito do cpf, número 6.
     */
    public static final int POSICAOSETE = 6;

    /**
     * Oitava posição do vetor, oitavo digito do cpf, número 7.
     */
    public static final int POSICAOOITO = 7;

    /**
     * Nona posição do vetor, nono digito do cpf, número 8.
     */
    public static final int POSICAONOVE = 8;

    /**
     * Décima posição do vetor, décimo digito do cpf, número 9.
     */
    public static final int POSICAODEZ = 9;

    /**
     * Dec. primeira posição do vetor, dec. primiero digito do cpf, número 10.
     */
    public static final int POSICAOONZE = 10;

    /**
     * Tamanho máximo de um cpf.
     */
    public static final int MAXCPF = 11;

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
     * @throws IllegalArgumentException se é adicionado um cpf ou maior que 11.
     * @return : retorna se o CPF é válido ou não
     */
    public static boolean verificaCpf1(final int[] d) {

        if (d.length != MAXCPF) {
            throw new IllegalArgumentException("O CPF precisa ter 11 dígitos.");
        }

        int sj = d[POSICAOUM] + POSICAOTRES * d[POSICAODOIS]
                + POSICAOQUATRO * d[POSICAOTRES] + POSICAOCINCO
                * d[POSICAOQUATRO] + POSICAOSEIS * d[POSICAOCINCO]
                + POSICAOSETE * d[POSICAOSEIS] + POSICAOOITO * d[POSICAOSETE]
                + POSICAONOVE * d[POSICAOOITO] + POSICAODEZ * d[POSICAONOVE];

        int sk = d[POSICAODOIS] + POSICAOTRES * d[POSICAOTRES] + POSICAOQUATRO
                * d[POSICAOQUATRO] + POSICAOCINCO * d[POSICAOCINCO]
                + POSICAOSEIS * d[POSICAOSEIS] + POSICAOSETE * d[POSICAOSETE]
                + POSICAOOITO * d[POSICAOOITO] + POSICAONOVE * d[POSICAONOVE]
                + POSICAODEZ * d[POSICAODEZ];

        int j = obterResto(obterResto(sj, MAXCPF), POSICAOONZE);
        int k = obterResto(obterResto(sk, MAXCPF), POSICAOONZE);

        return (j == d[POSICAODEZ] & k == d[POSICAOONZE]);

    }

    /**
     * @param d entra com um cpf de 11 posições
     * @throws IllegalArgumentException se é adicionado um cpf ou maior que 11.
     * @return retorna se o CPF é válido ou não
     */
    public static boolean verificaCpf2(final int[] d) {

        if (d.length != MAXCPF) {
            throw new IllegalArgumentException("O CPF precisa ter 11 dígitos.");
                //To change body of generated methods, choose Tools | Templates.
        }

        int c = POSICAOOITO;
        int p = d[POSICAONOVE];
        int s = d[POSICAONOVE];

        while (0 <= c) {
            p += d[c];
            s += p;
            c--;
        }

        int j = obterResto(obterResto(s, MAXCPF), POSICAOONZE);
        int k = obterResto(obterResto((s - p + POSICAODEZ * j), MAXCPF),
                POSICAOONZE);

        return j == d[POSICAODEZ] & k == d[POSICAOONZE];
    }

    /**
     * @param d entra com um cpf de 11 posições
     * @throws IllegalArgumentException se é adicionado um cpf ou maior que 11.
     * @return retorna se o CPF é válido ou não
     */
    public static boolean verificaCpf3(final int[] d) {

        if (d.length != MAXCPF) {
            throw new IllegalArgumentException("O CPF precisa ter 11 dígitos.");
                //To change body of generated methods, choose Tools | Templates.
        }

        int p = d[POSICAONOVE];
        int s = d[POSICAONOVE];

        p += d[POSICAOOITO];
        s += p;
        p += d[POSICAOSETE];
        s += p;
        p += d[POSICAOSEIS];
        s += p;
        p += d[POSICAOCINCO];
        s += p;
        p += d[POSICAOQUATRO];
        s += p;
        p += d[POSICAOTRES];
        s += p;
        p += d[POSICAODOIS];
        s += p;
        p += d[POSICAOUM];
        s += p;

        int j = obterResto(obterResto(s, MAXCPF), POSICAOONZE);
        int k = obterResto(obterResto((s - p + POSICAODEZ * j), MAXCPF),
                POSICAOONZE);

        return j == d[POSICAODEZ] & k == d[POSICAOONZE];
    }
}
