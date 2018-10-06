Feature: Cadastro de Usuário
	Realizar o cadastro de um novo usuário em automação com Batista
	
	Scenario: Realizar cadastro com sucesso
		Given Usuário está na Home Page
		And Clicou em começar automação web
		And Clicou em formulário criar usuário, preencheu o formalário de cadastro e clicar em enviar
		Then Será exibido a mensagem de confirmação