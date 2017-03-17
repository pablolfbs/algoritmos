package view;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import util.GBC;

public class ClientFrame extends JDialog {
	
	public ClientFrame(MainFrame motherFrame) {
		build(motherFrame);
	}

	private void build(MainFrame motherFrame) {
		setLayout(new GridBagLayout());
		addComponents();
		pack();
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLocationRelativeTo(motherFrame);
		setVisible(true);
	}
	
	private void addComponents() {
		JLabel nameLabel = new JLabel("Nome:");
		add(nameLabel, new GBC(0,0).left().insets(10,10,0,0));
		JTextField nameField = new JTextField(20);
		add(nameField, new GBC(1,0).insets(10,10,0,10));
		
		JLabel cpfLabel = new JLabel("CPF:");
		add(cpfLabel, new GBC(0,1).left().insets(10,10,0,0));
		JTextField cpfField = new JTextField(20);
		add(cpfField, new GBC(1,1).insets(10,10,0,10));
		
		JLabel birthdayLabel = new JLabel("Nascimento:");
		add(birthdayLabel, new GBC(0,2).left().insets(10,10,0,0));
		JTextField birthdayField = new JTextField(20);
		add(birthdayField, new GBC(1,2).insets(10,10,0,10));
		
		JLabel adressLabel = new JLabel("Endereço:");
		add(adressLabel, new GBC(0,3).left().insets(10,10,0,0));
		JTextField adressField = new JTextField(20);
		add(adressField, new GBC(1,3).insets(10,10,0,10));
		
		JButton addButton = new JButton("Cadastrar");
		add(addButton, new GBC(1,4).right().insets(10,0,10,10));
		addButton.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				// Adiciona o cliente no banco de dados
				JOptionPane.showMessageDialog(ClientFrame.this, "Cliente cadastrado com sucesso");
				ClientFrame.this.dispose();
			}
		});
	}
}
