$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Produtos_Hotel_Bloqueio.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#language: pt"
    }
  ],
  "line": 4,
  "name": "Cadastrar um hotel",
  "description": "Eu como Operador\r\nQuero entrar no Portal \r\nPara fazer um bloqueio de hotel",
  "id": "cadastrar-um-hotel",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "line": 3,
      "name": "@bloqueioHotel"
    }
  ]
});
formatter.before({
  "duration": 8209868546,
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
  "duration": 4503842684,
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
  "name": "clicar para fazer um bloqueio de hotel",
  "keyword": "Quando "
});
formatter.step({
  "line": 15,
  "name": "preencher todas as informações do bloqueio",
  "keyword": "E "
});
formatter.step({
  "line": 16,
  "name": "o bloqueio deverá ser cadastrado com sucesso",
  "keyword": "Então "
});
formatter.match({
  "location": "Bloqueio_Hotel.clicarParaFazerUmBloqueioDeHotel()"
});
formatter.result({
  "duration": 3020894787,
  "status": "passed"
});
formatter.match({
  "location": "Bloqueio_Hotel.preencherTodasAsInformaçõesDoBloqueio()"
});
formatter.result({
  "duration": 2774341733,
  "status": "passed"
});
formatter.match({
  "location": "Bloqueio_Hotel.oBloqueioDeveráSerCadastradoComSucesso()"
});
formatter.result({
  "duration": 4547227,
  "error_message": "cucumber.api.PendingException: TODO: implement me\r\n\tat br.com.RafaelaTrevizan.steps.Bloqueio_Hotel.oBloqueioDeveráSerCadastradoComSucesso(Bloqueio_Hotel.java:45)\r\n\tat ✽.Então o bloqueio deverá ser cadastrado com sucesso(Produtos_Hotel_Bloqueio.feature:16)\r\n",
  "status": "pending"
});
formatter.after({
  "duration": 552153050,
  "status": "passed"
});
formatter.after({
  "duration": 5731958097,
  "status": "passed"
});
});