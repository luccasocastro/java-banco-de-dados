package controller;

import java.sql.Connection;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import dao.Conexao;
import dao.UsuarioDAO;
import model.Usuario;
import view.FormCadastroView;

public class FormCadastroController {
	
	private FormCadastroView view;

	public FormCadastroController(FormCadastroView view) {
		this.view = view;
	}
	
	public void salvaUsuario() {
		String user = view.getuNome().getText();
		String senha = view.getuSenha().getText();
		
		Usuario usuario = new Usuario(user,senha);
		
		try {
			Connection conexao = new Conexao().getConnection();
			UsuarioDAO usuarioDAO = new UsuarioDAO(conexao);
			usuarioDAO.insert(usuario);
			
			JOptionPane.showMessageDialog(null, "Usuário salvo com sucesso!!");
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

}
