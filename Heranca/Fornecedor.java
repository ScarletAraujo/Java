package Heranca;

public class Fornecedor extends classPessoa {
	
	private double valorCredito;
	private double valorDivida;
	
		
	public Fornecedor (String nome, String endereco, String telefone, double valorCredito, double valorDivida)
	{
		super(nome, endereco,telefone);
		this.valorCredito= valorCredito;
		this.valorDivida = valorDivida;
	}


	public double getValorCredito() {
		return valorCredito;
	}


	public void setValorCredito(double valorCredito) {
		this.valorCredito = valorCredito;
	}


	public double getValorDivida() {
		return valorDivida;
	}


	public void setValorDivida(double valorDivida) {
		this.valorDivida = valorDivida;
	}
	
	public double setobterSaldo()
	{
	return valorCredito-valorDivida;
	}
}
	
	
	
	
