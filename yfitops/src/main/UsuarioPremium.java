package main;


public class UsuarioPremium extends Usuario{

	public UsuarioPremium(String nome, int plano) {
		super(nome, plano);
	}

	@Override
	public double precoMensal() {
		switch(getPlano()) {
		case 1:
			return 0;
		
		case 2:
			return 19.80;
	
		case 3:
			return 9.90;
		
		default:
			return 0;
			
		}
	}

}
