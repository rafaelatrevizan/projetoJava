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
  "duration": 8315861444,
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
  "duration": 3598149353,
  "status": "passed"
});
formatter.match({
  "location": "Unidades.clicarNoMenuUnidade()"
});
formatter.result({
  "duration": 1275889070,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "Deve validar campos obrigatórios",
  "description": "",
  "id": "cadastrar-uma-unidade;deve-validar-campos-obrigatórios",
  "type": "scenario",
  "keyword": "Cenário",
  "tags": [
    {
      "line": 19,
      "name": "@camposUnidade"
    }
  ]
});
formatter.step({
  "line": 21,
  "name": "clicar para adicionar uma nova Unidade",
  "keyword": "Quando "
});
formatter.step({
  "line": 22,
  "name": "não preencher os campos obrigatórios",
  "keyword": "E "
});
formatter.step({
  "line": 23,
  "name": "ao salvar os campos unidade deverão ser exibidos em um popup",
  "keyword": "Então "
});
formatter.match({
  "location": "Unidades.clicarParaDicionarUmaNovaUnidade()"
});
formatter.result({
  "duration": 1530570625,
  "status": "passed"
});
formatter.match({
  "location": "Unidades.nãoPreencherOsCamposObrigatórios()"
});
formatter.result({
  "duration": 1204044448,
  "status": "passed"
});
formatter.match({
  "location": "Unidades.aoSalvarOsCamposDeverãoSerExibidosEmUmPopup()"
});
formatter.result({
  "duration": 1419427383,
  "error_message": "java.lang.RuntimeException\r\n\tat Pages.Unidades_Page.popUpErro(Unidades_Page.java:162)\r\n\tat br.com.RafaelaTrevizan.steps.Unidades.aoSalvarOsCamposDeverãoSerExibidosEmUmPopup(Unidades.java:64)\r\n\tat ✽.Então ao salvar os campos unidade deverão ser exibidos em um popup(Unidades.feature:23)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 460278774,
  "status": "passed"
});
formatter.after({
  "duration": 3789623121,
  "status": "passed"
});
});