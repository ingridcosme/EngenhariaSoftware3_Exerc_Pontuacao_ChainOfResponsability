# Exerc�cio pertencente a disciplina de Engenharia de Software III

## Design Patterns

### Chain of Responsability

Considere uma aplica��o que vai cadastrar pontua��o de candidatos em um concurso p�blico. O candidato recebe uma pontua��o equivalente aos acertos na avalia��o, mas podem ser consideradas pontua��es acrescidas.

- Ter ensino m�dio completo em institui��o p�blica (os 3 anos): booleano

- Ter ensino superior completo: booleano

- Ter X anos de registro em entidade de classe: int

- Ter X anos de experi�ncia na �rea do concurso: int


1. Ensino m�dio completo -> Acresce 5 pontos

2. Ensino superior completo -> Acresce 10 pontos

3. Registro em entidade de classe -> Acresce 1 ponto por ano de registro

4. Experi�ncia na �rea -> Acresce 2 pontos por ano de experi�ncia

Criar uma aplica��o Java que receba Candidatos, com todos os dados, e exiba sua pontua��o final.