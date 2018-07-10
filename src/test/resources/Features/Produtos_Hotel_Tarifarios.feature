#language: pt

@tarifarioHotel
Funcionalidade: Cadastrar tarifário para hotel
Eu como Operador
Quero entrar no Portal 
Para fazer um cadastro de tarifário de hotel

Contexto: 
Dado que esteja na home

@cadastroHotelTarifario
Cenário: Deve validar a cadastro de tarifário de hotel
Quando clicar para adicionar um novo hotel
E preencher todas as informações
Então o hotel deverá ser cadastrado com sucesso 
Quando clicar para adicionar um novo tarifário de hotel
E preencher todas as informações de tarifário de hotel
Então a tarifa do hotel deverá ser cadastrada com sucesso

@camposHotelTarifario
Cenário: Deve validar campos obrigatórios
Quando clicar para adicionar um novo tarifário de hotel
E não preencher os campos obrigatórios do tarifario
Então ao salvar os campos do tarifario deverão ser exibidos em um popup





