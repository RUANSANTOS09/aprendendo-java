# 📘 Módulo 2 — Introdução a Classes e Orientação a Objetos
Documentação completa das aulas e conceitos estudados no módulo de introdução à Programação Orientada a Objetos (POO) do curso Maratona Java — DevDojo Academy.

---

## 🗂️ Índice
1. Introdução a Classes e Objetos
2. Atributos e Estado de um Objeto
3. Instanciação e Referência
4. Introdução a Métodos
5. Parâmetros e Retorno
6. Passagem por Valor
7. Métodos na Própria Classe (`this`)
8. Classe Impressora — Separação de Responsabilidades
9. Passagem por Referência
10. Arrays como Parâmetro
11. Varargs
12. Classe Funcionario — Prática Integrada

---

## 🧱 Introdução a Classes e Objetos

### O que é uma Classe?
Uma classe é um molde (ou blueprint) que descreve as características e comportamentos que um objeto terá. Em Java, tudo é organizado em classes.

```
Classe  →  Molde / Definição
Objeto  →  Instância criada a partir do molde
```

### Estrutura básica de uma classe
```java
public class Estudante {
    public String nome;
    public int idade;
    public char sexo;
}
```

> 💡 Por convenção, nomes de classes sempre começam com letra maiúscula em Java (`Estudante`, `Professor`, `Calculadora`).

### Separação de responsabilidades
Uma das primeiras boas práticas aprendidas é a separação entre:

| Tipo de classe | Responsabilidade |
|---|---|
| Classe de Domínio | Define a estrutura (atributos) do objeto |
| Classe de Teste | Contém o `main` — cria e manipula os objetos |

Essa separação reflete um princípio fundamental da POO: cada classe deve ter uma responsabilidade bem definida.

---

## 🗃️ Atributos e Estado de um Objeto

Os atributos são as variáveis declaradas dentro de uma classe. Eles representam as características do objeto — o seu estado.

### Classes de domínio criadas neste módulo

**Estudante.java**
```java
public class Estudante {
    public String nome;
    public int    idade;
    public char   sexo;
}
```

**Professor.java**
```java
public class Professor {
    public String nome;
    public int    idade;
    public char   sexo;
}
```

### Valores padrão dos atributos
Diferente de variáveis locais (que precisam ser inicializadas antes do uso), atributos de classe recebem valores padrão automaticamente quando o objeto é criado:

| Tipo | Valor padrão |
|---|---|
| `int`, `byte`, `short`, `long` | `0` |
| `double`, `float` | `0.0` |
| `boolean` | `false` |
| `char` | `'\u0000'` |
| `String` / objetos | `null` |

---

## 🔁 Instanciação e Referência

### Criando um objeto com `new`
Para usar uma classe, é necessário instanciá-la — ou seja, criar um objeto a partir dela usando a palavra-chave `new`.

```java
// EstudanteTest01.java
Estudante estudante = new Estudante();

estudante.nome  = "Ruan";
estudante.idade = 18;
estudante.sexo  = 'M';

        System.out.println(estudante.nome);
System.out.println(estudante.idade);
System.out.println(estudante.sexo);
```

### Múltiplos objetos independentes
Cada instância criada com `new` é completamente independente em memória. Alterar os atributos de um objeto não afeta os demais.

```java
// EstudanteTeste02.java
Estudante estudante  = new Estudante();
Estudante estudante2 = new Estudante();

estudante.nome = "Fabio"; // Mudando o padrão

        System.out.println(estudante.nome);  // Fabio
System.out.println(estudante2.nome); // null (valor padrão)
```

> 💡 Cada variável do tipo de uma classe armazena uma **referência** (endereço de memória) para o objeto — não o objeto em si. Por isso dois objetos criados com `new` são sempre independentes.

### Testando a classe Professor
```java
// ProfessorTest01.java
Professor professor = new Professor();

professor.nome  = "Rogerio";
professor.idade = 35;
professor.sexo  = 'M';

        System.out.println("Nome: " + professor.nome
                 + " idade: " + professor.idade
                         + " sexo: "  + professor.sexo);
```

---

## ⚙️ Introdução a Métodos

Um método é um bloco de código nomeado que executa uma tarefa específica. Métodos permitem reaproveitar lógica e organizar o comportamento de uma classe.

### Anatomia de um método
```java
[modificador] [tipo de retorno] nomeDoMetodo([parâmetros]) {
    // corpo do método
}
```

### Tipos de retorno

| Tipo de retorno | Comportamento |
|---|---|
| `void` | Não retorna nenhum valor |
| `int`, `double`, etc. | Retorna um valor do tipo especificado |

### A classe Calculadora — visão geral
```java
public class Calculadora {

    // void: executa e não retorna nada
    public void somaDoisNumeros() {
        System.out.println(10 + 10);
    }

    public void subtraiDoisNumeros() {
        System.out.println(21 - 2);
    }

    // void com parâmetros: recebe valores externos
    public void multiplicaDoisNumeros(int num1, int num2) {
        System.out.println(num1 * num2);
    }

    // double: executa e retorna um valor
    public double dividedoisNumeros(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        }
        return 0;
    }

    // void com return usado como "break" do método
    public void imprimeDivisaoDeDoisNumeros(double num1, double num2) {
        if (num2 != 0) {
            System.out.println(num1 / num2);
            return; // encerra o método imediatamente
        }
        System.out.println("Não existe divisão por zero!!!!!!!!!!!");
    }
}
```

---

## 📥 Parâmetros e Retorno

### Métodos sem parâmetros — CalculadoraTest01
Métodos sem parâmetros executam sempre com valores fixos definidos internamente.

```java
Calculadora calculadora = new Calculadora();

calculadora.somaDoisNumeros();    // imprime 20
System.out.println("Finalizando CalculadoraTest01");
calculadora.subtraiDoisNumeros(); // imprime 19
```

### Métodos com parâmetros — CalculadoraTest02
Parâmetros permitem que o método receba valores diferentes a cada chamada, tornando-o reutilizável.

```java
Calculadora calculadora = new Calculadora();

// Para executar este método são necessários 2 argumentos
calculadora.multiplicaDoisNumeros(4, 4); // imprime 16
```

### Métodos com retorno e tratamento de erro — CalculadoraTest03
```java
Calculadora calculadora = new Calculadora();

double result = calculadora.dividedoisNumeros(10, 0);
System.out.println(result); // 0.0 (divisão por zero tratada)

calculadora.imprimeDivisaoDeDoisNumeros(10, 0);
// Saída: "Não existe divisão por zero!!!!!!!!!!!"
```

> 💡 O uso de `return` em métodos `void` funciona como um `break` — encerra a execução do método imediatamente, sem retornar nenhum valor.

---

## 🔄 Passagem por Valor (Pass by Value)

### Como Java passa argumentos para métodos
Em Java, tipos primitivos (`int`, `double`, `boolean`, etc.) são sempre passados para métodos **por valor** — o método recebe uma **cópia** do valor original, nunca a variável em si.

> Qualquer alteração feita nos parâmetros DENTRO do método não afeta as variáveis declaradas FORA dele.

### Demonstração prática — CalculadoraTest04

```java
// Calculadora.java — método que altera os parâmetros internamente
public void alteraDoisNumeros(int numero1, int numero2) {
    numero1 = 10;
    numero2 = 20;
    System.out.println("Dentro do alteraDoisNumeros");
    System.out.println("Numero1 = " + numero1); // 10
    System.out.println("Numero2 = " + numero2); // 20
}
```

```java
// CalculadoraTest04.java — chamando o método
Calculadora calculadora = new Calculadora();
int a = 1;
int b = 2;

calculadora.alteraDoisNumeros(a, b);

System.out.println("Dentro CalculadoraTest04");
System.out.println("a = " + a); // continua 1
System.out.println("b = " + b); // continua 2
```

### Saída esperada
```
Dentro do alteraDoisNumeros
Num1 = 10   ← cópias foram alteradas dentro do método
Num2 = 20

Dentro CalculadoraTest04
Num1 = 1    ← originais permanecem intactos
Num2 = 2
```

### Por que isso acontece?
Quando `alteraDoisNumeros(a, b)` é chamado:
1. Java cria as variáveis `numero1` e `numero2` dentro do método
2. Copia os valores de `a` e `b` para elas (`numero1 = 1`, `numero2 = 2`)
3. O método altera `numero1` e `numero2` — mas essas são variáveis **locais** do método
4. Ao encerrar o método, `numero1` e `numero2` são destruídas
5. `a` e `b` no `main` nunca foram tocados

> ⚠️ Este comportamento é válido apenas para **tipos primitivos**. Objetos (tipos de referência) se comportam de forma diferente — abordado na seção Passagem por Referência.

---

## 🧩 Métodos na Própria Classe (`this`)

### Conceito
Em vez de delegar a impressão para uma classe externa, o próprio objeto pode conter o método que o descreve. O `this` é uma referência ao **objeto atual** — permite que o método acesse os atributos da própria instância.

### EstudanteMetodos.java
```java
public class EstudanteMetodos {
    public String nome;
    public int    idade;
    public char   sexo;

    public void imprime() {
        System.out.println("------------");
        System.out.println(this.nome);
        System.out.println(this.idade);
        System.out.println(this.sexo);
    }
}
```

### EstudanteMetodosTest02.java
```java
EstudanteMetodos estudante01 = new EstudanteMetodos();
EstudanteMetodos estudante02 = new EstudanteMetodos();

estudante01.nome  = "Carlos";
estudante01.idade = 21;
estudante01.sexo  = 'M';

estudante02.nome  = "Maria";
estudante02.idade = 18;
estudante02.sexo  = 'F';

        estudante01.imprime();
estudante02.imprime();
```

> 💡 Cada chamada de `imprime()` sabe automaticamente de qual objeto imprimir os dados, pois `this` aponta para a instância que chamou o método.

---

## 🖨️ Classe Impressora — Separação de Responsabilidades

### Conceito
Uma alternativa ao `this` é criar uma **classe dedicada à impressão**, que recebe o objeto como parâmetro. Essa abordagem reforça o princípio de separação de responsabilidades: a classe de domínio guarda os dados, e a impressora cuida da exibição.

### ImpressoraEstudante.java
```java
public class ImpressoraEstudante {
    public void imprime(EstudanteMetodos estudanteMetodos) {
        System.out.println("------------");
        System.out.println(estudanteMetodos.nome);
        System.out.println(estudanteMetodos.idade);
        System.out.println(estudanteMetodos.sexo);
        estudanteMetodos.nome = "Fabio"; // Alterando valor — passagem por referência
    }
}
```

### EstudanteMetodosTest01.java
```java
EstudanteMetodos estudante01 = new EstudanteMetodos();
EstudanteMetodos estudante02 = new EstudanteMetodos();
ImpressoraEstudante impressora = new ImpressoraEstudante();

estudante01.nome  = "Carlos";
estudante01.idade = 21;
estudante01.sexo  = 'M';

estudante02.nome  = "Maria";
estudante02.idade = 18;
estudante02.sexo  = 'F';

        impressora.imprime(estudante01);
impressora.imprime(estudante02);

impressora.imprime(estudante01); // nome agora é "Fabio" — alterado dentro do método
impressora.imprime(estudante02);
```

---

## 🔗 Passagem por Referência

### Como Java passa objetos para métodos
Diferente de tipos primitivos, quando um **objeto** é passado como argumento, o método recebe a **referência** (endereço de memória) do objeto original — não uma cópia. Isso significa que alterações feitas nos atributos do objeto **dentro** do método **afetam** o objeto original.

### Comparativo

| | Tipos Primitivos | Objetos |
|---|---|---|
| O que é passado | Cópia do valor | Referência (endereço) |
| Alterações dentro do método | Não afetam o original | **Afetam** o original |
| Exemplo | `int`, `double`, `char` | `Estudante`, `Calculadora` |

### Demonstração prática
No exemplo de `ImpressoraEstudante`, a linha `estudanteMetodos.nome = "Fabio"` altera o atributo do objeto real. Ao chamar `imprime(estudante01)` novamente, o nome já aparece como `"Fabio"` — o objeto foi modificado.

```
Primeira chamada  → imprime "Carlos"
Segunda chamada   → imprime "Fabio"  (modificado dentro do método)
```

> ⚠️ A **referência em si** não muda (não é possível fazer o parâmetro apontar para outro objeto), mas os **atributos** acessados por ela podem ser alterados livremente.

---

## 📦 Arrays como Parâmetro

### Conceito
Métodos podem receber arrays como parâmetro, permitindo processar coleções de valores de forma centralizada.

### Calculadora.java — somaArray
```java
public void somaArray(int[] numeros) {
    int soma = 0;
    for (int num : numeros) {
        soma += num;
    }
    System.out.println(soma);
}
```

### CalculadoraTest05.java
```java
Calculadora calculadora = new Calculadora();
int[] numeros = {1, 2, 3, 4, 5};

calculadora.somaArray(numeros); // imprime 15
```

> 💡 Arrays são objetos em Java — portanto são passados por referência, assim como qualquer outro objeto.

---

## 🔢 Varargs

### Conceito
**Varargs** (variable arguments) permitem que um método receba um número **indefinido** de argumentos do mesmo tipo, sem precisar criar um array manualmente antes de chamar o método.

A sintaxe é `tipo... nomeParametro` — internamente, Java trata como um array.

### Calculadora.java — somaVarArgs
```java
// Usando Varargs
public void somaVarArgs(int... numeros) {
    int soma = 0;
    for (int num : numeros) {
        soma += num;
    }
    System.out.println(soma);
}
```

### CalculadoraTest05.java
```java
Calculadora calculadora = new Calculadora();

// Com array convencional
int[] numeros = {1, 2, 3, 4, 5};
calculadora.somaArray(numeros);

// Com varargs — valores passados diretamente, sem criar array
calculadora.somaVarArgs(1, 2, 3, 4, 5, 6); // imprime 21
```

### Diferença prática entre Array e Varargs

| | Array como Parâmetro | Varargs |
|---|---|---|
| Sintaxe do parâmetro | `int[] numeros` | `int... numeros` |
| Como chamar | Precisa criar o array antes | Passa os valores diretamente |
| Flexibilidade | Quantidade fixa no array | Qualquer quantidade de argumentos |
| Internamente | Array | Array (mesmo comportamento) |

> 💡 Varargs é útil quando não se sabe de antemão quantos valores serão passados. Se um método tem outros parâmetros além do varargs, o varargs **deve ser o último** na lista de parâmetros.

---

## 👷 Classe Funcionario — Prática Integrada

### Conceito
A classe `Funcionario` consolida os conceitos aprendidos no módulo: atributos, métodos com `this`, passagem por referência e organização em classes de domínio e teste.

### Funcionario.java
```java
public class Funcionario {
    public String nome;
    public int    idade;
    public double salario;
}
```

### FuncionarioTest01.java
```java
Funcionario funcionario = new Funcionario();

funcionario.nome    = "Leonardo";
funcionario.idade   = 22;
funcionario.salario = 1200.0;

        System.out.println(funcionario.nome);    // Leonardo
System.out.println(funcionario.idade);   // 22
System.out.println(funcionario.salario); // 1200.0
```

### Saída esperada
```
Leonardo
22
1200.0 1400.0 1900.0
```

> 💡 Todo o código deste módulo foi escrito de forma intencional e verbosa, priorizando a compreensão de cada conceito acima de otimizações. Essa abordagem é fundamental para construir uma base sólida em Orientação a Objetos.

---

*Maratona Java — DevDojo Academy*
*Feito com ☕ e muito estudo*