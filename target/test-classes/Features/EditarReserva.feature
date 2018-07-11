#language: pt
@editarReserva
Funcionalidade: Editar reserva
Eu como Operador
Quero entrar no Portal 
Para editar uma reserva

Contexto: 
Dado que esteja na home


Cenário: Validar inclusão de nova linha de Valor ao ser incluido outra acomodação
Quando clicar no menu Buscar
E buscar uma reserva
Então a reserva buscada deverá ser exibida
Quando editar a reserva
E adicionar uma nova acomodação
Então uma nova linha de valores deverá ser exibida

