package chainresponsibility;

import java.util.HashMap;
import java.util.Map;

public class EstiloReggae extends BuscarMusica{
	private Map<String, MusicaCR> banco = new HashMap<>();
	
	public EstiloReggae(BuscarMusica bm) {
		super(bm);
		
		banco.put("Is This Love", new MusicaCR("Bob Marley - Is This Love"));
	}
	
	@Override
	protected MusicaCR encontrarMusica(String nome) {
		if(banco.containsKey(nome)) {
			System.out.println("Musica encontrada no banco estilo Reggae");
			return banco.get(nome);
		}
			
		return null;
	}

}
