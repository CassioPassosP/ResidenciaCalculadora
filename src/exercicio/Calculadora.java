package exercicio;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) throws IOException {
        Scanner leitura = new Scanner(System.in);
        LocalDateTime now = LocalDateTime.now();

        Operador operador = new Operador();

        DateTimeFormatter formatter
                = DateTimeFormatter.ofPattern(
                "yyyy-MM-dd HH:mm:ss a");

        String dateTimeString = now.format(formatter);

        System.out.println(dateTimeString);

        int escolha = 0;
        double resultado = 0;
        double decimal1;
        double decimal2;

        FileWriter escrita = new FileWriter("Historico.txt");

        escrita.write("Historico\n");

        while (escolha != 5){
            decimal1 = 0;
            decimal2 = 0;
            System.out.println("""
                                Escolha o tipo de operação
                                
                                1 - SOMA (+)
                                2 - SUBTRAÇÃO (-)
                                3 - DIVISÃO (/)
                                4 - MULTIPLICACAO (*)
                                5-  POTENCIACAO (**)
                                6 - SAIR
                                """);

            try {
                escolha = leitura.nextInt();
            }  catch (InputMismatchException e) {
                System.out.println("Tente inserir um numero inteiro de 1 a 6.");
                escolha = 0;
            }

            switch (escolha) {
                case 1:
                    System.out.println("Digite o primeiro valor: ");
                    decimal1 = leitura.nextDouble();

                    System.out.println("Digite o segundo valor: ");
                    decimal2 = leitura.nextDouble();

                    resultado = operador.soma.soma(decimal1, decimal2);

                    System.out.println("Resultado: " + resultado);

                    escrita.write(dateTimeString + " -- " + decimal1 + " + " + decimal2 + " = " + Double.toString(resultado) + "\n");

                    break;
                case 2:

                    System.out.println("Digite o primeiro valor: ");
                    decimal1 = leitura.nextDouble();

                    System.out.println("Digite o segundo valor: ");
                    decimal2 = leitura.nextDouble();

                    resultado = operador.subtra.subtra(decimal1, decimal2);

                    System.out.println("Resultado: " + resultado);

                    escrita.write(dateTimeString + " -- " + decimal1 + " - " + decimal2 + " = " +Double.toString(resultado)+"\n");

                    break;
                case 3:

                    System.out.println("Digite o primeiro valor: ");
                    decimal1 = leitura.nextDouble();

                    System.out.println("Digite o segundo valor: ");
                    decimal2 = leitura.nextDouble();

                    resultado = operador.divisao.divisao(decimal1, decimal2);

                    System.out.println("Resultado: " + resultado);

                    escrita.write(dateTimeString + " -- " + decimal1 + " / " + decimal2 + " = " +Double.toString(resultado)+"\n");

                    break;
                case 4:

                    System.out.println("Digite o primeiro valor: ");
                    decimal1 = leitura.nextDouble();

                    System.out.println("Digite o segundo valor: ");
                    decimal2 = leitura.nextDouble();

                    resultado = operador.multiplicacao.multiplicacao(decimal1, decimal2);

                    System.out.println("Resultado: " + resultado);

                    escrita.write(dateTimeString + " -- " + decimal1 + " * " + decimal2 + " = " +Double.toString(resultado)+"\n");

                    break;

                case 5:
                    System.out.println("Digite o primeiro valor: ");
                    decimal1 = leitura.nextDouble();

                    System.out.println("Digite o segundo valor: ");
                    decimal2 = leitura.nextDouble();

                    resultado = operador.potencia.potenciaMath(decimal1, decimal2);

                    System.out.println("Resultado: " + resultado);

                    escrita.write(dateTimeString + " -- " + decimal1 + " ** " + decimal2 + " = " +Double.toString(resultado)+"\n");

                    break;
                case 6:
                    escrita.close();
                    System.out.println("""
                                finalizando sistema...
                                
                                Histórico gerado.
                                """);
                    break;

                default:
                    System.out.println("""
                                Opcao invalida. Digite novamente.
                                """);
                    break;

            }
        }
    }
}
