package exercicio;

public class Operador {
    public Divisao divisao;
    public Subtra subtra;
    public Multiplicacao multiplicacao;
    public Soma soma;
    public Potencia potencia;

    public Operador(){
        divisao = new Divisao();
        subtra = new Subtra();
        multiplicacao = new Multiplicacao();
        soma = new Soma();
        potencia = new Potencia();
    }

}
