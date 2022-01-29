package desafio.dio;

public class ContaPoupanca extends Conta{

	public ContaPoupanca(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("---Conta Poupança---");
		System.out.println("Saldo Conta Poupança: "+saldo);
		System.out.println("Nome do cliente: "+cliente.getNome());
	}
}

