#language: pt

@cliente
Funcionalidade: Cadastrar um cliente
Eu como Operador
Quero entrar no Portal 
Para fazer um cadastro de cliente

Contexto: 
Dado que esteja na home

@cadastroCliente
Cenário: Deve validar a cadastro de cliente
Quando clicar para adicionar um novo cliente
E preencher todas as informações do cliente
Então o cliente deverá ser cadastrado com sucesso 

@camposCliente
Cenário: Deve validar campos obrigatórios
Quando clicar para adicionar um novo cliente
E não preencher os campos obrigatórios do cliente
Então ao salvar os campos do cliente deverão ser exibidos em um popup

@desativarCliente
Cenário: Deve validar um cliente desativado
Quando pesquisar um cliente
E desativar o mesmo
Então na coluna Ativo deverá ser exibido Não

@ativarCliente
Cenário: Deve validar um cliente ativado
Quando pesquisar um cliente
E ativar o mesmo
Então na coluna Ativo deverá ser exibido Sim


