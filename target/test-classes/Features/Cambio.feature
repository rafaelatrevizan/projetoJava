#language: pt

@cambio
Funcionalidade: Cadastrar um Cambio
Eu como Operador
Quero entrar no Portal 
Para fazer um cadastro de Cambio

Contexto: 
Dado que esteja na home

@cadastroCambio
Cenário: Deve validar a cadastro de Cambio
Quando clicar para adicionar um Cambio
E preencher todas as informações do Cambio
Então o Cambio deverá ser cadastrado com sucesso 

@camposCambio
Cenário: Deve validar campos obrigatórios
Quando clicar para adicionar um Cambio
E não preencher os campos obrigatórios do cambio
Então ao salvar os campos do cambio deverão ser exibidos em um popup


