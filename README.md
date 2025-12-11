ChefAI
**1.Descricao
 *O ChefAI é um programa em Java orientado a objetos que permite ao usuário:

 *Cadastrar ingredientes disponíveis

 *Receber sugestões de receitas compatíveis

 *Visualizar detalhes de cada receita

 *Interagir pelo terminal usando uma interface simples (ConsoleUI)

#Tecnologias utilizadas:

*Java

*BlueJ (opcional)

*Git / GitHub

**2.Estrutura das pastas
ChefAI/
│
├── Main.java
│
├── models/
│   ├── Ingrediente.java
│   ├── Receita.java
│   ├── Usuario.java
│   └── Filtros.java
│
├── suggester/
│   └── RecipeSuggester.java
│
└── ui/
    └── ConsoleUI.java
 
**3.Como executar
*Abra o BlueJ

*Clique em Open Project

*Selecione a pasta ChefAI

*Clique duas vezes no arquivo Main

*Clique em void main(String[] args) → Run

**4.Diagrama de Classes
+----------------+       1..*      +----------------+
|    Receita     |-----------------|  Ingrediente   |
+----------------+                 +----------------+

+----------------+        usa      +----------------------+
|   Usuario      |-----------------|   RecipeSuggester    |
+----------------+                 +----------------------+

+----------------+        usa      +----------------+
|   ConsoleUI    |-----------------|   Usuario     |
+----------------+                 +----------------+

Explicação simples:

*Receita contém vários ingredientes

*Usuario informa ingredientes e recebe sugestões

*RecipeSuggester filtra receitas

*ConsoleUI é a interface que conversa com o usuário

**5.Exemplos de uso
 Entrada do usuário:
  Digite os ingredientes que você tem (separe por vírgula):
  tomate, arroz, cebola

Saída do sistema:
  #Receitas encontradas:

1. Arroz Temperado
2. Molho de Tomate Caseiro

Escolha uma receita para ver detalhes:
1

Saída:
--- Arroz Temperado ---
#Ingredientes:
* arroz
* sal
* tomate
* cebola

Modo de preparo:
Cozinhe o arroz, refogue os demais ingredientes e misture.

