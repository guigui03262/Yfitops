package main;


import chainresponsibility.EstiloFolk;
import chainresponsibility.EstiloReggae;
import chainresponsibility.EstiloRock;
import chainresponsibility.BuscarMusica;
import chainresponsibility.MusicaCR;
import composite.Favoritas;
import composite.MusicasFavoritas;
import composite.PlaylistFavoritas;
import nullobject.AbstractMusica;
import nullobject.MusicaDAO;
import observerpattern.Dispositivo;
import observerpattern.Service;
import statepattern.Musica;
//import statepattern.Musica;
//import statepattern.Player;

public class Main {

	public static void main(String[] args) {
		/*
		Usuario free = new UsuarioFree("Joao", 1);
		Usuario premium = new UsuarioPremium("Pedro", 2);
		Usuario premiumU = new UsuarioPremium("Paulo", 3);

		// strategy
		System.out.println("O " + free.getNome() + ", tem o  " + free.Plano() + ", " + free.Planos());
		System.out.println("O " + premium.getNome() + ", tem o " + premium.Plano() + ", " + premium.Planos());
		System.out.println("O " + premiumU.getNome() + ", tem o " + premiumU.Plano() + ", " + premiumU.Planos());

		// hook
		System.out.println("O " + free.getNome() + " tem um " + free.Plano() + ". Paga " + free.precoMensal()
				+ " R$ mensal e " + free.precoAnual() + " R$ anual.");
		System.out.println("O " + premium.getNome() + " tem um " + premium.Plano() + ". Paga " + premium.precoMensal()
				+ " R$ mensal e " + premium.precoAnual() + " R$ anual.");
		System.out.println("O " + premiumU.getNome() + " tem um " + premiumU.Plano() + ". Paga "
				+ premiumU.precoMensal() + " R$ mensal e " + premiumU.precoAnual() + " R$ anual.");
		
		// nullObject
		AbstractMusica musica1 = MusicaDAO.getMusica("Break On Through");
		AbstractMusica musica2 = MusicaDAO.getMusica("Love Me Two Times");
		AbstractMusica musica3 = MusicaDAO.getMusica("Riders On The Storm");
		//AbstractMusica musica4 = MusicaDAO.getMusica("Love Street");
		System.out.println(musica1.getNome());
		System.out.println(musica2.getNome());
		System.out.println(musica3.getNome());
		
		// state
		Player player = new Player();
		player.reset();
		player.playPause();
		Musica musica = new Musica("Break On Through - The Doors");
		player.setMusic(musica);
		player.playPause();
		player.reset();
		Musica musicaa = new Musica("The End - The Doors");
		player.setMusic(musicaa);
		player.playPause();
		player.reset();
		
		// observer
		Service y = new Service("Yfitops");
		Service ny = new Service("Yfitops");
		Dispositivo xiaomi = new Dispositivo("Poco Pro");
		Dispositivo iphone = new Dispositivo("iPhone20");
		Dispositivo motorola = new Dispositivo("MotoG1");

		y.addObserver(xiaomi);
		y.addObserver(iphone);
		ny.addObserver(motorola);

		ny.notify("Compre outro celular que rode o Yfitops");
		y.notify("Todas as quintas tem musicas novas!");
		
		// composite
		
		Favoritas mF = new MusicasFavoritas("The End");
		Favoritas mF2 = new MusicasFavoritas("Light My Fire");
		Favoritas mF3 = new MusicasFavoritas("Five To One");
		
		PlaylistFavoritas pF = new PlaylistFavoritas("The Doors");
		
		pF.addPlaylist(mF);
		pF.addPlaylist(mF2);
		pF.addPlaylist(mF3);
		
		System.out.println("Playlist: " + pF.getNome());
		pF.printFavoritas();
		
		pF.removePlaylist(mF2);
		
		System.out.println("Playlist: " + pF.getNome());
		pF.printFavoritas();
		*/
		//chain
		BuscarMusica musicas = new EstiloFolk(new EstiloRock(new EstiloReggae(null)));
		MusicaCR m = musicas.encontrar("L.A. Woman");
		System.out.println("Musica Encontrada " + m.getNome());
		m = musicas.encontrar("Hurt");
		System.out.println("Musica Encontrada " + m.getNome());
		m = musicas.encontrar("Is This Love");
		System.out.println("Musica Encontrada " + m.getNome());
		m = musicas.encontrar("Father And Son");
		System.out.println("Musica Encontrada " + m.getNome());
		
	}

}