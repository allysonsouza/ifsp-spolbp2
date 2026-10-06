# Lista de Exercícios Diagnóstica: Java e Orientação a Objetos

Esta lista foi elaborada para ser aplicada na primeira aula como um diagnóstico inicial. Ela cobre sintaxe básica, controle de fluxo, manipulação de Strings, arrays, classes, encapsulamento e coleções.


# Exercício 1: Tipos Primitivos, Leitura e Controle de Fluxo

Objetivo: Verificar a sintaxe básica de entrada/saída, tipos de dados (int, double), condicionais e operadores aritméticos.

**Enunciado:** Escreva um programa que leia o salário bruto de um funcionário e a quantidade de dependentes.

* Se o salário for maior que R$ 3.000,00, aplique um desconto de 11%. Caso contrário, aplique um desconto de 8%.
* Para cada dependente, conceda um auxílio fixo de R$ 150,00 adicionado ao valor final.
* Exiba o salário líquido final formatado com duas casas decimais.


# Exercício 2: Manipulação de String e Laços de Repetição

**Objetivo:** Avaliar o domínio de métodos da classe `String` (`length()`, `charAt()`, `toLowerCase()`, etc.) e loops (`for` ou `while`).

**Enunciado:** Crie um programa que receba uma frase ou palavra qualquer e:

1. Conte e exiba quantas vogais (a, e, i, o, u) ela possui.
2. Imprima a mesma frase invertida (ex: "Java" vira "avaJ").


# Exercício 3: Vetores/Arrays e Processamento de Dados

**Objetivo:** Verificar a familiaridade com a manipulação de arrays unidimensionais e cálculo de métricas simples.

Enunciado: Faça um programa que receba um vetor de 10 números inteiros. O programa deve processar esse vetor e exibir:

1. O maior e o menor valor presente no vetor.
2. A média aritmética simples de todos os elementos.
3. Quantos números armazenados são pares.


# Exercício 4: Criação de Classe, Atributos e Métodos (Introdução a OO)

**Objetivo:** Avaliar o entendimento da estrutura de uma classe, definição de atributos, declaração e chamada de métodos.

Enunciado: Crie uma classe chamada Retangulo com os atributos largura e altura (ambos do tipo double).

* Adicione um método `calcularArea()` que retorna a área do retângulo (largura * altura).
* Adicione um método `calcularPerimetro()` que retorna o perímetro (2 * (largura + altura)).
* Na classe principal (`Main`), instancie dois retângulos com valores diferentes e exiba a área e o perímetro de cada um.


# Exercício 5: Encapsulamento e Construtores

**Objetivo:** Avaliar o uso correto de modificadores de acesso (`private`), métodos getters/setters, construtores e validação interna simples.

**Enunciado:** Crie a classe `ContaBancaria` com os atributos privados `numeroConta` (String), `titular` (String) e `saldo` (double).

* Crie um construtor que inicialize o número da conta e o titular, definindo o saldo inicial como `0.0`.
* Implemente os métodos `depositar(double valor)` e `sacar(double valor)`.
* O método `sacar` só deve permitir a operação se o valor for positivo e menor ou igual ao saldo atual (retornando uma mensagem de sucesso ou erro).
* Garanta que o atributo `saldo` tenha apenas o método getter (sem setter direto).


# Exercício 6: Relacionamento entre Objetos e Coleções (ArrayList)

**Objetivo:** Testar o conceito de composição simples e a utilização do ecossistema de coleções da linguagem (`List` / `ArrayList`).

**Enunciado:** Crie duas classes:

1. `Aluno`: possui atributos privados `nome` (String) e `nota` (double), com seus respectivos construtores e getters.
2. `Turma`: possui um atributo `nomeTurma` (String) e uma lista de alunos (`ListaAluno>`).
* Na classe `Turma`, crie um método `adicionarAluno(Aluno aluno)` e um método `calcularMediaTurma()` que percorre a lista e retorna a média das notas de todos os alunos cadastrados.
* Na classe principal, instancie uma turma, adicione pelo menos 3 alunos e exiba a média geral.
