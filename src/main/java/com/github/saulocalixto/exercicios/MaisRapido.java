package com.github.saulocalixto.exercicios;

/**
 * Main para chamar a classe CPF e verificar o tempo de execução de cada método.
 *
 * @author Saulo de Araújo Calixto
 */
public final class MaisRapido {

    /**
     * Construtor privado para atender ao checkstyle.
     */
    private MaisRapido() {
        //Para atender ao checkstyle
    }

    /**
     * Método main apenas para atender ao pedido de mostrar qual a forma de
     * verificar o cpf é a mais rápida.
     * @param args Padrão do main
     */

    public static void main(final String[] args) {

        int[] cpf = {Cpf.UM, Cpf.QUATRO, Cpf.NOVE, Cpf.CINCO, Cpf.SEIS,
            Cpf.DEZ, Cpf.QUATRO, Cpf.UM, Cpf.DOIS, Cpf.DOIS, Cpf.UM};

        long startTime = System.nanoTime();
        int contador = Cpf.REPETIR;
        while (contador > 0) {
            Cpf.verificaCpf1(cpf);
            contador--;
        }
        double tempcpf1 = (System.nanoTime() - startTime) / Cpf.CONVERTE;

        startTime = System.nanoTime();
        contador = Cpf.REPETIR;
        while (contador > 0) {
            Cpf.verificaCpf2(cpf);
            contador--;
        }
        double tempcpf2 = (System.nanoTime() - startTime) / Cpf.CONVERTE;

        startTime = System.nanoTime();
        contador = Cpf.REPETIR;
        while (contador > 0) {
            Cpf.verificaCpf3(cpf);
            contador--;
        }
        double tempcpf3 = (System.nanoTime() - startTime) / Cpf.CONVERTE;

        if (tempcpf1 < tempcpf2) {
            if (tempcpf1 < tempcpf3) {
                System.out.println("A função verificaCpf1() é mais rápida com "
                        + tempcpf1 + " segundos.");
            } else {
                System.out.println("A função verificaCpf3() é mais rápida com "
                        + tempcpf3 + " segundos.");
            }
        } else {
            if (tempcpf2 < tempcpf3) {
                System.out.println("A função verificaCpf2() é mais rápida com "
                        + tempcpf2 + " segundos.");
            } else {
                System.out.println("A função verificaCpf3() é mais rápida com "
                        + tempcpf3 + " segundos.");
            }
        }
    }
}
