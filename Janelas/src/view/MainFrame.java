package view;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MainFrame extends JFrame {

	public MainFrame() {
		build();
	}

	private void build() {
		buildMenu();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(600, 400);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	private void buildMenu() {
		JMenuBar menuBar = new JMenuBar();
		buildFileMenu(menuBar);
		buildClientBar(menuBar);
		buildHelpBar(menuBar);
		setJMenuBar(menuBar);
	}

	private void buildHelpBar(JMenuBar menuBar) {
		JMenu helpMenu = new JMenu("Ajuda");
		menuBar.add(helpMenu);

		JMenuItem aboutMenuItem = new JMenuItem("Sobre");
		aboutMenuItem.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new AboutFrame(MainFrame.this);
			}
		});
		helpMenu.add(aboutMenuItem);		
	}

	private void buildClientBar(JMenuBar menuBar) {
		JMenu clienteMenu = new JMenu("Cliente");
		menuBar.add(clienteMenu);

		JMenuItem AdicionarClienteMenuItem = new JMenuItem("Adicionar");
		AdicionarClienteMenuItem.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new ClientFrame(MainFrame.this);
			}
		});
		clienteMenu.add(AdicionarClienteMenuItem);
	}

	private void buildFileMenu(JMenuBar menuBar) {
		JMenu fileMenu = new JMenu("Arquivo");
		menuBar.add(fileMenu);

		JMenuItem newFileMenuItem = new JMenuItem("Novo");
		fileMenu.add(newFileMenuItem);

		JMenuItem openFileMenuItem = new JMenuItem("Abrir");
		fileMenu.add(openFileMenuItem);
		
		JMenuItem saveFileMenuItem = new JMenuItem("Salvar");
		fileMenu.add(saveFileMenuItem);
		
		JMenuItem closeFileMenuItem = new JMenuItem("Fechar");
		fileMenu.add(closeFileMenuItem);
		
		JMenuItem exitMenuItem = new JMenuItem("Sair");
		exitMenuItem.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		fileMenu.add(exitMenuItem);	
	}
	
}
