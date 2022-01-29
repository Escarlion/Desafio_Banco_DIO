package desafio.dio;

import java.util.Scanner;

public class Menus {
	Scanner scan = new Scanner(System.in);
	Cliente cliente = new Cliente();
	ContaPoupanca contaP = new ContaPoupanca(cliente);
	ContaCorrente contaC = new ContaCorrente(cliente);
	
	void introducao() {
		System.out.println("======================");
		System.out.println("Bem vindo ao seu banco");
		System.out.println("======================");
		System.out.println("");
		System.out.println("Selecione o que deseja fazer:");
		System.out.println("1)Mudar dados pessoais\n2)Sacar\n3)depositar\n4)transferir\n5)Cadastrar Cliente\n6)Ver meus dados\n0)sair");
		int choice = scan.nextInt();
		switch (choice) {
		case 1:
			menuMudarDados();
		case 2:
			menuSacar();
		case 3:
			menuDepositar();
		case 4:
			menuTransferir();
		case 5:
			menuCadastrarCliente();
		case 6:
			menuVerDadosCliente();
		default:
			System.out.println("Obrigado por usar nosso programa!");
			System.exit(0);
		}
	}

	void menuMudarDados() {
		System.out.println("======================");
		System.out.println("Bem vindo a area de mudança de dados");
		System.out.println("======================");
		System.out.println("");
		System.out.println("Deseja o que deseja mudar:");
		System.out.println("1)Nome\n2)Endereço\n3)CPF\n4)RG\n0)voltar");
		int choice = scan.nextInt();
		switch(choice) {
		case 1:
			mudarNome();
		case 2:
			mudarEndereco();
		case 3:
			mudarCpf();
		case 4:
			mudarRg();
		default:
			introducao();
		}
	}
	void mudarNome() {
		System.out.println("Digite seu novo nome: ");
		String nome = scan.next();
		cliente.setNome(nome);
		System.out.println("Seu novo nome é: "+nome);
		fecharVoltar();
	}
	void mudarEndereco() {
		System.out.println("Digite seu novo endereço: ");
		String endereco = scan.next();
		cliente.setEndereco(endereco);
		System.out.println("Seu novo endereço é: "+endereco);
		fecharVoltar();
	}
	void mudarCpf() {
		System.out.println("Digite seu novo CPF: ");
		int cpf = scan.nextInt();
		cliente.setCpf(cpf);
		System.out.println("Seu novo endereço é: "+cpf);
		fecharVoltar();
	}
	void mudarRg() {
		System.out.println("Digite seu novo RG: ");
		int rg = scan.nextInt();
		cliente.setRg(rg);
		System.out.println("Seu novo endereço é: "+rg);
		fecharVoltar();
	}
	void menuSacar() {
		System.out.println("==========================");
		System.out.println("Bem vindo a area de saque!");
		System.out.println("==========================");
		System.out.println("Deseja sacar da sua conta poupança(1) ou da sua conta corrente(2)?");
		int choice = scan.nextInt();
		choice = selecionarConta(choice);
		if (choice == 1) {
			System.out.println("selecione valor a ser sacado da conta poupança:");
			int valor = scan.nextInt();
			contaP.sacar(valor);
			System.out.println("Valor sacado: "+valor);
			contaP.imprimirExtrato();
		}else if(choice == 2) {
			System.out.println("selecione valor a ser sacado da conta corrente:");
			int valor = scan.nextInt();
			contaC.sacar(valor);
			System.out.println("Valor sacado: "+valor);
			contaC.imprimirExtrato();
		}
		fecharVoltar();
	}
	void menuDepositar() {
		System.out.println("==========================");
		System.out.println("Bem vindo a area de deposito!");
		System.out.println("==========================");
		System.out.println("Deseja depositar em sua conta poupança(1) ou em sua conta corrente(2)?");
		int choice = scan.nextInt();
		choice = selecionarConta(choice);
		if (choice == 1) {
			System.out.println("selecione valor a ser depositado da conta poupança:");
			int valor = scan.nextInt();
			contaP.depositar(valor);
			System.out.println("Valor depositado: "+valor);
			contaP.imprimirExtrato();
		}else if(choice == 2) {
			System.out.println("selecione valor a ser depositado da conta corrente:");
			int valor = scan.nextInt();
			contaC.depositar(valor);
			System.out.println("Valor depositado: "+valor);
			contaC.imprimirExtrato();
		}
		fecharVoltar();
	}
	void menuTransferir() {
		{
			System.out.println("==========================");
			System.out.println("Bem vindo a area de transferencia!");
			System.out.println("==========================");
			System.out.println("Deseja tranferir da sua conta poupança(1) ou da sua conta corrente(2)?");
			int choice = scan.nextInt();
			choice = selecionarConta(choice);
			if (choice == 1) {
				System.out.println("selecione valor a ser transferido da conta poupança:");
				int valor = scan.nextInt();
				contaP.transferir(valor, contaC);
				System.out.println("Valor transferido: "+valor);
				contaP.imprimirExtrato();
				contaC.imprimirExtrato();
			}else if(choice == 2) {
				System.out.println("selecione valor a ser transferido da conta corrente:");
				int valor = scan.nextInt();
				contaC.transferir(valor, contaP);
				System.out.println("Valor transferido: "+valor);
				contaC.imprimirExtrato();
				contaP.imprimirExtrato();
			}
			fecharVoltar();
		}
	}
	void menuCadastrarCliente() {
		System.out.println("=================================");
		System.out.println("Bem vindo a area de cadastramento");
		System.out.println("=================================");
		cliente.cadastrarCliente();
		fecharVoltar();
		
	}
	void menuVerDadosCliente() {
		System.out.println("==================================");
		System.out.println("Bem vindo a area de dados pessoais");
		System.out.println("==================================");
		
		System.out.println("Nome: "+cliente.getNome());
		System.out.println("Endereço: "+cliente.getEndereco());
		System.out.println("Cpf: "+cliente.getCpf());
		System.out.println("Rg: "+cliente.getRg());
		fecharVoltar();

	}
	void fecharVoltar() {
		System.out.println("Deseja voltar ao menu principal? (Y/N)");
		char choice = scan.next().toUpperCase().charAt(0);
		switch (choice) {
		case 'Y':
			introducao();
		default:
			System.out.println("Obrigado por usar nosso programa!");
			System.exit(0);
		}
	}
	int selecionarConta(int choice) {
		while(choice != 1 && choice != 2) {
			System.out.println("Valor invalido");
			choice = scan.nextInt();
		}
		return choice;
		
	}
}
