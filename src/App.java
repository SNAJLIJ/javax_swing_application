import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class App {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
			
				JFrame frame = new MainFrame("Hello World SWING");

				frame.setSize(500, 400);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setVisible(true);
		   }
		});
		
		for(int i=0; i<10; i++){
			System.out.println("Roger FEDERER");
		}
		
	}
}