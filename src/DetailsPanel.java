import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class DetailsPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public DetailsPanel() {
		super();
		Dimension size = getPreferredSize();
		size.width = 250;
		setPreferredSize(size);

		setBorder(BorderFactory.createTitledBorder("Personal Details"));

		JLabel nameLabel = new JLabel("Name: ");
		JLabel occupationLabel = new JLabel("Occupation: ");

		final JTextField nameField = new JTextField(10);
		final JTextField occupationField = new JTextField(10);

		JButton addBtn = new JButton("ADD");
		addBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String name = nameField.getText();
				String occupation = occupationField.getText();

				String text = name + "  " + occupation;

				System.out.println(text + " -----------");
			}
		});

		setLayout(new GridBagLayout());

		GridBagConstraints gc = new GridBagConstraints();

		// Recommendation when creating stuff manually
		// Classify the controls into logical sections in your mind
		// and put big comments in each section in the code.

		// First column
		gc.anchor = GridBagConstraints.LINE_END;
		gc.weighty = 0.5;
		gc.weightx = 0.5;

		gc.gridx = 0;
		gc.gridy = 0;
		add(nameLabel, gc);

		gc.gridx = 0;
		gc.gridy = 1;
		add(occupationLabel, gc);

		// Second column
		gc.anchor = GridBagConstraints.LINE_START;
		gc.gridx = 1;
		gc.gridy = 0;
		add(nameField, gc);

		gc.gridx = 1;
		gc.gridy = 1;
		add(occupationField, gc);

		// Final row
		gc.weighty = 10;
		gc.anchor = GridBagConstraints.FIRST_LINE_START;
		gc.gridx = 1;
		gc.gridy = 2;
		add(addBtn, gc);

	}
	
	public void addDetailsListener(DetailListener listener){
		
	}
	
	public void removeDetailsListener(DetailListener listener){
		
	}


}
