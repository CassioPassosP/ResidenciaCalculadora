//anotações aula

public class Programa {

//    Tipos primitivos
    int idade = 19;
    float altura = 1.98f;
    double peso = 3.60;
    long segundos = 24284901849812L ;
    char letra = 'A';
    boolean exemplo;


// Não primitivos


//    Operções


//    Casting

//    EXPLICITO


//    IMPLICITO


    public static void main(String[] args) {

        int a = 5;
        int b = 2;

        int resultado = a / b;
        System.out.println((double)resultado);

    }
}


//// Remove todos os números (mantém só letras/caracteres)
//String apenasLetras = opcaoUser.replaceAll("[0-9]", ""); // Busca por qualquer caracter numerico de 0 a 9
//
//// Remove todas as letras (mantém só números)
//String apenasNumeros = opcaoUser.replaceAll("[^0-9]", ""); // Busca por qualquer caracter que NÃO SEJA NUMERICO de 0 a 9
