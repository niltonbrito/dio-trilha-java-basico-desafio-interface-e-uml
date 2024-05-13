package projetoiphone.iphone;

import projetoiphone.aparelho.AparelhoTelefonico;
import projetoiphone.aparelho.AppTelefone;
import projetoiphone.navegador.NavegadorInternet;
import projetoiphone.navegador.Safari;
import projetoiphone.reprodutor.Deezer;
import projetoiphone.reprodutor.ReprodutorMusical;

public class Iphone {

	public static void main(String[] args) {

		NavegadorInternet navegar = new Safari();

		navegar.exibirPagina();
		navegar.adicionarNovaAba();
		navegar.atualizarPagina();
		
		AparelhoTelefonico aperelho = new AppTelefone();
		
		aperelho.atender();
		aperelho.ligar();
		aperelho.iniciarCorreioVoz();
		
		ReprodutorMusical music = new Deezer();
		
		music.selecionarMusica();
		music.tocar();
		music.pausar();
	}

}
