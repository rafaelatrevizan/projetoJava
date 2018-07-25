#language: pt
@buscar
Funcionalidade: Buscar
Eu como Operador
Quero entrar no Portal 
Para fazer uma busca de reserva

Contexto: 
Dado que esteja na home


Cenário: Validar a busca de uma reserva
Quando clicar no menu Buscar
E buscar uma reserva pelo ID
Então a reserva buscada deverá ser exibida



