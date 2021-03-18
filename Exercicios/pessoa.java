package Exercicios;

public class pessoa {

	private String primeiroNome;
	private String ultimoNome;
	private String nomesDoMeio;
	
	
	public pessoa (String primeiro, String meio, String ultimo)
	{	
	primeiroNome = primeiro;
	ultimoNome = ultimo;
	nomesDoMeio = meio;
	}
	
	public String getNomeCompleto() 
	{
		String nomeCompleto =primeiroNome+" "+nomesDoMeio+" "+ultimoNome;
		return nomeCompleto;
		
		
	}
}
