package main;

import strategy.PlanoFree;
import strategy.PlanoPremium;
import strategy.Planos;

public abstract class Usuario {
	private String nome;
	private int plano;
	protected Planos escolhe;

	public Usuario(String nome, int plano) {
		this.nome = nome;
		this.plano = plano;
		
		switch (plano) {
		case 1:
			escolhe = new PlanoFree();
			break;
		case 2:
			escolhe = new PlanoPremium();
			break;
		case 3:
			escolhe = new PlanoPremium();
			break;
		default:
			escolhe = new PlanoFree();
			break;
		}
	}
	
	public String Plano() {
		switch (plano) {
		
		case 1:
			return "Plano Gratis";
			
		case 2:
			return "Plano Premium";

		case 3:
			return "Plano Universitario";

		default:
			return "Plano Gratis";
		}
	}
	
	public double precoAnual() {
		return precoMensal() * 12.00;
	}
	
	public abstract double precoMensal();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getPlano() {
		return plano;
	}

	public void setPlano(int plano) {
		this.plano = plano;
	}

	public String Planos() {
		return escolhe.ExibirPlano(this);

	}
	
}
