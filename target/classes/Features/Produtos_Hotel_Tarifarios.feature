#language: pt

@tarifarioHotel
Funcionalidade: Cadastrar tarifário para hotel
Eu como Operador
Quero entrar no Portal 
Para fazer um cadastro de tarifário de hotel

Contexto: 
Dado que esteja na home


Cenário: Deve validar a cadastro de tarifário de hotel
Quando clicar para adicionar um novo tarifário de hotel
E preencher todas as informações de tarifário de hotel
Então a tarifa do hotel deverá ser cadastrada com sucesso





