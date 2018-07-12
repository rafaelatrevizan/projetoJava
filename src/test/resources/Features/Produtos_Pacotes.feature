#language: pt

@pacotes
Funcionalidade: Cadastrar um pacote
Eu como Operador
Quero entrar no Portal 
Para fazer um cadastro de pacote

Contexto: 
Dado que esteja na home

@cadastroPacote
Cenário: Deve validar a cadastro de pacote
Quando clicar para adicionar um novo pacote
E preencher todas as informações do pacote
Então o pacote deverá ser cadastrado com sucesso 






