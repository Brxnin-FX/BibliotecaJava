package entidades;

import java.util.Iterator;
import java.util.LinkedList;

public class Biblioteca {
	LinkedList<Usuario> listaUsuario;
	LinkedList<Livro> listaLivro;
	
	public Biblioteca() {
		listaUsuario = new LinkedList<Usuario>();
		listaLivro = new LinkedList<Livro>();
		
	}
	
	public void adicionarLivro(Livro livro) {
		listaLivro.add(livro);
	}
	
	public void removerLivro(Livro livro) {
		listaLivro.remove(livro);
	}
	
	public void adicionarUsuario(Usuario usuario) {
		listaUsuario.add(usuario);
	}
	
	public void removerUsuario(Usuario usuario) {
		listaUsuario.remove(usuario);
	}
	public void adicionarHistorico(Usuario usuario, Livro livro) {
		usuario.emprestarLivro(livro);
		livro.emprestar();
	}
	
	
	
	public Livro buscarLivro(String titulo) {
        for (Livro livro : listaLivro) {
            if (livro.getNomeLivro().equals(titulo)) {
                return livro;
            }
        }
        return null;
    }
	
	public Usuario buscarUsuario(String nome) {
        for (Usuario usuario : listaUsuario) {
            if (usuario.getNomeUsuario().equals(nome)) {
                return usuario;
            }
        }
        return null;
    }
	
	public void buscarUsuario(Usuario usuario) {
		if(listaUsuario.contains(usuario)) {
			System.out.println("Esse usuario ja existe");
		}
		else {
			System.out.println("Esse usuario nao existe");
		}
	}
	
	public void listarLivros() {
		
		
		
		for (Livro l : listaLivro) {
			System.out.println(l);
		}
	}
	
	public void listarUsuarios() {
		for(Usuario u : listaUsuario) {
			System.out.println(u);
		}
	}
	
	
	

}
