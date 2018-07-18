#language: pt
@reservar
Funcionalidade: Reservar
Eu como Operador
Quero entrar no Portal 
Para fazer uma reserva

Contexto: 
Dado que esteja na home

@hotel
Esquema do Cenário: Deve validar a reserva de hotel
Quando clicar no menu Reserva e preencher o campo "<destino>"
E preencher as datas "<entrada>" e "<saida>"
E clicar no botão pesquisar
E selecionar o hotel
Então os campos para reserva devem ser preenchidos
E a reserva deverá ser feita com sucesso

Exemplos:
|destino				|entrada		|saida	 |
|Caldas novas 	|18072018		|20072018|

@reservaaereo
Esquema do Cenário: Deve validar a reserva de aereo
Quando clicar no menu Reserva 
E escolher a aba Passagens
E preencher o campo "<origem>" e "<destino>"
E preencher as datas de "<entrada>" e "<saida>"
E clicar no botão pesquisar passagem
E selecionar a passagem
Então os campos para reserva de passagens devem ser preenchidos
E a reserva da passagem deverá ser feita com sucesso

Exemplos:
|origem		 |destino		|entrada		|saida	 |
|São  |Caldas  	|18072018		|20072018|

