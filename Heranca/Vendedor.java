package Heranca;

public class Vendedor extends classPessoa{
	
	private double valorVendas;
	private int comissao;
	
	public Vendedor (String nome, String endereco, String telefone,double valorVendas, int comissao)
	{
		super(nome, endereco, telefone);
		this.valorVendas = valorVendas;
		this.comissao=comissao;
	}

	public double getValorVendas() {
		return valorVendas;
	}

	public void setValorVendas(double valorVendas) {
		this.valorVendas = valorVendas;
	}

	public int getComissao() {
		return comissao;
	}

	public void setComissao(int comissao) {
		this.comissao = comissao;
	}
	

}
