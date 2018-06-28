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
  "duration": 6796838796,
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
  "duration": 3371700211,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "Validar cadastro de acomodação",
  "description": "",
  "id": "cadastrar-um-hotel;validar-cadastro-de-acomodação",
  "type": "scenario",
  "keyword": "Cenário",
  "tags": [
    {
      "line": 18,
      "name": "@acomod"
    }
  ]
});
formatter.step({
  "line": 20,
  "name": "selencionar o hotel desejado",
  "keyword": "Quando "
});
formatter.step({
  "line": 21,
  "name": "preencher as informação da acomodação",
  "keyword": "E "
});
formatter.step({
  "line": 22,
  "name": "a acomodação deverá ser cadastrada com sucesso",
  "keyword": "Então "
});
formatter.match({
  "location": "Produto_Hotel_Acomodacao.selencionarOHotelDesejado()"
});
formatter.result({
  "duration": 2661541276,
  "status": "passed"
});
formatter.match({
  "location": "Produto_Hotel_Acomodacao.preencherAsInformaçãoDaAcomodação()"
});
formatter.result({
  "duration": 2605661,
  "error_message": "cucumber.api.PendingException: TODO: implement me\r\n\tat br.com.RafaelaTrevizan.steps.Produto_Hotel_Acomodacao.preencherAsInformaçãoDaAcomodação(Produto_Hotel_Acomodacao.java:37)\r\n\tat ✽.E preencher as informação da acomodação(Produtos_Hotel.feature:21)\r\n",
  "status": "pending"
});
formatter.match({
  "location": "Produto_Hotel_Acomodacao.aAcomodaçãoDeveráSerCadastradaComSucesso()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 503555917,
  "status": "passed"
});
formatter.after({
  "duration": 5847782593,
  "status": "passed"
});
});