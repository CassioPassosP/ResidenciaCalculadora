package teste;

public class Soma extends Operacao {

    public Soma(double num1, double num2) {
        super(num1, num2);
    }

    public static double soma(double num1, double num2){
        return num1 + num2;
    }
}
