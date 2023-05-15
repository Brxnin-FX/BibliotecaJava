package entidades;

import java.util.ArrayList;

public class Acervo_CadastroLivro {
	
	ArrayList<Livro> listaLivro;
	
	
	public Acervo_CadastroLivro() {
		listaLivro = new ArrayList<>();
	}
	
	public void CadastrarLivro(Livro livro) {
		if (listaLivro.contains(livro)) {
			System.out.println("Livro já cadastrada!");
		}
		else {
			listaLivro.add(livro);
			System.out.println("Livro cadastrado!");
		}
	}
	
	public Livro buscarLivro(String nomeLivro) {
		for(Livro livro : listaLivro) {
			if(livro.getTitulo().equals(nomeLivro)) {
				return livro;
			}
		}
				
				
				return null;
	}
	
	public void verificarDisponivel(Livro livro) {	
		if(livro.getQtdDisponivel() <= 0 ) {
			System.out.println("Livro indisponivel");
			
		}
		else {
			System.out.println("Livro disponivel");
		}
		
	}
	
	public void emprestarLivro(String nomeLivro) {
		Livro livro = buscarLivro(nomeLivro);
		
	     if(livro.getQtdDisponivel() > 0) {
	    	 livro.setQtdDisponivel(livro.getQtdDisponivel()-1);
	    	 System.out.println("Livro emprestado com sucesso");
	     }
	     else {
	    	 System.out.println("Nao foi possivel emprestar o Livro");
	     }
	}
	
	
	public void devolverLivro(Livro livro) {
		livro.setQtdDisponivel(livro.qtdDisponivel+1);
	}
	
	public void verificarQuaisDisponiveis(String nomeLivro) {
		Livro livro = buscarLivro(nomeLivro);
		
		for(Livro livros: listaLivro) {
			if(livro.tipo == TiposLivros.Romance) {
				System.out.println(livro.toString());
			}
		}
	}
	
	
	

}
