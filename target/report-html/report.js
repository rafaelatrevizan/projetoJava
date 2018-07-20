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
  "keyword": "Funcionalidade",
  "tags": [
    {
      "line": 2,
      "name": "@reservar"
    }
  ]
});
formatter.scenarioOutline({
  "line": 25,
  "name": "Deve validar a reserva de aereo",
  "description": "",
  "id": "reservar;deve-validar-a-reserva-de-aereo",
  "type": "scenario_outline",
  "keyword": "Esquema do Cenário",
  "tags": [
    {
      "line": 24,
      "name": "@reservaaereo"
    }
  ]
});
formatter.step({
  "line": 26,
  "name": "clicar no menu Reserva",
  "keyword": "Quando "
});
formatter.step({
  "line": 27,
  "name": "escolher a aba Passagens",
  "keyword": "E "
});
formatter.step({
  "line": 28,
  "name": "preencher o campo \"\u003corigem\u003e\" e \"\u003cdestino\u003e\"",
  "keyword": "E "
});
formatter.step({
  "line": 29,
  "name": "preencher as datas de \"\u003centrada\u003e\" e \"\u003csaida\u003e\"",
  "keyword": "E "
});
formatter.step({
  "line": 30,
  "name": "clicar no botão pesquisar passagem",
  "keyword": "E "
});
formatter.step({
  "line": 31,
  "name": "selecionar a passagem",
  "keyword": "E "
});
formatter.step({
  "line": 32,
  "name": "os campos para reserva de passagens devem ser preenchidos",
  "keyword": "Então "
});
formatter.step({
  "line": 33,
  "name": "a reserva da passagem deverá ser feita com sucesso",
  "keyword": "E "
});
formatter.examples({
  "line": 35,
  "name": "",
  "description": "",
  "id": "reservar;deve-validar-a-reserva-de-aereo;",
  "rows": [
    {
      "cells": [
        "origem",
        "destino",
        "entrada",
        "saida"
      ],
      "line": 36,
      "id": "reservar;deve-validar-a-reserva-de-aereo;;1"
    },
    {
      "cells": [
        "Sao",
        "Natal",
        "20/08/2018",
        "22/08/2018"
      ],
      "line": 37,
      "id": "reservar;deve-validar-a-reserva-de-aereo;;2"
    }
  ],
  "keyword": "Exemplos"
});
formatter.before({
  "duration": 7731933344,
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
  "duration": 3065065437,
  "status": "passed"
});
formatter.scenario({
  "line": 37,
  "name": "Deve validar a reserva de aereo",
  "description": "",
  "id": "reservar;deve-validar-a-reserva-de-aereo;;2",
  "type": "scenario",
  "keyword": "Esquema do Cenário",
  "tags": [
    {
      "line": 2,
      "name": "@reservar"
    },
    {
      "line": 24,
      "name": "@reservaaereo"
    }
  ]
});
formatter.step({
  "line": 26,
  "name": "clicar no menu Reserva",
  "keyword": "Quando "
});
formatter.step({
  "line": 27,
  "name": "escolher a aba Passagens",
  "keyword": "E "
});
formatter.step({
  "line": 28,
  "name": "preencher o campo \"Sao\" e \"Natal\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "E "
});
formatter.step({
  "line": 29,
  "name": "preencher as datas de \"20/08/2018\" e \"22/08/2018\"",
  "matchedColumns": [
    2,
    3
  ],
  "keyword": "E "
});
formatter.step({
  "line": 30,
  "name": "clicar no botão pesquisar passagem",
  "keyword": "E "
});
formatter.step({
  "line": 31,
  "name": "selecionar a passagem",
  "keyword": "E "
});
formatter.step({
  "line": 32,
  "name": "os campos para reserva de passagens devem ser preenchidos",
  "keyword": "Então "
});
formatter.step({
  "line": 33,
  "name": "a reserva da passagem deverá ser feita com sucesso",
  "keyword": "E "
});
formatter.match({
  "location": "Reserva_Aereo.clicarNoMenuReserva()"
});
formatter.result({
  "duration": 1299298959,
  "status": "passed"
});
formatter.match({
  "location": "Reserva_Aereo.escolherAAbaPassagens()"
});
formatter.result({
  "duration": 2292435254,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Sao",
      "offset": 19
    },
    {
      "val": "Natal",
      "offset": 27
    }
  ],
  "location": "Reserva_Aereo.preencherOCampoE(String,String)"
});
formatter.result({
  "duration": 6128439851,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "20/08/2018",
      "offset": 23
    },
    {
      "val": "22/08/2018",
      "offset": 38
    }
  ],
  "location": "Reserva_Aereo.preencherAsDatasDeE(String,String)"
});
formatter.result({
  "duration": 2644434235,
  "status": "passed"
});
formatter.match({
  "location": "Reserva_Aereo.clicarNoBotãoPesquisarParaSelecionarUmaPassagem()"
});
formatter.result({
  "duration": 1292292172,
  "status": "passed"
});
formatter.match({
  "location": "Reserva_Aereo.selecionarAPassagem()"
});
formatter.result({
  "duration": 4103966206,
  "status": "passed"
});
formatter.match({
  "location": "Reserva_Aereo.osCamposParaReservaDePassagensDevemSerPreenchidos()"
});
formatter.result({
  "duration": 2689105370,
  "status": "passed"
});
formatter.match({
  "location": "Reserva_Aereo.aReservaDaPassagemDeveráSerFeitaComSucesso()"
});
formatter.result({
  "duration": 665633297,
  "error_message": "org.openqa.selenium.WebDriverException: unknown error: unhandled inspector error: {\"code\":-32000,\"message\":\"Cannot find context with specified id\"}\n  (Session info: chrome\u003d67.0.3396.99)\n  (Driver info: chromedriver\u003d2.35.528161 (5b82f2d2aae0ca24b877009200ced9065a772e73),platform\u003dWindows NT 10.0.17134 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nBuild info: version: \u00273.12.0\u0027, revision: \u00277c6e0b3\u0027, time: \u00272018-05-08T14:04:26.12Z\u0027\nSystem info: host: \u0027DESKTOP-F8BMU42\u0027, ip: \u0027192.168.15.26\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_171\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 2.35.528161 (5b82f2d2aae0ca..., userDataDir: C:\\Users\\Laercio\\AppData\\Lo...}, cssSelectorsEnabled: true, databaseEnabled: false, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, rotatable: false, setWindowRect: true, takesHeapSnapshot: true, takesScreenshot: true, unexpectedAlertBehaviour: , unhandledPromptBehavior: , version: 67.0.3396.99, webStorageEnabled: true}\nSession ID: 40c7274f5a0bfc42bef6de3cbd68b592\n*** Element info: {Using\u003dxpath, value\u003d//div[contains(text(), \"Total da compra\")]/span}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:543)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElements(RemoteWebDriver.java:344)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementsByXPath(RemoteWebDriver.java:423)\r\n\tat org.openqa.selenium.By$ByXPath.findElements(By.java:348)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElements(RemoteWebDriver.java:305)\r\n\tat Pages.Reservar_Aereo_Page.getValorComprovante(Reservar_Aereo_Page.java:89)\r\n\tat br.com.RafaelaTrevizan.steps.Reserva_Aereo.aReservaDaPassagemDeveráSerFeitaComSucesso(Reserva_Aereo.java:85)\r\n\tat ✽.E a reserva da passagem deverá ser feita com sucesso(Reservar.feature:33)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 582684434,
  "status": "passed"
});
formatter.after({
  "duration": 771046623,
  "status": "passed"
});
});