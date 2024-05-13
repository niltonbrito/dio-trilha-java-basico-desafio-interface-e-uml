package projetoiphone.navegador;

public class Safari implements NavegadorInternet{

	@Override
	public void exibirPagina() {
		System.out.println("CARREGANDO A PAGINA DA INTERNET");		
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("ADICIONANDO UMA NOVA ABA NO NAVEGADOR DE INTERNET");		
	}

	@Override
	public void atualizarPagina() {
		System.out.println("ATUALIZANDO A PAGINA DE INTERNET");		
	}

}
