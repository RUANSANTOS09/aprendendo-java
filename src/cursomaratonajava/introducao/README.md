# 📘 Módulo 1 — Introdução ao Java

> Documentação completa das aulas e conceitos estudados no módulo introdutório do curso **Maratona Java — DevDojo Academy**.

---

## 🗂️ Índice

- [Aula 01 — Comentários](#-aula-01--comentários)
- [Aula 02 — Tipos Primitivos](#-aula-02--tipos-primitivos)
- [Aula 04 — Operadores](#-aula-04--operadores)
- [Aula 05 — Estruturas Condicionais](#-aula-05--estruturas-condicionais)
- [Aula 06 — Estruturas de Repetição](#-aula-06--estruturas-de-repetição)
- [Aula 07 — Arrays](#-aula-07--arrays)
- [Aula 08 — Arrays Multidimensionais](#-aula-08--arrays-multidimensionais)

---

## 📝 Aula 01 — Comentários

Primeiro contato com a linguagem Java. Além do clássico `Hello World`, o foco foi entender os **três tipos de comentários** disponíveis na linguagem.

| Tipo | Sintaxe | Uso |
|---|---|---|
| Linha | `// texto` | Comentários rápidos e inline |
| Bloco | `/* texto */` | Comentários de múltiplas linhas |
| Javadoc | `/** texto */` | Documentação oficial de classes e métodos |

```java
// Comentário de linha

/*
  Comentário de
  múltiplas linhas
*/

/**
 * Esse é um comentário
 * javadoc
 */
```

> 💡 Comentários não são executados pelo compilador — servem exclusivamente para documentar e explicar o código.

---

## 📝 Aula 02 — Tipos Primitivos

Java possui **8 tipos primitivos** divididos em categorias. Entender cada um é essencial para declarar variáveis com eficiência e precisão.

### Números Inteiros

| Tipo | Tamanho | Faixa de valores | Quando usar |
|---|---|---|---|
| `byte` | 8 bits | -128 a 127 | Economizar memória em listas grandes |
| `short` | 16 bits | -32.768 a 32.767 | Raramente usado hoje em dia |
| `int` | 32 bits | -2 bi a 2 bi | Padrão para números inteiros |
| `long` | 64 bits | Muito grande | IDs, timestamps, valores gigantes |

### Números Decimais

| Tipo | Precisão | Sufixo | Quando usar |
|---|---|---|---|
| `double` | Alta (64 bits) | Nenhum | Padrão para decimais |
| `float` | Menor (32 bits) | `f` no final | Quando precisão não é crítica |

### Outros

| Tipo | Valor padrão | Descrição |
|---|---|---|
| `boolean` | `false` | Armazena apenas `true` ou `false` |
| `char` | `'\u0000'` | Um único caractere — obrigatório usar aspas simples |

### Tipo especial: String

`String` não é um tipo primitivo — é uma **classe**. Por isso usa aspas duplas e começa com letra maiúscula.

```java
// Inteiros
int age = 39;
int ageSon = 10;
byte idadeByte = 10;
short idadeShort = 10;
long numeroGrande = 10000000;

// Decimais
double salarioDouble = 2000;
float salarioFloat = 2500.0F;

// Outros
boolean verdadeiro = true;
boolean falso = false;
char caractere = 'M';

// String
String nome = "Ruan";
```

---

## 📝 Aula 04 — Operadores

### Operadores Aritméticos

| Operador | Operação |
|---|---|
| `+` | Adição |
| `-` | Subtração |
| `*` | Multiplicação |
| `/` | Divisão |
| `%` | Resto da divisão (módulo) |

> ⚠️ **Atenção na divisão:** `int / int` sempre retorna `int`. Para obter decimais, ao menos um dos operandos deve ser `double`.

```java
int number01 = 10;
double number02 = 20;
double resultado = number01 / number02; // 0.5

int resto = 20 % 2; // 0 (20 é par)
```

---

### Operadores de Comparação

Sempre retornam `boolean` (`true` ou `false`).

| Operador | Significado |
|---|---|
| `<` | Menor que |
| `>` | Maior que |
| `<=` | Menor ou igual |
| `>=` | Maior ou igual |
| `==` | Igual a |
| `!=` | Diferente de |

```java
boolean isDezMaiorQueVinte    = 10 > 20;  // false
boolean isDezMenorQueVinte    = 10 < 20;  // true
boolean isDezIgualVinte       = 10 == 20; // false
boolean isDezDiferenteDeVinte = 10 != 20; // true
```

---

### Operadores Lógicos

Combinam expressões booleanas para criar condições compostas.

| Operador | Nome | Resultado |
|---|---|---|
| `&&` | AND (E) | `true` somente se **ambos** forem `true` |
| `\|\|` | OR (OU) | `true` se **ao menos um** for `true` |
| `!` | NOT (NÃO) | Inverte o valor booleano |

```java
int age = 29;
double salario = 3500;

// Dentro da faixa da Lei Maior que Trinta (age >= 30 E salario >= 4612)
boolean isDentroLeiMaior = age >= 30 && salario >= 4612;

// Pode comprar PlayStation (conta corrente >= 5000 OU poupança >= 5000)
boolean isPlayStationCompravel = valorContaCorrente >= valorPlaystation
                              || valorContaPoupanca >= valorPlaystation;
```

---

### Operadores de Atribuição

| Operador | Equivalente a |
|---|---|
| `+=` | `x = x + n` |
| `-=` | `x = x - n` |
| `*=` | `x = x * n` |
| `/=` | `x = x / n` |
| `%=` | `x = x % n` |

```java
double bonus = 1800;
bonus += 1000; // 2800
bonus -= 1000; // 1800
bonus *= 2;    // 3600
bonus /= 2;    // 1800
bonus %= 2;    // 0
```

---

### Operadores de Incremento e Decremento

| Operador | Nome | Comportamento |
|---|---|---|
| `x++` | Pós-incremento | Usa o valor atual **depois** incrementa |
| `++x` | Pré-incremento | Incrementa **primeiro** depois usa o valor |
| `x--` | Pós-decremento | Usa o valor atual **depois** decrementa |

```java
int contador = 0;
contador += 1; // 1
contador++;    // 2
contador--;    // 1

int contador2 = 0;
System.out.println(++contador2); // imprime 1 (incrementa antes)
```

---

## 📝 Aula 05 — Estruturas Condicionais

### `if / else if / else`

Permite tomar decisões baseadas em condições booleanas. Pode ser encadeado para verificar múltiplos intervalos.

```java
// Parte 01 — Verificação simples com boolean
boolean isAutorizadoComprarBebida = false;

if (isAutorizadoComprarBebida) {
    System.out.println("Autorizado a comprar bebida alcoólica");
} else {
    System.out.println("Não autorizado a comprar bebida");
}
```

```java
// Parte 02 — Condicionais encadeadas com intervalos
int ageJogador = 0;
String categoria;

if (ageJogador < 15) {
    categoria = "Categoria Infantil";
} else if (ageJogador >= 15 && ageJogador < 18) {
    categoria = "Categoria Juvenil";
} else {
    categoria = "Categoria Adulto";
}
```

```java
// Parte 03 — Operador ternário (condição ? verdadeiro : falso)
double salario = 6000;
String resultado = salario > 5000 ? "Eu vou doar 500 reais pro DevDojo"
                                  : "Nao vou doar 500 pro DevDojo";
```

---

### `switch`

Alternativa mais limpa ao `if/else` quando se tem **múltiplos valores fixos** para uma mesma variável.

Tipos permitidos no `switch`: `byte`, `short`, `int`, `char`, `enum`, `String`.

```java
// Parte 04 — switch com dia da semana e sexo
byte dia = 1;
switch (dia) {
    case 1: System.out.println("Domingo"); break;
    case 2: System.out.println("Segunda"); break;
    case 3: System.out.println("Terça");   break;
    case 4: System.out.println("Quarta");  break;
    case 5: System.out.println("Quinta");  break;
    case 6: System.out.println("Sexta");   break;
    default: System.out.println("Sábado");
}

char sexo = 'F';
switch (sexo) {
    case 'M': System.out.println("Homem");  break;
    case 'F': System.out.println("Mulher"); break;
    default:  System.out.println("Opção Inválida");
}
```

> 💡 O `break` é essencial para evitar que o código "caia" para o próximo case (fall-through).

---

## 📝 Aula 06 — Estruturas de Repetição

Java oferece três tipos de laços, cada um com um propósito diferente.

### `while`

Executa **enquanto** a condição for verdadeira. Verifica a condição **antes** de executar.

```java
int count = 0;
while (count < 10) {
    System.out.println(++count);
}
```

### `do-while`

Executa **ao menos uma vez**, pois verifica a condição **depois** de executar.

```java
count = 0;
do {
    System.out.println("Dentro do do-while " + ++count);
} while (count < 10);
```

### `for`

Mais compacto. Ideal quando se conhece o número de iterações.

```java
// Sintaxe: for (inicialização; condição; incremento)
for (int i = 0; i < 10; i++) {
    System.out.println("For " + i);
}
```

> 💡 **Quando usar cada um?**
> - `for` → quando você sabe quantas vezes vai repetir
> - `while` → quando a condição de parada é dinâmica
> - `do-while` → quando precisa executar ao menos uma vez

---

## 📝 Aula 07 — Arrays

Arrays são **estruturas de dados** que armazenam múltiplos valores do mesmo tipo em sequência, acessados por índice (começando em 0).

### Declaração e Inicialização

```java
// Forma 1 — declarar tamanho e atribuir depois
int[] idades = new int[3];
idades[0] = 21;
idades[1] = 15;
idades[2] = 11;

// Forma 2 — declarar com valores já definidos
int[] numeros3 = new int[]{1, 2, 3, 4, 5};
```

### Valores padrão ao declarar com `new`

| Tipo | Valor padrão |
|---|---|
| `byte`, `short`, `int`, `long`, `float`, `double` | `0` |
| `char` | `'\u0000'` (espaço vazio) |
| `boolean` | `false` |
| `String` | `null` |

### Iterando com `for` tradicional

Permite acessar o **índice** e o valor, ideal para modificar elementos.

```java
String[] nomes = new String[4];
nomes[0] = "Joao";
nomes[1] = "Fernando";
nomes[2] = "Mario";
nomes[3] = "Maria";

for (int i = 0; i < nomes.length; i++) {
    System.out.println(nomes[i]); // .length = tamanho total do array
}
```

### Iterando com `for-each`

Mais simples e legível. **Não permite acessar o índice nem modificar elementos.**

```java
int[] numeros = new int[]{1, 2, 3, 4, 5};
for (int num : numeros) {
    System.out.println(num);
}
```

---

## 📝 Aula 08 — Arrays Multidimensionais

Arrays multidimensionais são **arrays de arrays** — permitem representar dados em formato de tabela (linhas e colunas).

### Declaração e Atribuição

```java
// Matriz 2x3: 2 linhas, 3 colunas
int[][] dias = new int[2][3];

// Linha 0 — Janeiro, Fevereiro, Março
dias[0][0] = 31; // Janeiro
dias[0][1] = 28; // Fevereiro
dias[0][2] = 31; // Março

// Linha 1 — Abril, Maio, Junho
dias[1][0] = 30; // Abril
dias[1][1] = 31; // Maio
dias[1][2] = 30; // Junho
```

### Iterando com `for` tradicional aninhado

```java
for (int i = 0; i < dias.length; i++) {
    for (int j = 0; j < dias[i].length; j++) {
        System.out.println(dias[i][j]);
    }
}
```

### Iterando com `for-each` aninhado

```java
for (int[] arrBase : dias) {
    for (int num : arrBase) {
        System.out.println(num);
    }
}
```

### Arrays multidimensionais com tamanhos diferentes

Cada "linha" pode ter um tamanho diferente.

```java
int[][] arrayInt = new int[3][];
arrayInt[0] = new int[2]; // linha 0 tem 2 colunas
arrayInt[1] = new int[3]; // linha 1 tem 3 colunas
arrayInt[2] = new int[6]; // linha 2 tem 6 colunas

for (int[] arrayBase : arrayInt) {
    System.out.println("-----------");
    for (int num : arrayBase) {
        System.out.print(num + "  ");
    }
}
```

---

> 💡 *Todo o código deste módulo foi escrito de forma intencional e verbosa, priorizando a compreensão de cada conceito acima de otimizações. Essa abordagem é fundamental para construir uma base sólida em Java.*

---

<p align="center">
  <strong>Maratona Java — DevDojo Academy</strong><br/>
  Feito com ☕ e muito estudo
</p>