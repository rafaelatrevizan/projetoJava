$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Cadastro_Fornecedores.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#language: pt"
    }
  ],
  "line": 4,
  "name": "Cadastrar um fornecedor",
  "description": "Eu como Operador\r\nQuero entrar no Portal \r\nPara fazer um cadastro de fornecedor",
  "id": "cadastrar-um-fornecedor",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "line": 3,
      "name": "@produtos"
    }
  ]
});
formatter.before({
  "duration": 6369122322,
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
  "duration": 3111228970,
  "status": "passed"
});
formatter.scenario({
  "line": 25,
  "name": "Deve validar cadastro de profissional",
  "description": "",
  "id": "cadastrar-um-fornecedor;deve-validar-cadastro-de-profissional",
  "type": "scenario",
  "keyword": "Cenário",
  "tags": [
    {
      "line": 24,
      "name": "@fornecedorProf"
    }
  ]
});
formatter.step({
  "line": 26,
  "name": "selecionar o fornecedor",
  "keyword": "Quando "
});
formatter.step({
  "line": 27,
  "name": "preencher as informações do profissional",
  "keyword": "E "
});
formatter.step({
  "line": 28,
  "name": "o profissional deve ser cadastrado com sucesso",
  "keyword": "Então "
});
formatter.match({
  "location": "Cadastro_Fornecedor.selecionarOFornecedor()"
});
formatter.result({
  "duration": 11138052299,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"id\",\"selector\":\"idNomePesquisa\"}\n  (Session info: chrome\u003d67.0.3396.99)\n  (Driver info: chromedriver\u003d2.35.528161 (5b82f2d2aae0ca24b877009200ced9065a772e73),platform\u003dWindows NT 10.0.17134 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.12.0\u0027, revision: \u00277c6e0b3\u0027, time: \u00272018-05-08T14:04:26.12Z\u0027\nSystem info: host: \u0027DESKTOP-F8BMU42\u0027, ip: \u0027192.168.15.31\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_171\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 2.35.528161 (5b82f2d2aae0ca..., userDataDir: C:\\Users\\Laercio\\AppData\\Lo...}, cssSelectorsEnabled: true, databaseEnabled: false, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, rotatable: false, setWindowRect: true, takesHeapSnapshot: true, takesScreenshot: true, unexpectedAlertBehaviour: , unhandledPromptBehavior: , version: 67.0.3396.99, webStorageEnabled: true}\nSession ID: 68d24a638ad64d24d5789de4661e7194\n*** Element info: {Using\u003did, value\u003didNomePesquisa}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:543)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:317)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementById(RemoteWebDriver.java:363)\r\n\tat org.openqa.selenium.By$ById.findElement(By.java:188)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:309)\r\n\tat Pages.Cadastro_Fornecedor_Page.pesqNome(Cadastro_Fornecedor_Page.java:77)\r\n\tat br.com.RafaelaTrevizan.steps.Cadastro_Fornecedor.selecionarOFornecedor(Cadastro_Fornecedor.java:60)\r\n\tat ✽.Quando selecionar o fornecedor(Cadastro_Fornecedores.feature:26)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "Cadastro_Fornecedor.preencherAsInformaçõesDoProfissional()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Cadastro_Fornecedor.oProfissionalDeveSerCadastradoComSucesso()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 405707217,
  "status": "passed"
});
formatter.after({
  "duration": 5951595454,
  "status": "passed"
});
});