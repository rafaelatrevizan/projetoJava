#language: pt

@produtos
Funcionalidade: Cadastrar um hotel
Eu como Operador
Quero entrar no Portal 
Para fazer um cadastro de hotel

Contexto: 
Dado que esteja na home


Cenário: Deve validar a cadastro de hotel
Quando clicar para adicionar um novo hotel
E preencher todas as informações
Então o hotel deverá ser cadastrado com sucesso 

@acomod
Cenário: Validar cadastro de acomodação
Quando selencionar o hotel desejado
E preencher as informação da acomodação
Então a acomodação deverá ser cadastrada com sucesso

@camposHotel
Cenário: Deve validar campos obrigatórios
Quando clicar para adicionar um novo hotel
E não preencher os campos obrigatórios do hotel
Então ao salvar os campos do hotel deverão ser exibidos em um popup




