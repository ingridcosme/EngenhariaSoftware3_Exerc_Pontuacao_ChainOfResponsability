# Exercício pertencente a disciplina de Engenharia de Software III

## Design Patterns

### Chain of Responsability

Considere uma aplicação que vai cadastrar pontuação de candidatos em um concurso público. O candidato recebe uma pontuação equivalente aos acertos na avaliação, mas podem ser consideradas pontuações acrescidas.

- Ter ensino médio completo em instituição pública (os 3 anos): booleano

- Ter ensino superior completo: booleano

- Ter X anos de registro em entidade de classe: int

- Ter X anos de experiência na área do concurso: int


1. Ensino médio completo -> Acresce 5 pontos

2. Ensino superior completo -> Acresce 10 pontos

3. Registro em entidade de classe -> Acresce 1 ponto por ano de registro

4. Experiência na área -> Acresce 2 pontos por ano de experiência

Criar uma aplicação Java que receba Candidatos, com todos os dados, e exiba sua pontuação final.