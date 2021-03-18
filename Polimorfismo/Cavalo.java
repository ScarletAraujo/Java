package Polimorfismo;

public abstract class Cavalo extends Animal{
	
	public Cavalo() {
		super("Cavalo");
	}
	
	@Override
	public void nome (String nomeAnimal) {
		System.out.println("Nome do cavalo: "+nomeAnimal);
	}
	@Override
	public void idade (int idadeAnimal) {
		System.out.println("Idade: "+idadeAnimal);
	}
	@Override
	public void som (String somAnimal) {
		System.out.println("Som que o seu cavalo emite: "+somAnimal);
	}
	public void Corre () {
		System.out.println("Uma das caracteristicas do cavalo é correr!");
	}
	

}
