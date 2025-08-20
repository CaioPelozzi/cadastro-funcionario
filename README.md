## 👔 Cadastro de Funcionários

Projeto autoral desenvolvido para treinamento em Java, com foco em:

- Tratamento de exceções personalizadas
- Herança e polimorfismo
- POO e boas práticas
- Uso de Enums e Collections (List)

---

## 🚀 Tecnologias Utilizadas

- Java 17+   
- Programação Orientada a Objetos   
- Exceptions (checked e unchecked)   
- Enums

---

📂 Estrutura do Projeto
```bash
/src
 ├── application/
 │   └── Program.java                  # Classe principal
 │
 ├── model/
 │   ├── entities/
 │   │   ├── Funcionario.java          # Classe base
 │   │   └── Gerente.java              # Classe derivada (herança)
 │   ├── enums/
 │   │   └── TipoContrato.java         # Tipos de contrato
 │   └── excecoes/
 │       ├── DataInvalidaException.java
 │       └── SalarioInvalidoException.java
