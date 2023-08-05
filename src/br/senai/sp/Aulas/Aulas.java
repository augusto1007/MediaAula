package br.senai.sp.Aulas;

import java.util.Scanner;

public class Aulas {

    public static void main(String[] args) {

        boolean encerraLoop = false;

        while(!encerraLoop) {

            String situacao;

            Scanner teclado = new Scanner(System.in);
            int[] notas = new int[2];

            System.out.print("Digite o Curso: ");
            String curso = teclado.nextLine();

            System.out.print("Digite o nome do Professor: ");
            String professor = teclado.nextLine();

            System.out.print("Digite o nome do Aluno: ");
            String aluno = teclado.nextLine().toUpperCase();

            System.out.print("Digite a frequencia do aluno: ");
            int freq = teclado.nextInt();

            System.out.print("Digite as duas notas do aluno: ");
            notas[0] = teclado.nextInt();
            notas[1] = teclado.nextInt();
            double media = (double) (notas[0] + notas[1]) / 2;

            if (media >= 7 && freq >= 75 || media >= 6 && freq >= 90) {
                situacao = "Aprovado";
            } else {
                situacao = "Reprovado";
            }

            System.out.println("----------SITUAÇÃO ALUNO " + aluno + "----------");
            System.out.println("Curso: " + curso);
            System.out.println("Professor: " + professor);
            System.out.println("Media: " + media);
            System.out.println("Frequência: " + freq + "%");
            System.out.println("----------Aluno " +aluno+ " " + situacao + "----------\n" );

            System.out.println("Deseja Encerrar?(S/N)");
            String encerra = teclado.next().toUpperCase();
            if (encerra.equals("S")) {
                encerraLoop = true;
            }

        }

    }

}


//curso
//prof
//aluno
//frequencia
//2 notas

