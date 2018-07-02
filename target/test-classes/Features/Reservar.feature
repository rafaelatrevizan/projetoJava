#language: pt

Funcionalidade: Reservar
Eu como Operador
Quero entrar no Portal 
Para fazer uma reserva

Contexto: 
Dado que esteja na home


Esquema do Cenário: Deve validar a reserva de hotel
Quando clicar no menu Reserva e preencher o campo "<destino>"
E preencher as datas "<entrada>" e "<saida>"
E clicar no botão pesquisar
E selecionar o hotel
Então os campos para reserva devem ser preenchidos
E a reserva deverá ser feita com sucesso

Exemplos:
|destino				|entrada		|saida	 |
|Caldas novas 	|01072018		|06072018|


@reservarAereo
Esquema do Cenário: Deve validar a reserva aereo
Quando clicar no menu Reserva 
E escolher a aba Passagens
E preencher o campo "<origem>" e "<destino>"
E preencher as datas de "<ida>" e "<volta>"
E clicar no botão pesquisar para selecionar uma passagem
E selecionar a passagem
Então os campos para reserva de passagens devem ser preenchidos
E a reserva da passagem deverá ser feita com sucesso

Exemplos:
|origem		 |destino				|ida				|volta	 	  |
|São Paulo |Caldas novas 	|05072018		|10072018		|

