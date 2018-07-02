$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Reservar.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#language: pt"
    }
  ],
  "line": 3,
  "name": "Reservar",
  "description": "Eu como Operador\r\nQuero entrar no Portal \r\nPara fazer uma reserva",
  "id": "reservar",
  "keyword": "Funcionalidade"
});
formatter.scenarioOutline({
  "line": 26,
  "name": "Deve validar a reserva aereo",
  "description": "",
  "id": "reservar;deve-validar-a-reserva-aereo",
  "type": "scenario_outline",
  "keyword": "Esquema do Cenário",
  "tags": [
    {
      "line": 25,
      "name": "@reservarAereo"
    }
  ]
});
formatter.step({
  "line": 27,
  "name": "clicar no menu Reserva",
  "keyword": "Quando "
});
formatter.step({
  "line": 28,
  "name": "escolher a aba Passagens",
  "keyword": "E "
});
formatter.step({
  "line": 29,
  "name": "preencher o campo \"\u003corigem\u003e\" e \"\u003cdestino\u003e\"",
  "keyword": "E "
});
formatter.step({
  "line": 30,
  "name": "preencher as datas de \"\u003cida\u003e\" e \"\u003cvolta\u003e\"",
  "keyword": "E "
});
formatter.step({
  "line": 31,
  "name": "clicar no botão pesquisar para selecionar uma passagem",
  "keyword": "E "
});
formatter.step({
  "line": 32,
  "name": "selecionar a passagem",
  "keyword": "E "
});
formatter.step({
  "line": 33,
  "name": "os campos para reserva de passagens devem ser preenchidos",
  "keyword": "Então "
});
formatter.step({
  "line": 34,
  "name": "a reserva da passagem deverá ser feita com sucesso",
  "keyword": "E "
});
formatter.examples({
  "line": 36,
  "name": "",
  "description": "",
  "id": "reservar;deve-validar-a-reserva-aereo;",
  "rows": [
    {
      "cells": [
        "origem",
        "destino",
        "ida",
        "volta"
      ],
      "line": 37,
      "id": "reservar;deve-validar-a-reserva-aereo;;1"
    },
    {
      "cells": [
        "São Paulo",
        "Caldas novas",
        "05072018",
        "10072018"
      ],
      "line": 38,
      "id": "reservar;deve-validar-a-reserva-aereo;;2"
    }
  ],
  "keyword": "Exemplos"
});
formatter.before({
  "duration": 7879107265,
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
  "duration": 4079336197,
  "status": "passed"
});
formatter.scenario({
  "line": 38,
  "name": "Deve validar a reserva aereo",
  "description": "",
  "id": "reservar;deve-validar-a-reserva-aereo;;2",
  "type": "scenario",
  "keyword": "Esquema do Cenário",
  "tags": [
    {
      "line": 25,
      "name": "@reservarAereo"
    }
  ]
});
formatter.step({
  "line": 27,
  "name": "clicar no menu Reserva",
  "keyword": "Quando "
});
formatter.step({
  "line": 28,
  "name": "escolher a aba Passagens",
  "keyword": "E "
});
formatter.step({
  "line": 29,
  "name": "preencher o campo \"São Paulo\" e \"Caldas novas\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "E "
});
formatter.step({
  "line": 30,
  "name": "preencher as datas de \"05072018\" e \"10072018\"",
  "matchedColumns": [
    2,
    3
  ],
  "keyword": "E "
});
formatter.step({
  "line": 31,
  "name": "clicar no botão pesquisar para selecionar uma passagem",
  "keyword": "E "
});
formatter.step({
  "line": 32,
  "name": "selecionar a passagem",
  "keyword": "E "
});
formatter.step({
  "line": 33,
  "name": "os campos para reserva de passagens devem ser preenchidos",
  "keyword": "Então "
});
formatter.step({
  "line": 34,
  "name": "a reserva da passagem deverá ser feita com sucesso",
  "keyword": "E "
});
formatter.match({
  "location": "Reserva_Aereo.clicarNoMenuReserva()"
});
formatter.result({
  "duration": 834669166,
  "status": "passed"
});
formatter.match({
  "location": "Reserva_Aereo.escolherAAbaPassagens()"
});
formatter.result({
  "duration": 2613210987,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "São Paulo",
      "offset": 19
    },
    {
      "val": "Caldas novas",
      "offset": 33
    }
  ],
  "location": "Reserva_Aereo.preencherOCampoE(String,String)"
});
formatter.result({
  "duration": 4544579973,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "05072018",
      "offset": 23
    },
    {
      "val": "10072018",
      "offset": 36
    }
  ],
  "location": "Reserva_Aereo.preencherAsDatasDeE(String,String)"
});
formatter.result({
  "duration": 1722259318,
  "status": "passed"
});
formatter.match({
  "location": "Reserva_Aereo.clicarNoBotãoPesquisarParaSelecionarUmaPassagem()"
});
formatter.result({
  "duration": 1251121412,
  "status": "passed"
});
formatter.match({
  "location": "Reserva_Aereo.selecionarAPassagem()"
});
formatter.result({
  "duration": 2243727639,
  "status": "passed"
});
formatter.match({
  "location": "Reserva_Aereo.osCamposParaReservaDePassagensDevemSerPreenchidos()"
});
formatter.result({
  "duration": 1910561135,
  "status": "passed"
});
formatter.match({
  "location": "Reserva_Aereo.aReservaDaPassagemDeveráSerFeitaComSucesso()"
});
formatter.result({
  "duration": 2117854,
  "error_message": "cucumber.api.PendingException: TODO: implement me\r\n\tat br.com.RafaelaTrevizan.steps.Reserva_Aereo.aReservaDaPassagemDeveráSerFeitaComSucesso(Reserva_Aereo.java:77)\r\n\tat ✽.E a reserva da passagem deverá ser feita com sucesso(Reservar.feature:34)\r\n",
  "status": "pending"
});
formatter.after({
  "duration": 454039316,
  "status": "passed"
});
formatter.after({
  "duration": 5804522958,
  "status": "passed"
});
});