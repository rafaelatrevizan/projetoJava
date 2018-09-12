$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Unidades.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#language: pt"
    }
  ],
  "line": 4,
  "name": "Cadastrar uma Unidade",
  "description": "Eu como Operador\r\nQuero entrar no Portal \r\nPara fazer um cadastro de uma Unidade",
  "id": "cadastrar-uma-unidade",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "line": 3,
      "name": "@unidade"
    }
  ]
});
formatter.before({
  "duration": 6708446782,
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
formatter.step({
  "line": 11,
  "name": "clicar no menu Unidade",
  "keyword": "Quando "
});
formatter.match({
  "location": "Common_StepDefinition.queEstejaNaHomeDoPortal()"
});
formatter.result({
  "duration": 3672475873,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//input[@id\u003d\"frmAuth:j_idt42\"]\"}\n  (Session info: chrome\u003d67.0.3396.99)\n  (Driver info: chromedriver\u003d2.35.528161 (5b82f2d2aae0ca24b877009200ced9065a772e73),platform\u003dWindows NT 10.0.17134 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.12.0\u0027, revision: \u00277c6e0b3\u0027, time: \u00272018-05-08T14:04:26.12Z\u0027\nSystem info: host: \u0027DESKTOP-F8BMU42\u0027, ip: \u0027192.168.15.13\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_171\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 2.35.528161 (5b82f2d2aae0ca..., userDataDir: C:\\Users\\Laercio\\AppData\\Lo...}, cssSelectorsEnabled: true, databaseEnabled: false, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, rotatable: false, setWindowRect: true, takesHeapSnapshot: true, takesScreenshot: true, unexpectedAlertBehaviour: , unhandledPromptBehavior: , version: 67.0.3396.99, webStorageEnabled: true}\nSession ID: 18a5ba20fe8fdb0d11c660f135c673c1\n*** Element info: {Using\u003dxpath, value\u003d//input[@id\u003d\"frmAuth:j_idt42\"]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:543)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:317)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:419)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:309)\r\n\tat Pages.Common_Page.doLogin(Common_Page.java:21)\r\n\tat br.com.RafaelaTrevizan.steps.Common_StepDefinition.queEstejaNaHomeDoPortal(Common_StepDefinition.java:51)\r\n\tat ✽.Dado que esteja na home(Unidades.feature:10)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "Unidades.clicarNoMenuUnidade()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 14,
  "name": "Deve validar a cadastro de Unidade",
  "description": "",
  "id": "cadastrar-uma-unidade;deve-validar-a-cadastro-de-unidade",
  "type": "scenario",
  "keyword": "Cenário",
  "tags": [
    {
      "line": 13,
      "name": "@cadastroUnidade"
    }
  ]
});
formatter.step({
  "line": 15,
  "name": "clicar para adicionar uma nova Unidade",
  "keyword": "Quando "
});
formatter.step({
  "line": 16,
  "name": "preencher todas as informaçõesda unidade",
  "keyword": "E "
});
formatter.step({
  "line": 17,
  "name": "a unidade deverá ser cadastrado com sucesso",
  "keyword": "Então "
});
formatter.match({
  "location": "Unidades.clicarParaDicionarUmaNovaUnidade()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Unidades.preencherTodasAsInformaçõesdaUnidade()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Unidades.aUnidadeDeveráSerCadastradoComSucesso()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 2424345295,
  "status": "passed"
});
formatter.after({
  "duration": 2784600161,
  "status": "passed"
});
});