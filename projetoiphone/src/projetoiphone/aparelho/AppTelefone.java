package projetoiphone.aparelho;

public class AppTelefone implements AparelhoTelefonico{

	@Override
	public void ligar() {
		System.out.println("REALIZANDO UMA LIGAÇÃO TELEFONICA");
	}

	@Override
	public void atender() {
		System.out.println("ATENDENDO UMA LIGAÇÃO TELEFONICA");
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("ESCUTANDO UM CORREIO DE VOZ");
	}

}
