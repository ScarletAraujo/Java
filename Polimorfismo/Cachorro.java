package Polimorfismo;

public abstract class Cachorro extends Animal {
	
	
	public Cachorro() {
		super("Cachorro");
	}
	
	@Override
	public void nome (String nomeAnimal) {
		System.out.println("Nome do cachorro: "+nomeAnimal);
	}
	@Override
	public void idade (int idadeAnimal) {
		System.out.println("Idade: "+idadeAnimal);
	}
	@Override
	public void som (String somAnimal) {
		System.out.println("Som que o seu cachorro emite: "+somAnimal);
	}
	public void Corre () {
		System.out.println("Uma das caracteristicas do cachorro é correr!");
	}
	
}

