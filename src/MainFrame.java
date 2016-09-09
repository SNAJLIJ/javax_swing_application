import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class MainFrame extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private DetailsPanel detailsPanel;

	public MainFrame(String title) {
		super(title);
		
		// Step 1 - Set the layout manager
		setLayout(new BorderLayout());
		
		// Step 2 - Create the swing components
		JTextArea textArea = new JTextArea();
		JButton button = new JButton("Click me");
		
		detailsPanel = new DetailsPanel();
		
		// Step 3 - Add Swing components to content panel.
		Container c = getContentPane();
		c.add(textArea, BorderLayout.CENTER);
		c.add(button, BorderLayout.SOUTH);
		c.add(detailsPanel, BorderLayout.WEST);
		
		
		// Add behaviour to the components.
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				textArea.append("Hello\n");
			}
		});
		
	}
	
	
}