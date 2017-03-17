package view;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class AboutFrame extends JDialog {
	
	public AboutFrame(JFrame motherFrame) {
		build(motherFrame);
	}         

	private void build(JFrame motherFrame) {
		addComponents();
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setSize(300, 200);
		setLocationRelativeTo(motherFrame);
		setVisible(true);
	}

	private void addComponents() {
		String msg = "Desenvolvido na Graduação em Análise "
					+ "e Desenvolvimento de Sistemas";
		JTextArea textArea= new JTextArea(msg);
		textArea.setLineWrap(true);
		textArea.setEditable(false);
		add(textArea);
	}
}
