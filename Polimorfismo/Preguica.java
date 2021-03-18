package Polimorfismo;

public abstract class Preguica extends Animal{
	
	public Preguica() {
		super("Preguiça");
	}
	
	@Override
	public void nome (String nomeAnimal) {
		System.out.println("Nome do preguica: "+nomeAnimal);
	}
	@Override
	public void idade (int idadeAnimal) {
		System.out.println("Idade: "+idadeAnimal);
	}
	@Override
	public void som (String somAnimal) {
		System.out.println("Som que o seu preguica emite: "+somAnimal);
	}
	public void Subirarvores () {
		System.out.println("Uma das caracteristicas do preguica é subir em árvores!");
	}
	public void infoPreguica() {
		
	}


}
