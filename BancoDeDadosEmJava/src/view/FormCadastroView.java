package view;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import controller.FormCadastroController;
import dao.Conexao;
import dao.UsuarioDAO;
import model.Usuario;

public class FormCadastroView extends JFrame {

	private JPanel contentPane;
	private JTextField uId;
	private JTextField uNome;
	private JPasswordField uSenha;
	private final FormCadastroController controller;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormCadastroView frame = new FormCadastroView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public JTextField getuId() {
		return uId;
	}

	public void setuId(JTextField uId) {
		this.uId = uId;
	}

	public JTextField getuNome() {
		return uNome;
	}

	public void setuNome(JTextField uNome) {
		this.uNome = uNome;
	}

	public JPasswordField getuSenha() {
		return uSenha;
	}

	public void setuSenha(JPasswordField uSenha) {
		this.uSenha = uSenha;
	}



	/**
	 * Create the frame.
	 */
	public FormCadastroView() {
		
		controller = new FormCadastroController(this);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Id:");
		lblNewLabel.setBounds(135, 53, 46, 14);
		contentPane.add(lblNewLabel);
		
		uId = new JTextField();
		uId.setBounds(133, 78, 46, 20);
		contentPane.add(uId);
		uId.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Usuário:"); 
		lblNewLabel_1.setBounds(135, 107, 84, 14);
		contentPane.add(lblNewLabel_1);
		
		uNome = new JTextField();
		uNome.setBounds(133, 132, 174, 20);
		contentPane.add(uNome);
		uNome.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Senha:");
		lblNewLabel_2.setBounds(135, 163, 84, 14);
		contentPane.add(lblNewLabel_2);
		
		uSenha = new JPasswordField();
		uSenha.setBounds(135, 184, 172, 20);
		contentPane.add(uSenha);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controller.salvaUsuario();
			}
		});
		btnSalvar.setBounds(133, 215, 174, 23);
		contentPane.add(btnSalvar);
	}

}
