# 🎓 Exercício: Composição de Objetos em Java
### Modelagem do Sistema de Notas do Aluno Carlos — Matemática

---

## 📌 Sobre o Exercício

Este exercício pratica o conceito de **composição de objetos** em Orientação a Objetos — um dos pilares mais importantes do Java. Em vez de trabalhar apenas com tipos primitivos (`int`, `double`), aprendemos a criar **objetos que contêm outros objetos**.

---

## 🧠 Conceito Central: Composição

> "Composição é quando um objeto é formado por outros objetos."

Nos exercícios anteriores tínhamos:
```
Aluno → double[] notas   (array de números)
```

Agora temos:
```
Aluno → Unidade[] unidades   (array de OBJETOS)
         └── Unidade → notaProva
                    └── notaTrabalho
                    └── notaParticipacao
```

Cada `Unidade` tem vida própria: seus atributos e seus métodos. O `Aluno` não precisa saber **como** calcular a média de uma unidade — ele simplesmente pede para a `Unidade` fazer isso.

---

## 📁 Estrutura de Pastas

```
exerciciosComposicao/
├── dominio/
│   ├── Unidade.java       ← representa uma unidade escolar
│   └── Aluno.java         ← representa o aluno
└── test/
    └── AlunoTest01.java   ← cria os objetos e testa tudo
```

---

## 📐 Regras de Negócio

| Regra | Valor |
|-------|-------|
| Notas por unidade | Prova + Trabalho + Participação = máx. **10** |
| Mínimo para passar na unidade | **>= 5** |
| Unidades no total | **3** |
| Mínimo para aprovação final | Soma das 3 unidades **>= 15** |
| Abaixo de 15 | **Recuperação** |

---

## 🗂️ As Classes

### `Unidade.java`

Responsável por guardar as notas de uma unidade e saber se o aluno foi aprovado nela.

```java
public class Unidade {
    public double notaProva;
    public double notaTrabalho;
    public double notaParticipacao;

    public double calcularMedia() {
        return notaProva + notaTrabalho + notaParticipacao;
    }

    public boolean aprovado() {
        return calcularMedia() >= 5;
    }
}
```

**Por que `boolean aprovado()`?**
O método retorna `true` ou `false`. Isso permite que o `Aluno` pergunte à `Unidade` "você foi aprovada?" sem precisar repetir a lógica.

---

### `Aluno.java`

Responsável por orquestrar tudo: exibir os resultados por unidade e calcular a situação final.

```java
public class Aluno {
    public String nome;
    public Unidade[] unidades;

    public void exibir() {
        System.out.println("Aluno: " + nome);
        if (unidades == null) return;
        exibirResultadoUnidades();
        calcularSituacaoFinal();
    }

    public void exibirResultadoUnidades() {
        for (int i = 0; i < unidades.length; i++) {
            Unidade u = unidades[i];
            System.out.println("\nUnidade " + (i + 1) + ":");
            System.out.println("  Média: " + u.calcularMedia());
            if (u.aprovado()) {
                System.out.println("  Situação: Aprovado na unidade");
            } else {
                System.out.println("  Situação: Reprovado na unidade");
            }
        }
    }

    public void calcularSituacaoFinal() {
        double somaMedias = 0;
        for (Unidade u : unidades) {
            somaMedias += u.calcularMedia();
        }
        System.out.println("\nSoma das unidades: " + somaMedias);
        if (somaMedias >= 15) {
            System.out.println("Resultado final: Aprovado!");
        } else {
            System.out.println("Resultado final: Recuperação!");
        }
    }
}
```

**Por que `for (int i = 0; ...)` no `exibirResultadoUnidades()`?**
Porque precisamos do número da unidade (1, 2, 3). O `i` começa em 0, então usamos `(i + 1)` para exibir o número correto. No `calcularSituacaoFinal()` usamos o for-each porque não precisamos do índice, só do valor.

---

### `AlunoTest01.java`

Monta o cenário de teste: cria as unidades, define as notas e dispara o `exibir()`.

```java
public class AlunoTest01 {
    public static void main(String[] args) {

        Unidade u1 = new Unidade();
        u1.notaProva        = 3.0;
        u1.notaTrabalho     = 2.0;
        u1.notaParticipacao = 1.0;

        Unidade u2 = new Unidade();
        u2.notaProva        = 4.0;
        u2.notaTrabalho     = 2.5;
        u2.notaParticipacao = 1.0;

        Unidade u3 = new Unidade();
        u3.notaProva        = 3.5;
        u3.notaTrabalho     = 2.0;
        u3.notaParticipacao = 1.5;

        Aluno aluno = new Aluno();
        aluno.nome     = "Carlos";
        aluno.unidades = new Unidade[]{u1, u2, u3};

        aluno.exibir();
    }
}
```

---

## 💻 Saída Esperada

```
Aluno: Carlos

Unidade 1:
  Média: 6.0
  Situação: Aprovado na unidade

Unidade 2:
  Média: 7.5
  Situação: Aprovado na unidade

Unidade 3:
  Média: 7.0
  Situação: Aprovado na unidade

Soma das unidades: 20.5
Resultado final: Aprovado!
```

---

## 🔍 Fluxo de Execução

```
main()
  └── aluno.exibir()
        ├── imprime nome
        ├── exibirResultadoUnidades()
        │     ├── unidades[0].calcularMedia() → 6.0
        │     ├── unidades[0].aprovado()      → true
        │     ├── unidades[1].calcularMedia() → 7.5
        │     ├── unidades[1].aprovado()      → true
        │     ├── unidades[2].calcularMedia() → 7.0
        │     └── unidades[2].aprovado()      → true
        └── calcularSituacaoFinal()
              └── somaMedias = 6.0 + 7.5 + 7.0 = 20.5 → Aprovado!
```

---

## 📚 Conceitos Praticados

| Conceito | Onde aparece |
|----------|-------------|
| **Composição de objetos** | `Unidade[]` dentro de `Aluno` |
| **Array de objetos** | `new Unidade[]{u1, u2, u3}` |
| **Retorno boolean** | `aprovado()` retorna `true` ou `false` |
| **For com índice** | `for (int i = 0; i < unidades.length; i++)` |
| **For-each** | `for (Unidade u : unidades)` |
| **Verificação de null** | `if (unidades == null) return;` |
| **Delegação de responsabilidade** | `Aluno` pede para `Unidade` calcular sua própria média |

---

## 🚲 Evolução nos Exercícios

```
Exercício 1   →   double[] notas          (array de primitivos)
Exercício 2   →   Unidade[] unidades      (array de objetos)    ← você está aqui
Próximo passo →   Materia[] materias      (composição em cadeia)
```

---

*Exercício desenvolvido como parte do curso de Java — CursoJava / Ruan Santos Sacramento*