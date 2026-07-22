package teste;

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
                                5 - SAIR
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

                    resultado = Operacao.soma(decimal1, decimal2);

                    System.out.println("Resultado: " + resultado);

                    escrita.write(dateTimeString + " -- " + decimal1 + " + " + decimal2 + " = " + Double.toString(resultado) + "\n");

                    break;
                case 2:

                    System.out.println("Digite o primeiro valor: ");
                    decimal1 = leitura.nextDouble();

                    System.out.println("Digite o segundo valor: ");
                    decimal2 = leitura.nextDouble();

                    resultado = Operacao.subtra(decimal1, decimal2);

                    System.out.println("Resultado: " + resultado);

                    escrita.write(dateTimeString + " -- " + decimal1 + " - " + decimal2 + " = " +Double.toString(resultado)+"\n");

                    break;
                case 3:

                    System.out.println("Digite o primeiro valor: ");
                    decimal1 = leitura.nextDouble();

                    System.out.println("Digite o segundo valor: ");
                    decimal2 = leitura.nextDouble();

                    resultado = Divisao(decimal1, decimal2);

                    System.out.println("Resultado: " + resultado);

                    escrita.write(dateTimeString + " -- " + decimal1 + " / " + decimal2 + " = " +Double.toString(resultado)+"\n");

                    break;
                case 4:

                    System.out.println("Digite o primeiro valor: ");
                    decimal1 = leitura.nextDouble();

                    System.out.println("Digite o segundo valor: ");
                    decimal2 = leitura.nextDouble();

                    resultado = Operacao.multiplicacao(decimal1, decimal2);

                    System.out.println("Resultado: " + resultado);

                    escrita.write(dateTimeString + " -- " + decimal1 + " * " + decimal2 + " = " +Double.toString(resultado)+"\n");

                    break;

                case 5:
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
