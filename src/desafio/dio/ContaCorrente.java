package desafio.dio;

public class ContaCorrente extends Conta {

	public ContaCorrente(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("---Conta Corrente---");
		System.out.println("Saldo Conta corrente: "+saldo);
		System.out.println("Nome do cliente: "+cliente.getNome());
		
	}
	
}
