package projetoiphone.reprodutor;

public class Deezer implements ReprodutorMusical{

	@Override
	public void tocar() {
		System.out.println("TOCANDO A FAIXA MUSICAL");
	}

	@Override
	public void pausar() {
		System.out.println("PAUSANDO A FAIXA MUSICAL");
	}

	@Override
	public void selecionarMusica() {
		System.out.println("SELECIONANDO A FAIXA MUSICAL");
	}

}
