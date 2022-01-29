package desafio.dio;

public class ContaPoupanca extends Conta{

	public ContaPoupanca(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("---Conta Poupan�a---");
		System.out.println("Saldo Conta Poupan�a: "+saldo);
		System.out.println("Nome do cliente: "+cliente.getNome());
	}
}

