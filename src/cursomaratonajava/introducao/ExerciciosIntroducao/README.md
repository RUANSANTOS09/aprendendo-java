# 📚 Exercícios de Introdução — Maratona Java

Coleção de exercícios práticos das primeiras aulas do curso, cobrindo os fundamentos essenciais da linguagem Java.

---

## 🗂️ Índice

- [Aula 03 — Tipos Primitivos](#-aula-03--tipos-primitivos)
- [Aula 05 — Estruturas Condicionais](#-aula-05--estruturas-condicionais)
- [Aula 06 — Estruturas de Repetição](#-aula-06--estruturas-de-repetição)
- [Aula 07 — Arrays](#-aula-07--arrays)
- [Aula 08 — Arrays Multidimensionais](#-aula-08--arrays-multidimensionais)

---

## 📝 Aula 03 — Tipos Primitivos

**Desafio:** Declarar variáveis com diferentes tipos primitivos e exibir um relatório formatado no console.

**Mensagem esperada:**
```
Eu <nome>, morando no endereço <endereco>, confirmo que recebi o salário de <salario>, na data <data>.
```

**Exemplo de saída:**
```
Eu Ruan, morando no endereço Fazenda Mamona, confirmo que recebi o salário de 6990.75, na data 15/04/26
```

**Conceitos praticados:**
| Conceito | Descrição |
|---|---|
| `String` | Armazena textos como nome, endereço e data |
| `double` | Armazena valores decimais como o salário |
| **camelCase** | Convenção de nomes (ex: `dataRecebimentoSalario`) |
| **Concatenação** | União de textos e variáveis com o operador `+` |

---

## 📝 Aula 05 — Estruturas Condicionais

**Foco:** Tomada de decisão com `if/else` e `switch`.

### Exercício — Dia da Semana
Recebe um número de **1 a 7** e determina se é dia útil ou final de semana usando `switch`.

```
1 ou 7  →  "Final de semana"
2 a 6   →  "Dia Útil"
outro   →  entrada inválida (default)
```

**Conceitos praticados:**
- `if / else if / else` — condicionais encadeadas para intervalos numéricos
- Operador `&&` — verifica se um valor está dentro de um intervalo
- `switch` — alternativa limpa para múltiplos valores fixos
- **Agrupamento de cases** — mesmo bloco para entradas diferentes
- `break` — evita a execução de casos indesejados

---

## 📝 Aula 06 — Estruturas de Repetição

**Foco:** Laços `for` e controle de fluxo com `break` e `continue`.

### Exercícios

| Arquivo | O que faz |
|---|---|
| `Exercicio` | Imprime todos os números **pares** de 0 até 1.000.000 usando `%` |
| `Part02` | Usa `break` para interromper o laço ao passar de 25 (limite: 50) |
| `Part03` | Simula parcelamento de carro — para quando a parcela fica abaixo de R$ 1.000 |
| `Part04` | Resolve o mesmo parcelamento com `continue` em laço reverso |

**Conceitos praticados:**
- Laço `for` com inicialização, condição e incremento/decremento
- `break` — interrompe o laço completamente
- `continue` — pula a iteração atual e vai para a próxima
- Operador `%` (resto) — descobre se um número é par

---

## 📝 Aula 07 — Arrays

**Foco:** Estruturas de dados em lista (arrays unidimensionais), leitura e manipulação.

### Exercícios

| Arquivo | O que faz |
|---|---|
| `Part01` | Percorre um array e imprime apenas os valores **maiores que 10** |
| `Part02` | Conta quantos números **pares** existem dentro do array |
| `Part03` | Reajusta preços menores que R$ 50 sobrescrevendo os valores no array |

**Conceitos praticados:**
- Declaração e inicialização de `int[]` e `double[]`
- **For-each** — iteração simplificada sem controle de índice
- **For tradicional** — acesso por índice para modificar valores
- Variáveis contadoras (`contador++`)

---

## 📝 Aula 08 — Arrays Multidimensionais

**Foco:** Matrizes (arrays de arrays) para representar dados em formato de tabela.

### Exercício — Controle de Estoque
Inicializa uma matriz **2x3** simulando um estoque e percorre todos os valores com dois laços `for-each` aninhados.

```
estoque[linha][coluna]  →  acessa uma posição específica da matriz
```

**Conceitos praticados:**
- `[][]` — declaração de array bidimensional
- Atribuição por posição de linha e coluna (ex: `estoque[0][1]`)
- **Loops aninhados** — um laço dentro do outro
- **For-each em matrizes** — o primeiro loop extrai a linha, o segundo percorre os valores

---

> 💡 *Esses exercícios foram feitos de forma intencional com código mais verboso para facilitar o entendimento de cada conceito durante o aprendizado.*