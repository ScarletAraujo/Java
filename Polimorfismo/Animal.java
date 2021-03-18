package Polimorfismo;

public abstract class Animal {
	
	private String tipoAnimal;
	
	
	public Animal (String tipoAnimal)
	{
		this.tipoAnimal=tipoAnimal;
		
	}


	abstract public void nome (String nomeAnimal);
	abstract public void idade (int idadeAnimal);
	abstract public void som (String somAnaimal);


	public String getTipoAnimal() {
		return tipoAnimal;
	}


	public void setTipoAnimal(String tipoAnimal) {
		this.tipoAnimal = tipoAnimal;
	}

	
	
}