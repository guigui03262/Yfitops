package main;

public class UsuarioFree extends Usuario{

	public UsuarioFree(String nome, int plano) {
		super(nome, plano);
	}
	
	@Override
	public double precoMensal() {
		return 0;
	}
}
