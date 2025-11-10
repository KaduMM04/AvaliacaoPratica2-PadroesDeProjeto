# AvaliacaoPratica2-PadroesDeProjeto


---

## ⚙️ Questão 1 — Strategy Pattern

### 🧩 Contexto
O sistema precisa calcular métricas de risco (Value at Risk, Expected Shortfall, Stress Testing), que podem mudar **dinamicamente em tempo de execução**.

### 💡 Padrão utilizado
**Strategy Pattern** — utilizado para permitir que **diferentes algoritmos de cálculo de risco** possam ser **trocados em tempo de execução** sem alterar o código cliente.

### ✅ Benefícios
- Facilita a **extensão de novos algoritmos** sem modificar o núcleo do sistema.  
- Mantém o código **flexível e aberto para mudanças**.  
- Isola cada estratégia de cálculo, melhorando a manutenção.

### 📊 Diagrama UML
📁 [Ver diagrama da Questão 1](Diagramas/questao01.png)

---

## ⚙️ Questão 2 — Adapter Pattern

### 🧩 Contexto
O sistema moderno precisa se comunicar com um **sistema bancário legado**, que usa métodos e tipos de dados **incompatíveis**.

### 💡 Padrão utilizado
**Adapter Pattern** — usado para **converter a interface moderna (`ProcessadorTransacoes`)** em uma interface que o sistema legado entende (`SistemaBancarioLegado`).

### ✅ Benefícios
- Permite **reutilizar código legado** sem precisar modificá-lo.  
- **Isola incompatibilidades** de interface em um único ponto (o adaptador).  
- Facilita a **migração gradual** para sistemas modernos.

### 📊 Diagrama UML
📁 [Ver diagrama da Questão 2](Diagramas/questao02.png)

---

## ⚙️ Questão 3 — State Pattern

### 🧩 Contexto
Sistema de controle de uma **usina nuclear**, com múltiplos estados (DESLIGADA, OPERACAO_NORMAL, ALERTA_AMARELO, ALERTA_VERMELHO, EMERGENCIA, MANUTENÇÃO), e regras complexas de transição.

### 💡 Padrão utilizado
**State Pattern** — utilizado para **modelar os diferentes estados operacionais** da usina e suas **transições controladas**.

### ✅ Benefícios
- Elimina **estruturas condicionais complexas** (`if`/`switch`).  
- Cada estado encapsula seu **próprio comportamento**.  
- Permite **adição de novos estados** sem alterar o código existente.  
- Facilita a **simulação e controle de segurança**, como o modo de manutenção.

### 📊 Diagrama UML
📁 [Ver diagrama da Questão 3](Diagramas/questao03.png)

---

## ⚙️ Questão 4 — Chain of Responsibility Pattern

### 🧩 Contexto
Sistema de validação de **documentos fiscais eletrônicos (NF-e)**, onde múltiplos validadores devem agir em sequência, com controle de falhas e rollback.

### 💡 Padrão utilizado
**Chain of Responsibility Pattern** — utilizado para **encadear validadores especializados**, permitindo que cada um decida se continua ou interrompe a cadeia.

### ✅ Benefícios
- Permite **encadear regras complexas** de forma dinâmica e modular.  
- Implementa um **circuit breaker** (interrupção após 3 falhas).  
- Oferece **rollback** automático em operações que modificam o documento.  
- Favorece a **extensão de novas regras de validação** sem alterar o fluxo central.

### 📊 Diagrama UML
📁 [Ver diagrama da Questão 4](questao04.png)

---

## 🧠 Conclusão

Este projeto demonstra como os **padrões de projeto** podem:
- Tornar o código **mais flexível e extensível**;  
- **Reduzir acoplamento** entre classes;  
- **Melhorar a legibilidade e manutenção** do sistema;  
- Resolver **problemas reais** de forma elegante e padronizada.

---

### 👨‍💻 Autor
**Carlos Eduardo Mendes Miranda**  
Engenharia de Software — 2025

- Implemente timeout individual para cada validador
