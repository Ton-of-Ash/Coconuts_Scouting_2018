import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Image;

import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.util.Date;
import java.awt.event.ActionEvent;

public class Main_Panel extends JPanel {
	private JTextField RegionalFeild;
	private JTextField DateField;
	private JTextField LastNameField;
	private JTextField FirstNameField;
	GUI_Colors colors = new GUI_Colors();
	All_Panels panels = new All_Panels();
	User_Data userdata = new User_Data();
	/**
	 * Create the panel.
	 */
	public Main_Panel() {
		setBackground(colors.red);
		setLayout(null);
		
		JButton btnNewButton = new JButton("Logout");
		btnNewButton.setBounds(6, 399, 290, 70);
		add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New Entry");
		btnNewButton_1.setBounds(299, 399, 290, 70);
		add(btnNewButton_1);
		
		JLabel lblRegional = new JLabel("Regional:");
		lblRegional.setBounds(6, 371, 75, 16);
		add(lblRegional);
		
		JLabel lblDate = new JLabel("Date:");
		lblDate.setBounds(6, 343, 75, 16);
		add(lblDate);
		
		JLabel lblLastName = new JLabel("Last Name:");
		lblLastName.setBounds(6, 315, 75, 16);
		add(lblLastName);
		
		JLabel lblFirstName = new JLabel("First Name:");
		lblFirstName.setBounds(6, 287, 75, 16);
		add(lblFirstName);
		
		RegionalFeild = new JTextField();
		RegionalFeild.setEditable(false);
		RegionalFeild.setBounds(93, 366, 200, 26);
		add(RegionalFeild);
		RegionalFeild.setColumns(10);
		
		DateField = new JTextField();
		DateField.setEditable(false);
		DateField.setBounds(93, 338, 200, 26);
		add(DateField);
		DateField.setColumns(10);
		
		LastNameField = new JTextField();
		LastNameField.setEditable(false);
		LastNameField.setBounds(93, 310, 200, 26);
		add(LastNameField);
		LastNameField.setColumns(10);
		
		FirstNameField = new JTextField();
		FirstNameField.setEditable(false);
		FirstNameField.setBounds(93, 282, 200, 26);
		add(FirstNameField);
		FirstNameField.setColumns(10);
		
		JButton btnEditInfo = new JButton("Edit Info");
		btnEditInfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main_Frame.main_panel.removeAll();
				Main_Frame.main_panel.repaint();
				Main_Frame.main_panel.revalidate();
				
				
				Main_Frame.main_panel.add(panels.login);
				Main_Frame.main_panel.repaint();
				Main_Frame.main_panel.revalidate();
			}
		});
		btnEditInfo.setBounds(0, 246, 296, 29);
		add(btnEditInfo);
		
		JLabel icon = new JLabel("");
		icon.setBounds(299, 6, 290, 290);
		String path="./Resources/Coconuts.png";//./Resources
		
		ImageIcon myimage = new ImageIcon (path);
		Image img = myimage.getImage();
		Image newImg = img.getScaledInstance(icon.getWidth(), icon.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon image = new ImageIcon(newImg);
		icon.setIcon(image);
		add(icon);
		
		FirstNameField.setText(userdata.FirstName);
		System.out.println(userdata.LastName);
		LastNameField.setText(userdata.LastName);
		Date date = new Date();
		DateField.setText(Integer.toString(date.getDate()));
		RegionalFeild.setText(userdata.Regional);
		
	}
}