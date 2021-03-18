package Heranca;

public class Operario extends classPessoa {
	
	private double valorProducao;
	private double comissao;
	
	public Operario (String nome, String endereco, String telefone, double valorProdução, double comissao, double valorProducao)
	{
		super(nome, endereco, telefone);
		this.valorProducao = valorProducao;
		this.comissao = comissao;
	}

	public double getValorProducao() {
		return valorProducao;
	}

	public void setValorProducao(double valorProducao) {
		this.valorProducao = valorProducao;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	
	
}
