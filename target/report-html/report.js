$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Texto_para_Email.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#language: pt"
    }
  ],
  "line": 4,
  "name": "Cadastrar um texto para email",
  "description": "Eu como Operador\r\nQuero entrar no Portal \r\nPara fazer um cadastro de um texto para email",
  "id": "cadastrar-um-texto-para-email",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "line": 3,
      "name": "@textoEmail"
    }
  ]
});
formatter.before({
  "duration": 6938904522,
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
  "duration": 7288791113,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "Deve validar campos obrigatórios",
  "description": "",
  "id": "cadastrar-um-texto-para-email;deve-validar-campos-obrigatórios",
  "type": "scenario",
  "keyword": "Cenário",
  "tags": [
    {
      "line": 18,
      "name": "@camposTexto"
    }
  ]
});
formatter.step({
  "line": 20,
  "name": "clicar para adicionar um texto para email",
  "keyword": "Quando "
});
formatter.step({
  "line": 21,
  "name": "não preencher os campos obrigatórios do texto para email",
  "keyword": "E "
});
formatter.step({
  "line": 22,
  "name": "ao salvar os campos do texto para email deverão ser exibidos em um popup",
  "keyword": "Então "
});
formatter.match({
  "location": "Cadastro_TextoEmail.clicarParaAdicionarUmTextoParaEmail()"
});
formatter.result({
  "duration": 5314835688,
  "status": "passed"
});
formatter.match({
  "location": "Cadastro_TextoEmail.nãoPreencherOsCamposObrigatóriosDoTextoParaEmail()"
});
formatter.result({
  "duration": 1870462348,
  "status": "passed"
});
formatter.match({
  "location": "Cadastro_TextoEmail.aoSalvarOsCamposDoTextoParaEmailDeverãoSerExibidosEmUmPopup()"
});
formatter.result({
  "duration": 702996455,
  "status": "passed"
});
formatter.after({
  "duration": 411880408,
  "status": "passed"
});
formatter.after({
  "duration": 5735361397,
  "status": "passed"
});
});