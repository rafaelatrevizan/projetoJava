#language: pt
@reservar
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
|Caldas novas 	|11072018		|20072018|



