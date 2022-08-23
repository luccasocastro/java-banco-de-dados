package view;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import dao.Conexao;
import dao.UsuarioDAO;
import model.Usuario;

public class FormCadastroView extends JFrame {

	private JPanel contentPane;
	private JTextField uId;
	private JTextField uNome;
	private JPasswordField uSenha;

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

	/**
	 * Create the frame.
	 */
	public FormCadastroView() {
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
				Usuario usuario = new Usuario("xandao","12345");
				
				try {
					Connection conexao = new Conexao().getConnection();
					UsuarioDAO usuarioDAO = new UsuarioDAO(conexao);
					usuarioDAO.insert(usuario);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		btnSalvar.setBounds(133, 215, 174, 23);
		contentPane.add(btnSalvar);
	}

}
