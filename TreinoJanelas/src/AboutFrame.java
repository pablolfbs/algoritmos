import javax.swing.JDialog;
import javax.swing.JFrame;

public class AboutFrame extends JDialog {
	
	public AboutFrame(JFrame motherFrame) {
		build(motherFrame);
	}

	private void build(JFrame motherFrame) {
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setSize(300, 200);
		setLocationRelativeTo(motherFrame);
		setVisible(true);		
	}
}
