#language: pt

@fornecedor
Funcionalidade: Cadastrar um fornecedor
Eu como Operador
Quero entrar no Portal 
Para fazer um cadastro de fornecedor

Contexto: 
Dado que esteja na home

@cadastroFornecedor
Cenário: Deve validar a cadastro de fornecedor
Quando clicar para adicionar um novo fornecedor
E preencher todas as informações do fornecedor
Então o fornecedor deverá ser cadastrado com sucesso 

@camposFornecedor
Cenário: Deve validar campos obrigatórios
Quando clicar para adicionar um novo fornecedor
E não preencher os campos obrigatórios do fornecedor
Então ao salvar os campos do fornecedor deverão ser exibidos em um popup

@fornecedorProf
Cenário: Deve validar cadastro de profissional
Quando selecionar o fornecedor
E preencher as informações do profissional
Então o profissional deve ser cadastrado com sucesso


