#language: pt

@tarifario
Funcionalidade: Cadastrar tarifário para aéreo
Eu como Operador
Quero entrar no Portal 
Para fazer um cadastro de tarifário de aéreo

Contexto: 
Dado que esteja na home


Cenário: Deve validar a cadastro de tarifário de aéreo
Quando clicar para adicionar um novo tarifário de aéreo
E preencher todas as informações de tarifário
Então a tarifa deverá ser cadastrada com sucesso





