#language: pt

Funcionalidade: Validar reseva
Eu como Operador
Quero entrar no Portal 
Para fazer uma reserva

Contexto: 
Dado que desejo fazer uma reserva


Esquema do Cenário: Deve validar a reserva
Quando clicar no menu Reserva e preencher o campo "<destino>"
E preencher as datas "<entrada>" e "<saida>"
E clicar no botão pesquisar
E selecionar o hotel
Então os campos para reserva devem ser preenchidos
E a reserva deverá ser feita com sucesso

Exemplos:
|destino				|entrada		|saida	 |
|Caldas Novas 	|20062018		|025062018|

