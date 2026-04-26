# ☕ Maratona Java — DevDojo

> Repositório de estudos com aulas e exercícios práticos do curso **Maratona Java** da [DevDojo Academy](https://devdojo.academy).

---

## 👨‍💻 Sobre este repositório

Este repositório documenta minha jornada de aprendizado em Java, acompanhando o curso **Maratona Java** da DevDojo. Cada pasta representa um módulo do curso, contendo as aulas assistidas e os exercícios implementados.

O código foi escrito de forma **intencional e verbosa**, priorizando a clareza e o entendimento de cada conceito acima de otimizações prematuras — uma prática essencial para quem está construindo uma base sólida na linguagem.

---

## 📊 Progresso

| Módulo | Status |
|---|---|
| Módulo 1 — Introdução ao Java | ✅ Concluído |
| Módulo 2 — Introdução a Classes e POO | 🔄 Em andamento |

---

## 🗂️ Estrutura do Repositório

```
src/
└── cursomaratonajava/
    ├── introducao/                    # Módulo 1 — Fundamentos da linguagem
    │   └── ExerciciosIntroducao/      # Exercícios práticos do módulo 1
    └── javacore/
        └── introducaoclasses/         # Módulo 2 — Introdução a Classes e POO
            ├── dominio/               # Classes modelo (Estudante, Professor)
            ├── exerciciosjavacore/    # Exercícios de classes
            │   ├── dominioexercicio/  # Classe Carro (exercício)
            │   └── testexercicio/     # Testes do exercício Carro
            ├── introducaometodos/     # Introdução a métodos
            │   ├── dominios/          # Classe Calculadora
            │   └── test/              # Testes da Calculadora
            └── test/                  # Testes das classes Estudante e Professor
```

---

## 📚 Conteúdo das Aulas

### ✅ Módulo 1 — Introdução ao Java

<details>
<summary><strong>Aula 01 — Comentários</strong></summary>

Primeiro contato com a sintaxe do Java. Aprendizado sobre os tipos de comentários na linguagem:
- Comentário de linha `//`
- Comentário de bloco `/* */`
- Comentário de documentação `/** */`

</details>

<details>
<summary><strong>Aula 02 — Tipos Primitivos</strong></summary>

Estudo dos 8 tipos primitivos do Java e quando usar cada um:

| Tipo | Uso |
|---|---|
| `int` | Números inteiros padrão |
| `long` | Inteiros grandes (IDs, timestamps) |
| `byte` / `short` | Inteiros pequenos para economizar memória |
| `double` | Decimais com alta precisão |
| `float` | Decimais com menos precisão |
| `boolean` | Verdadeiro ou falso |
| `char` | Um único caractere |

</details>

<details>
<summary><strong>Aula 04 — Operadores</strong></summary>

Operadores aritméticos, relacionais e lógicos. Destaque para o operador de resto `%` e os operadores lógicos `&&` e `||`.

</details>

<details>
<summary><strong>Aula 05 — Estruturas Condicionais</strong></summary>

Tomada de decisão com `if/else` encadeados e `switch`. Introdução ao agrupamento de cases e uso do `break` para evitar fall-through.

</details>

<details>
<summary><strong>Aula 06 — Estruturas de Repetição</strong></summary>

Laços `for` com controle de fluxo usando `break` (interrompe o laço) e `continue` (pula a iteração atual).

</details>

<details>
<summary><strong>Aula 07 — Arrays</strong></summary>

Arrays unidimensionais: declaração, inicialização, leitura com `for-each` e modificação com `for` tradicional.

</details>

<details>
<summary><strong>Aula 08 — Arrays Multidimensionais</strong></summary>

Matrizes (`[][]`) para representar dados em formato de tabela. Uso de loops aninhados para percorrer todos os elementos.

</details>

---

### 🔄 Módulo 2 — Introdução a Classes e POO

<details>
<summary><strong>Introdução a Classes — Domínio</strong></summary>

Primeiro contato com a criação de classes em Java e o conceito de **objeto**. Foram criadas as classes modelo `Estudante` e `Professor`, ambas com os atributos `nome` (String), `idade` (int) e `sexo` (char).

Conceitos praticados:
- Declaração de classes com `public class`
- Definição de **atributos** (campos) com diferentes tipos
- Separação entre **classe de domínio** (modelo) e **classe de teste** (onde o `main` roda)
- Instanciação de objetos com `new`
- Atribuição e leitura de atributos via notação de ponto (`objeto.atributo`)

</details>

<details>
<summary><strong>Testes de Classes — Estudante e Professor</strong></summary>

Criação de classes de teste para validar o comportamento das classes de domínio.

- **EstudanteTest01** — Instancia um `Estudante`, define nome, idade e sexo, e imprime os valores
- **EstudanteTeste02** — Instancia dois objetos `Estudante` independentes, demonstrando que cada objeto tem seu próprio estado em memória
- **ProfessorTest01** — Instancia um `Professor` com nome "Rogerio", idade 35 e sexo 'M', e imprime os dados formatados

</details>

<details>
<summary><strong>Exercício de Classes — Carro</strong></summary>

Exercício prático de criação de classes aplicando os conceitos aprendidos.

- **Carro** — Classe de domínio com atributos `nome` (String), `modelo` (String) e `ano` (int)
- **CarroTestExercicio01** — Instancia dois carros (`Volkswagen Voyage 2017` e `Nissan GT-R 2008`) e imprime os dados de cada um

</details>

<details>
<summary><strong>Introdução a Métodos — Calculadora</strong></summary>

Introdução ao conceito de **métodos** em Java, usando uma classe `Calculadora` como exemplo prático.

Métodos implementados:

| Método | Retorno | Descrição |
|---|---|---|
| `somaDoisNumeros()` | `void` | Soma fixa de 10 + 10 |
| `subtraiDoisNumeros()` | `void` | Subtração fixa de 21 - 2 |
| `multiplicaDoisNumeros(int, int)` | `void` | Multiplica dois valores passados como parâmetro |
| `dividedoisNumeros(double, double)` | `double` | Divide dois números e retorna o resultado |
| `imprimeDivisaoDeDoisNumeros(double, double)` | `void` | Divide e imprime, tratando divisão por zero |

Conceitos praticados:
- Métodos `void` (sem retorno) vs métodos com `return`
- **Parâmetros** — passar valores para dentro do método
- Uso de `return` em métodos `void` como "break" para interromper execução
- Tratamento de divisão por zero com `if (num2 != 0)`
- **CalculadoraTest01** — testa soma e subtração
- **CalculadoraTest02** — testa multiplicação com parâmetros
- **CalculadoraTest03** — testa divisão e o tratamento de erro

</details>

---

## 📝 Exercícios

### 📁 Módulo 1 — ExerciciosIntroducao

| Exercício | Conteúdo | Status |
|---|---|---|
| `Aula03TiposPrimitivosExercicio` | Relatório de salário com concatenação de variáveis | ✅ |
| `Aula05EstruturaCondicionaisExercicio` | Identificar dia útil ou final de semana com `switch` | ✅ |
| `Aula05EstruturasCondicionaisExercicioPart02` | Condicionais encadeadas com intervalos numéricos | ✅ |
| `Aula06EstruturasDeRepeticaoExercicio` | Imprimir números pares de 0 a 1.000.000 | ✅ |
| `Aula06EstruturasDeRepeticaoExercicioPart02` | Interromper laço com `break` ao passar de 25 | ✅ |
| `Aula06EstruturasDeRepeticaoExercicioPart03` | Parcelamento de carro com `break` | ✅ |
| `Aula06EstruturasDeRepeticaoExercicioPart04` | Parcelamento de carro com `continue` | ✅ |
| `Aula07ArrayExercicioPart01` | Filtrar valores maiores que 10 em um array | ✅ |
| `Aula07ArrayExercicioPart02` | Contar números pares em um array | ✅ |
| `Aula07ArrayExercicioPart03` | Reajustar preços menores que R$ 50 | ✅ |
| `Aula08ArrayMultidimensionalExercicioPart01` | Percorrer matriz de estoque com loops aninhados | ✅ |

### 📁 Módulo 2 — ExerciciosJavaCore

| Exercício | Conteúdo | Status |
|---|---|---|
| `Carro` + `CarroTestExercicio01` | Criar classe com atributos e instanciar dois objetos | ✅ |

---

## 🛠️ Tecnologias

![Java](https://img.shields.io/badge/Java-15-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![IntelliJ IDEA](https://img.shields.io/badge/IntelliJ_IDEA-000000?style=for-the-badge&logo=intellij-idea&logoColor=white)
![Git](https://img.shields.io/badge/Git-F05032?style=for-the-badge&logo=git&logoColor=white)

---

## 📖 Sobre o Curso

**Maratona Java** é um curso completo de Java oferecido pela **DevDojo Academy**, cobrindo desde os fundamentos da linguagem até tópicos avançados como coleções, streams, lambdas e muito mais.

🔗 [Acessar o curso](https://devdojo.academy)

---

<p align="center">
  Feito com ☕ e muito estudo
</p>