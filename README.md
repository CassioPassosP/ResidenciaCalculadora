# Calculadora - Aula 7

Projeto desenvolvido durante a aula para praticar a criação de uma calculadora em Java utilizando classes separadas para cada operação.

## Funcionalidades

A aplicação oferece as seguintes operações:

- Soma
- Subtração
- Divisão
- Multiplicação
- Potenciação, usando `Math.pow`
- Registro das operações realizadas em `Historico.txt`

## Tecnologias utilizadas

- Java
- `Scanner` para leitura dos valores informados no terminal
- `FileWriter` para gerar o histórico
- `LocalDateTime` para registrar a data e hora das operações

## Estrutura do projeto

```text
src/
└── exercicio/
    ├── Calculadora.java
    ├── Divisao.java
    ├── Multiplicacao.java
    ├── Operador.java
    ├── Potencia.java
    ├── Soma.java
    └── Subtra.java
```

A classe `Calculadora` controla o menu e a interação com o usuário. Cada operação possui sua própria classe, e a classe `Operador` reúne essas operações para uso pela calculadora.

## Como executar

É necessário ter o JDK instalado e o comando `java` disponível no terminal.

Abra o terminal na raiz do projeto e compile os arquivos:

```powershell
javac -d out src/exercicio/Calculadora.java src/exercicio/Divisao.java src/exercicio/Multiplicacao.java src/exercicio/Operador.java src/exercicio/Potencia.java src/exercicio/Soma.java src/exercicio/Subtra.java
```

Depois, execute a aplicação:

```powershell
java -cp out exercicio.Calculadora
```

Escolha uma operação no menu e informe os dois valores solicitados. Ao selecionar a opção de saída, o histórico será salvo no arquivo `Historico.txt`.

## Exemplo de histórico

```text
Historico
2026-07-22 17:10:36 PM -- 4234.0 + 342.0 = 4576.0
2026-07-22 17:10:36 PM -- 55.0 * 5.0 = 275.0
```

## Observação

No código atual, a condição do laço principal encerra a execução quando a opção `5` é escolhida, embora o menu apresente `5` como potenciação e `6` como saída. Para que a opção `6` seja a responsável por encerrar o programa, a condição do laço deverá ser ajustada em `Calculadora.java`.
