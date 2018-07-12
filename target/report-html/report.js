$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Produtos_Pacotes.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#language: pt"
    }
  ],
  "line": 4,
  "name": "Cadastrar um pacote",
  "description": "Eu como Operador\r\nQuero entrar no Portal \r\nPara fazer um cadastro de pacote",
  "id": "cadastrar-um-pacote",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "line": 3,
      "name": "@pacotes"
    }
  ]
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
  "status": "skipped"
});
formatter.scenario({
  "line": 13,
  "name": "Deve validar a cadastro de pacote",
  "description": "",
  "id": "cadastrar-um-pacote;deve-validar-a-cadastro-de-pacote",
  "type": "scenario",
  "keyword": "Cenário",
  "tags": [
    {
      "line": 12,
      "name": "@cadastroPacote"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "clicar para adicionar um novo pacote",
  "keyword": "Quando "
});
formatter.step({
  "line": 15,
  "name": "preencher todas as informações do pacote",
  "keyword": "E "
});
formatter.step({
  "line": 16,
  "name": "o pacote deverá ser cadastrado com sucesso",
  "keyword": "Então "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});