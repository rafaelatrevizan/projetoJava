$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Produtos_Hotel_Facilidades.feature");
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
      "name": "@facilidades"
    }
  ]
});
formatter.before({
  "duration": 6208072475,
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
  "duration": 2846952476,
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
  "name": "clicar para dicionar uma nova facilidade",
  "keyword": "Quando "
});
formatter.step({
  "line": 15,
  "name": "preencher todas as informações da facilidade",
  "keyword": "E "
});
formatter.step({
  "line": 16,
  "name": "a facilidade deverá ser cadastrada com sucesso",
  "keyword": "Então "
});
formatter.match({
  "location": "Produto_Hotel_Facilidades.clicarParaDicionarUmaNovaFacilidade()"
});
formatter.result({
  "duration": 2824736747,
  "status": "passed"
});
formatter.match({
  "location": "Produto_Hotel_Facilidades.preencherTodasAsInformações()"
});
formatter.result({
  "duration": 35619,
  "status": "passed"
});
formatter.match({
  "location": "Produto_Hotel_Facilidades.aFacilidadeDeveráSerCadastradaComSucesso()"
});
formatter.result({
  "duration": 2778325,
  "error_message": "cucumber.api.PendingException: TODO: implement me\r\n\tat br.com.RafaelaTrevizan.steps.Produto_Hotel_Facilidades.aFacilidadeDeveráSerCadastradaComSucesso(Produto_Hotel_Facilidades.java:35)\r\n\tat ✽.Então a facilidade deverá ser cadastrada com sucesso(Produtos_Hotel_Facilidades.feature:16)\r\n",
  "status": "pending"
});
formatter.after({
  "duration": 6092524484,
  "status": "passed"
});
});