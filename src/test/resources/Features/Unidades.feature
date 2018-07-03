#language: pt

@unidade
Funcionalidade: Cadastrar uma Unidade
Eu como Operador
Quero entrar no Portal 
Para fazer um cadastro de uma Unidade

Contexto: 
Dado que esteja na home


Cenário: Deve validar a cadastro de Unidade
Quando clicar para adicionar uma nova Unidade
E preencher todas as informaçõesda unidade
Então a unidade deverá ser cadastrado com sucesso 

@campos
Cenário: Deve validar campos obrigatórios
Quando clicar para adicionar uma nova Unidade
E não preencher os campos obrigatórios
Então ao salvar os campos deverão ser exibidos em um popup


