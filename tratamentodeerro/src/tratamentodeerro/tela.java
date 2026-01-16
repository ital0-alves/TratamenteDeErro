package tratamentodeerro;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;
import javax.swing.JFormattedTextField;

import javax.swing.JFormattedTextField.AbstractFormatter;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class tela {

	private JFrame frame;
	JFormattedTextField txtCPF;
	JLabel lblNewLabel_CEP;
	JLabel lblNewLabel_Telefone;
	JLabel lblNewLabel_CNPJ;
	JLabel lblNewLabel_DataNasc;
	JFormattedTextField txtCEP;
	JFormattedTextField txtTelefone;
	JFormattedTextField txtDataNasc;
	JFormattedTextField txtCNPJ;
	JRadioButton MASC;
	JRadioButton Femi;
	JRadioButton Dani;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tela window = new tela();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public tela() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		frame = new JFrame();
		frame.setBounds(100, 100, 497, 367);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		try {
			MaskFormatter mask = new MaskFormatter("###.###.###-##");
			txtCPF = new JFormattedTextField(mask);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Erro ao formatar", "erro", -1);
		}
		try {
			MaskFormatter mask = new MaskFormatter("#####-###");
			txtCEP = new JFormattedTextField(mask);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Erro ao formatar", "erro", -1);
		}
		try {
			MaskFormatter mask = new MaskFormatter("(##)#####-####");
			txtTelefone = new JFormattedTextField(mask);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Erro ao formatar", "erro", -1);
		}
		try {
			MaskFormatter mask = new MaskFormatter("##/##/####");
			txtDataNasc = new JFormattedTextField(mask);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Erro ao formatar", "erro", -1);
		}
		try {
			MaskFormatter mask = new MaskFormatter("##.###.###/####.##");
			txtCNPJ = new JFormattedTextField(mask);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Erro ao formatar", "erro", -1);
		}
		JLabel lblNewLabel = new JLabel("CPF");
		lblNewLabel.setBounds(10, 11, 22, 45);
		frame.getContentPane().add(lblNewLabel);

		// JFormattedTextField txtCPF = new JFormattedTextField();
		txtCPF.setBounds(128, 23, 163, 20);
		frame.getContentPane().add(txtCPF);

		lblNewLabel_CEP = new JLabel("CEP");
		lblNewLabel_CEP.setBounds(10, 54, 35, 45);
		frame.getContentPane().add(lblNewLabel_CEP);

		lblNewLabel_Telefone = new JLabel("Telefone");
		lblNewLabel_Telefone.setBounds(10, 98, 52, 45);
		frame.getContentPane().add(lblNewLabel_Telefone);

		lblNewLabel_CNPJ = new JLabel("CNPJ");
		lblNewLabel_CNPJ.setBounds(10, 205, 35, 45);
		frame.getContentPane().add(lblNewLabel_CNPJ);

		lblNewLabel_DataNasc = new JLabel("Data De Nascimento");
		lblNewLabel_DataNasc.setBounds(10, 149, 108, 45);
		frame.getContentPane().add(lblNewLabel_DataNasc);

		//txtCEP = new JFormattedTextField((AbstractFormatter) null);
		txtCEP.setBounds(128, 66, 163, 20);
		frame.getContentPane().add(txtCEP);

		//txtTelefone = new JFormattedTextField((AbstractFormatter) null);
		txtTelefone.setBounds(128, 110, 163, 20);
		frame.getContentPane().add(txtTelefone);

		//txtDataNasc = new JFormattedTextField((AbstractFormatter) null);
		txtDataNasc.setBounds(128, 161, 163, 20);
		frame.getContentPane().add(txtDataNasc);

		//txtCNPJ = new JFormattedTextField((AbstractFormatter) null);
		txtCNPJ.setBounds(128, 217, 163, 20);
		frame.getContentPane().add(txtCNPJ);
		
		 MASC = new JRadioButton("MASCULINO");
		MASC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(MASC.isSelected()) {
					Femi.setSelected(false);
					Dani.setSelected(false);
					String sexo = "Masculino";
				}
			}
		});
		MASC.setBounds(10, 279, 109, 23);
		frame.getContentPane().add(MASC);
		
		Femi = new JRadioButton("FEMININO");
		Femi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Femi.isSelected()) {
					MASC.setSelected(false);
					Dani.setSelected(false);
						String sexo = "Feminino";
				}
			}
		});
		Femi.setBounds(120, 279, 109, 23);
		frame.getContentPane().add(Femi);
		
		Dani = new JRadioButton("DANILO");
		Dani.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Dani.isSelected()) {
					MASC.setSelected(false);
					Femi.setSelected(false);
						String sexo = "Não Binary";
				}
			}
		});
		Dani.setBounds(231, 279, 109, 23);
		frame.getContentPane().add(Dani);
	}
}
