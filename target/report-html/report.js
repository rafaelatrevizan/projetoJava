$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Produtos_Aereo_Tarifarios.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#language: pt"
    }
  ],
  "line": 4,
  "name": "Cadastrar tarifário para aéreo",
  "description": "Eu como Operador\r\nQuero entrar no Portal \r\nPara fazer um cadastro de tarifário de aéreo",
  "id": "cadastrar-tarifário-para-aéreo",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "line": 3,
      "name": "@tarifario"
    }
  ]
});
formatter.before({
  "duration": 6698103833,
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
  "duration": 2870172194,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Deve validar a cadastro de tarifário de aéreo",
  "description": "",
  "id": "cadastrar-tarifário-para-aéreo;deve-validar-a-cadastro-de-tarifário-de-aéreo",
  "type": "scenario",
  "keyword": "Cenário"
});
formatter.step({
  "line": 14,
  "name": "clicar para adicionar um novo tarifário de aéreo",
  "keyword": "Quando "
});
formatter.step({
  "line": 15,
  "name": "preencher todas as informações de tarifário",
  "keyword": "E "
});
formatter.step({
  "line": 16,
  "name": "a tarifa deverá ser cadastrada com sucesso",
  "keyword": "Então "
});
formatter.match({
  "location": "Produto_Aereo_Tarifarios.clicarParaDicionarUmNovoTarifárioDeAéreo()"
});
formatter.result({
  "duration": 2747899957,
  "status": "passed"
});
formatter.match({
  "location": "Produto_Aereo_Tarifarios.preencherTodasAsInformaçõesDeTarifário()"
});
formatter.result({
  "duration": 575136713,
  "status": "passed"
});
formatter.match({
  "location": "Produto_Aereo_Tarifarios.aTarifaDeveráSerCadastradaComSucesso()"
});
formatter.result({
  "duration": 3234134,
  "error_message": "cucumber.api.PendingException: TODO: implement me\r\n\tat br.com.RafaelaTrevizan.steps.Produto_Aereo_Tarifarios.aTarifaDeveráSerCadastradaComSucesso(Produto_Aereo_Tarifarios.java:34)\r\n\tat ✽.Então a tarifa deverá ser cadastrada com sucesso(Produtos_Aereo_Tarifarios.feature:16)\r\n",
  "status": "pending"
});
formatter.after({
  "duration": 5913180681,
  "status": "passed"
});
});