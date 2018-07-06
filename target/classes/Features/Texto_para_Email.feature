#language: pt

@textoEmail
Funcionalidade: Cadastrar um texto para email
Eu como Operador
Quero entrar no Portal 
Para fazer um cadastro de um texto para email

Contexto: 
Dado que esteja na home

@cadastroTexto
Cenário: Deve validar a cadastro de texto para email
Quando clicar para adicionar um texto para email
E preencher todas as informaçõesda do texto para email
Então o texto para email deverá ser cadastrado com sucesso 

@camposTexto
Cenário: Deve validar campos obrigatórios
Quando clicar para adicionar um texto para email
E não preencher os campos obrigatórios do texto para email
Então ao salvar os campos do texto para email deverão ser exibidos em um popup


