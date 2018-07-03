#language: pt

@profissional
Funcionalidade: Cadastrar um Profissional
Eu como Operador
Quero entrar no Portal 
Para fazer um cadastro de uma Unidade

Contexto: 
Dado que esteja na home

@cadastroProf
Cenário: Deve validar a cadastro um Profissional
Quando clicar para adicionar um Profissional
E preencher todas as informações do Profissional
Então o Profissional deverá ser cadastrado com sucesso 

@camposProf
Cenário: Deve validar campos obrigatórios
Quando clicar para adicionar um Profissional
E não preencher os campos obrigatórios do profissional
Então ao salvar os campos do profissional eles deverão ser exibidos em um popup


