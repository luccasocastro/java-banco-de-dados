package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class LoginView extends JFrame {

	private JPanel contentPane;
	private JTextField uNome;
	private JPasswordField uSenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginView frame = new LoginView();
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
	public LoginView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(122, 59, 60, 14);
		contentPane.add(lblNewLabel);
		
		uNome = new JTextField();
		uNome.setBounds(122, 84, 180, 20);
		contentPane.add(uNome);
		uNome.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Senha:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(122, 117, 60, 14);
		contentPane.add(lblNewLabel_1);
		
		JButton btnLogin = new JButton("Entrar");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MenuView telaMenu = new MenuView();
				telaMenu.setVisible(true);
			}
		});
		
		uSenha = new JPasswordField();
		uSenha.setBounds(122, 139, 180, 20);
		contentPane.add(uSenha);
		btnLogin.setBounds(122, 170, 180, 23);
		contentPane.add(btnLogin);
		
		JButton btnCadastro = new JButton("Cadastrar");
		btnCadastro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FormCadastroView telaCadastro = new FormCadastroView();
				telaCadastro.setVisible(true);
			}
		});
		btnCadastro.setBounds(122, 200, 180, 23);
		contentPane.add(btnCadastro);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(LoginView.class.getResource("/view/imagens/fundoLogin.jpg")));
		lblNewLabel_2.setBounds(0, 0, 434, 261);
		contentPane.add(lblNewLabel_2);
	}
}
