package entidades;

import java.util.ArrayList;


public class CadastroDiciplina {
	ArrayList<Diciplinas> Listadiciplinas;
	
	//Construtor
	public CadastroDiciplina(String diciplina) {
		this.Listadiciplinas = new ArrayList<>();
	}
	
	public void CadastrarDiciplina(Diciplinas diciplinas) {
		if(Listadiciplinas.contains(diciplinas)) {
			System.out.println("Essa diciplina ja foi cadastrada");
		}
		else if(!isValidTiposDiciplinas(Listadiciplinas)) {
			System.out.println("Tipo de diciplina Invalido");
		}
		else {
			Listadiciplinas.add(diciplinas);
			System.out.println("Diciplina Cadastrada com sucesso");
		}
	}
	
	

	public void RemoverDiciplina(Diciplinas diciplinas) {
		Listadiciplinas.remove(diciplinas);
	}
	
	public void ListarDiciplina() {
		
	}
	
	

	private boolean isValidTiposDiciplinas(ArrayList<Diciplinas> listadiciplinas2) {
		for(TiposDiciplinas tipo: TiposDiciplinas.values() {
			
		}
		return false;
	}

}
