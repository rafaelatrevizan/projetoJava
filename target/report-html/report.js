$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Cambio.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#language: pt"
    }
  ],
  "line": 4,
  "name": "Cadastrar um Cambio",
  "description": "Eu como Operador\r\nQuero entrar no Portal \r\nPara fazer um cadastro de Cambio",
  "id": "cadastrar-um-cambio",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "line": 3,
      "name": "@cambio"
    }
  ]
});
formatter.before({
  "duration": 6831595623,
  "status": "passed"
});
formatter.background({
  "line": 9,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Contexto"
});
formatter.step({
  "line": 10,
  "name": "que esteja na home",
  "keyword": "Dado "
});
formatter.match({
  "location": "Common_StepDefinition.queEstejaNaHomeDoPortal()"
});
formatter.result({
  "duration": 3303749591,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "Deve validar campos obrigatórios",
  "description": "",
  "id": "cadastrar-um-cambio;deve-validar-campos-obrigatórios",
  "type": "scenario",
  "keyword": "Cenário",
  "tags": [
    {
      "line": 18,
      "name": "@camposCambio"
    }
  ]
});
formatter.step({
  "line": 20,
  "name": "clicar para adicionar um Cambio",
  "keyword": "Quando "
});
formatter.step({
  "line": 21,
  "name": "não preencher os campos obrigatórios do cambio",
  "keyword": "E "
});
formatter.step({
  "line": 22,
  "name": "ao salvar os campos do cambio deverão ser exibidos em um popup",
  "keyword": "Então "
});
formatter.match({
  "location": "Cambio.clicarParaAdicionarUmCambio()"
});
formatter.result({
  "duration": 1874978417,
  "status": "passed"
});
formatter.match({
  "location": "Cambio.nãoPreencherOsCamposObrigatóriosDoCambio()"
});
formatter.result({
  "duration": 2193669501,
  "status": "passed"
});
formatter.match({
  "location": "Cambio.aoSalvarOsCamposDoCambioDeverãoSerExibidosEmUmPopup()"
});
formatter.result({
  "duration": 552428348,
  "status": "passed"
});
formatter.after({
  "duration": 431141987,
  "status": "passed"
});
formatter.after({
  "duration": 5839222431,
  "status": "passed"
});
});