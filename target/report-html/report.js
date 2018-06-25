$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Produtos_Hotel.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#language: pt"
    }
  ],
  "line": 4,
  "name": "Cadastrar um hotel",
  "description": "Eu como Operador\r\nQuero entrar no Portal \r\nPara fazer um cadastro de hotel",
  "id": "cadastrar-um-hotel",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "line": 3,
      "name": "@produtos"
    }
  ]
});
formatter.before({
  "duration": 7332530183,
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
  "location": "Login.queEstejaNaHomeDoPortal()"
});
formatter.result({
  "duration": 3512687199,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Deve validar a cadastro de hotel",
  "description": "",
  "id": "cadastrar-um-hotel;deve-validar-a-cadastro-de-hotel",
  "type": "scenario",
  "keyword": "Cenário"
});
formatter.step({
  "line": 14,
  "name": "clicar para dicionar um novo hotel",
  "keyword": "Quando "
});
formatter.step({
  "line": 15,
  "name": "preencher todas as informações",
  "keyword": "E "
});
formatter.step({
  "line": 16,
  "name": "o hotel deverá ser cadastrado com sucesso",
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
formatter.after({
  "duration": 5949858548,
  "status": "passed"
});
});