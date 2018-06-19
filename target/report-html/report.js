$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Features/Reservar.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#language: pt"
    }
  ],
  "line": 3,
  "name": "Validar reseva",
  "description": "Eu como Operador\r\nQuero entrar no Portal \r\nPara fazer uma reserva",
  "id": "validar-reseva",
  "keyword": "Funcionalidade"
});
formatter.scenarioOutline({
  "line": 12,
  "name": "Deve validar a reserva",
  "description": "",
  "id": "validar-reseva;deve-validar-a-reserva",
  "type": "scenario_outline",
  "keyword": "Esquema do Cenário"
});
formatter.step({
  "line": 13,
  "name": "clicar no menu Reserva e preencher o campo \"\u003cdestino\u003e\"",
  "keyword": "Quando "
});
formatter.step({
  "line": 14,
  "name": "preencher as datas \"\u003centrada\u003e\" e \"\u003csaida\u003e\"",
  "keyword": "E "
});
formatter.step({
  "line": 15,
  "name": "clicar no botão pesquisar",
  "keyword": "E "
});
formatter.step({
  "line": 16,
  "name": "selecionar o hotel",
  "keyword": "E "
});
formatter.step({
  "line": 17,
  "name": "os campos para reserva devem ser preenchidos",
  "keyword": "Então "
});
formatter.step({
  "line": 18,
  "name": "a reserva deverá ser feita com sucesso",
  "keyword": "E "
});
formatter.examples({
  "line": 20,
  "name": "",
  "description": "",
  "id": "validar-reseva;deve-validar-a-reserva;",
  "rows": [
    {
      "cells": [
        "destino",
        "entrada",
        "saida"
      ],
      "line": 21,
      "id": "validar-reseva;deve-validar-a-reserva;;1"
    },
    {
      "cells": [
        "Caldas Novas",
        "20062018",
        "25062018"
      ],
      "line": 22,
      "id": "validar-reseva;deve-validar-a-reserva;;2"
    }
  ],
  "keyword": "Exemplos"
});
formatter.before({
  "duration": 6714900561,
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
  "name": "que desejo fazer uma reserva",
  "keyword": "Dado "
});
formatter.match({
  "location": "Login.queEstejaNaHomeDoPortal()"
});
formatter.result({
  "duration": 2988280567,
  "status": "passed"
});
formatter.scenario({
  "line": 22,
  "name": "Deve validar a reserva",
  "description": "",
  "id": "validar-reseva;deve-validar-a-reserva;;2",
  "type": "scenario",
  "keyword": "Esquema do Cenário"
});
formatter.step({
  "line": 13,
  "name": "clicar no menu Reserva e preencher o campo \"Caldas Novas\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Quando "
});
formatter.step({
  "line": 14,
  "name": "preencher as datas \"20062018\" e \"25062018\"",
  "matchedColumns": [
    1,
    2
  ],
  "keyword": "E "
});
formatter.step({
  "line": 15,
  "name": "clicar no botão pesquisar",
  "keyword": "E "
});
formatter.step({
  "line": 16,
  "name": "selecionar o hotel",
  "keyword": "E "
});
formatter.step({
  "line": 17,
  "name": "os campos para reserva devem ser preenchidos",
  "keyword": "Então "
});
formatter.step({
  "line": 18,
  "name": "a reserva deverá ser feita com sucesso",
  "keyword": "E "
});
formatter.match({
  "arguments": [
    {
      "val": "Caldas Novas",
      "offset": 44
    }
  ],
  "location": "Login.clicarNoMenuReservaEPreencherOCampo(String)"
});
formatter.result({
  "duration": 926529557,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "20062018",
      "offset": 20
    },
    {
      "val": "25062018",
      "offset": 33
    }
  ],
  "location": "Login.preencherAsDatasE(String,String)"
});
formatter.result({
  "duration": 660290366,
  "status": "passed"
});
formatter.match({
  "location": "Login.clicarNoBotãoPesquisar()"
});
formatter.result({
  "duration": 31394,
  "status": "passed"
});
formatter.match({
  "location": "Login.selecionarOHotel()"
});
formatter.result({
  "duration": 2600227,
  "error_message": "cucumber.api.PendingException: TODO: implement me\r\n\tat br.com.RafaelaTrevizan.steps.Login.selecionarOHotel(Login.java:65)\r\n\tat ✽.E selecionar o hotel(src/test/resources/Features/Reservar.feature:16)\r\n",
  "status": "pending"
});
formatter.match({
  "location": "Login.osCamposParaReservaDevemSerPreenchidos()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Login.aReservaDeveráSerFeitaComSucesso()"
});
formatter.result({
  "status": "skipped"
});
});