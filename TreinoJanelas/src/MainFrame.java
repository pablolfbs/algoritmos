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
		buildEditMenu(menuBar);
		buildHelpMenu(menuBar);
		setJMenuBar(menuBar);
	}

	private void buildHelpMenu(JMenuBar menuBar) {
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
		
		JMenuItem exitMenuItem = new JMenuItem("Sair");
		exitMenuItem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);		
			}
		});
		helpMenu.add(exitMenuItem);
	}

	private void buildEditMenu(JMenuBar menuBar) {
		JMenu editMenu = new JMenu("Editar");
		menuBar.add(editMenu);
	}

	private void buildFileMenu(JMenuBar menuBar) {
		JMenu fileMenu = new JMenu("Arquivo");
		menuBar.add(fileMenu);
	}
	
}
