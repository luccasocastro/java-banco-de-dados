package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class FormCadastroView extends JFrame {

	private JPanel contentPane;
	private JTextField uId;
	private JTextField uNome;
	private JTextField uSenha;

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
		
		uSenha = new JTextField();
		uSenha.setBounds(133, 184, 174, 20);
		contentPane.add(uSenha);
		uSenha.setColumns(10);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setBounds(133, 215, 174, 23);
		contentPane.add(btnSalvar);
	}

}
