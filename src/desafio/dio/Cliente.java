package desafio.dio;

import java.util.Scanner;

public class Cliente {
	private String nome;
	private String endereco;
	private long cpf;
	private long rg;
	
	protected String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	protected String getEndereco() {
		return endereco;
	}
	public void setRg(int rg) {
		this.rg = rg;
	}
	protected long getRg() {
		return rg;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	protected long getCpf() {
		return cpf;
	}
	void cadastrarCliente() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o seu nome:");
		this.nome = scan.next();
		System.out.println("Digite o seu endereço: ");
		this.endereco = scan.nextLine();
		this.endereco = scan.nextLine();
		System.out.println("Digite o seu CPF: ");
		this.cpf = scan.nextLong();
		System.out.println("Digite o seu RG: ");
		this.rg = scan.nextLong();
	}
}

