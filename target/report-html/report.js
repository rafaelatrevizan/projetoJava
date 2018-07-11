$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("EditarReserva.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#language: pt"
    }
  ],
  "line": 3,
  "name": "Editar reserva",
  "description": "Eu como Operador\r\nQuero entrar no Portal \r\nPara editar uma reserva",
  "id": "editar-reserva",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "line": 2,
      "name": "@editarReserva"
    }
  ]
});
formatter.before({
  "duration": 6709142950,
  "status": "passed"
});
formatter.background({
  "line": 8,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Contexto"
});
formatter.step({
  "line": 9,
  "name": "que esteja na home",
  "keyword": "Dado "
});
formatter.match({
  "location": "Common_StepDefinition.queEstejaNaHomeDoPortal()"
});
formatter.result({
  "duration": 3623907037,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Validar inclusão de nova linha de Valor ao ser incluido outra acomodação",
  "description": "",
  "id": "editar-reserva;validar-inclusão-de-nova-linha-de-valor-ao-ser-incluido-outra-acomodação",
  "type": "scenario",
  "keyword": "Cenário"
});
formatter.step({
  "line": 13,
  "name": "clicar no menu Buscar",
  "keyword": "Quando "
});
formatter.step({
  "line": 14,
  "name": "buscar uma reserva",
  "keyword": "E "
});
formatter.step({
  "line": 15,
  "name": "a reserva buscada deverá ser exibida",
  "keyword": "Então "
});
formatter.step({
  "line": 16,
  "name": "editar a reserva",
  "keyword": "Quando "
});
formatter.step({
  "line": 17,
  "name": "adicionar uma nova acomodação",
  "keyword": "E "
});
formatter.step({
  "line": 18,
  "name": "uma nova linha de valores deverá ser exibida",
  "keyword": "Então "
});
formatter.match({
  "location": "Buscar.clicarNoMenuBuscar()"
});
formatter.result({
  "duration": 3536946288,
  "status": "passed"
});
formatter.match({
  "location": "Buscar.buscarUmaReserva()"
});
formatter.result({
  "duration": 2317690,
  "error_message": "cucumber.api.PendingException: TODO: implement me\r\n\tat br.com.RafaelaTrevizan.steps.Buscar.buscarUmaReserva(Buscar.java:34)\r\n\tat ✽.E buscar uma reserva(EditarReserva.feature:14)\r\n",
  "status": "pending"
});
formatter.match({
  "location": "Buscar.aReservaBuscadaDeveráSerExibida()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Editar_Reserva.editarAReserva()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Editar_Reserva.adicionarUmaNovaAcomodação()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Editar_Reserva.umaNovaLinhaDeValoresDeveráSerExibida()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 490822517,
  "status": "passed"
});
formatter.after({
  "duration": 5817409054,
  "status": "passed"
});
});