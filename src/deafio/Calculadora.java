package deafio;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import java.io.FileWriter;

public class Calculadora {
    public static void main(String[] args) throws IOException {
        Scanner leitura = new Scanner(System.in);
        int escolha = 0;
        double resultado = 0;
        double decimal1;
        double decimal2;

        FileWriter escrita = new FileWriter("Historico.txt");

        escrita.write("Historico Crescente\n");

        while (escolha != 5){
            decimal1 = 0;
            decimal2 = 0;
            System.out.println("""
                                Escolha o tipo de operação
                                
                                1- SOMA (+)
                                2- SUBTRAÇÃO (-)
                                3- DIVISÃO (/)
                                4- MULTIPLICACAO (*)
                                5- SAIR
                                """);

            try {
                escolha = leitura.nextInt();
            }  catch (InputMismatchException e) {
                System.out.println("Tente inserir um valor inteiro.");
                escolha = 0;
                break; // anotação: colocar para voltar para o sistema.
            }

            switch (escolha) {
                case 1:
                    System.out.println("Digite o primeiro valor: ");
                    decimal1 = leitura.nextDouble();

                    System.out.println("Digite o segundo valor: ");
                    decimal2 = leitura.nextDouble();

                    resultado = soma(decimal1, decimal2);

                    System.out.println(resultado);

                    escrita.write(decimal1 + "+ " + decimal2 + "= " + Double.toString(resultado) + "\n");

                    break;
                case 2:

                    System.out.println("Digite o primeiro valor: ");
                    decimal1 = leitura.nextDouble();

                    System.out.println("Digite o segundo valor: ");
                    decimal2 = leitura.nextDouble();

                    resultado = subtra(decimal1, decimal2);

                    System.out.println(resultado);

                    escrita.write(decimal1 + "- " + decimal2 + "= " +Double.toString(resultado)+"\n");

                    break;
                case 3:

                    System.out.println("Digite o primeiro valor: ");
                    decimal1 = leitura.nextDouble();

                    System.out.println("Digite o segundo valor: ");
                    decimal2 = leitura.nextDouble();

                    resultado = divisao(decimal1, decimal2);

                    System.out.println(resultado);

                    escrita.write(decimal1 + "/ " + decimal2 + "= " +Double.toString(resultado)+"\n");

                    break;
                case 4:

                    System.out.println("Digite o primeiro valor: ");
                    decimal1 = leitura.nextDouble();

                    System.out.println("Digite o segundo valor: ");
                    decimal2 = leitura.nextDouble();

                    resultado = multiplicacao(decimal1, decimal2);

                    System.out.println(resultado);

                    escrita.write(decimal1 + "* " + decimal2 + "= " +Double.toString(resultado)+"\n");

                    break;

                case 5:
                    escrita.close();
                    System.out.println("""
                                finalizando sistema...
                                
                                Histórico gerado.
                                """);
                    break;

                default:
                    escrita.close();
                    System.out.println("""
                                Opcao invalida, finalizando sistema...
                                
                                Histórico gerado.
                                """);
                    break;

            }
        }
    }

    public static double soma(double num1, double num2){
        return num1 + num2;
    }

    public static double subtra(double num1, double num2){
        return num1 - num2;
    }

    public static double divisao(double num1, double num2){
        return num1 / num2;
    }

    public static double multiplicacao(double num1, double num2){
        return num1 * num2;
    }
}
