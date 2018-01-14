import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import java.awt.Font;

public class Entry_Page extends JPanel {
	All_Panels panels = new All_Panels();
	GUI_Colors colors = new GUI_Colors();
	public static JTextField Auto_switch;
	public static JTextField Auto_leaver;
	public static JTextField Auto_comments;
	public static JTextField Teleop_switch;
	public static JTextField Teleop_leaver;
	public static JTextField Teleop_vault;
	public static JTextField Teleop_comments;
	public static JRadioButton rdbtnCrossedLine;
	public static JRadioButton rdbtnClimbed;
	public static JRadioButton rdbtnYellowFlag;
	public static JRadioButton rdbtnRedFlag;
	public static JRadioButton rdbtnMechanum;
	public static JRadioButton rdbtnWestCoast;
	public static JRadioButton rdbtnSwerve;
	public static JTextField teamNumber;
	public static JTextField roundNumber;
	/**
	 * Create the panel.
	 */
	public Entry_Page() {
		setBackground(colors.yellow);
		setLayout(null);
		
		JPanel Auto = new JPanel();
		Auto.setBackground(Color.BLUE);
		Auto.setBounds(0, 0, 295, 370);
		Auto.setBackground(colors.red);
		add(Auto);
		Auto.setLayout(null);
		
		JLabel lblAuto = new JLabel("Auto");
		lblAuto.setHorizontalAlignment(SwingConstants.CENTER);
		lblAuto.setBounds(0, 5, 295, 16);
		Auto.add(lblAuto);
		
		JLabel lblBlocksInSwitch = new JLabel("Blocks in Switch:");
		lblBlocksInSwitch.setBounds(20, 125, 106, 16);
		Auto.add(lblBlocksInSwitch);
		
		JButton Auto_switchAdd = new JButton("+");
		Auto_switchAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int x = Integer.parseInt(Auto_switch.getText())+1;
				Auto_switch.setText(Integer.toString(x));
			}
		});
		Auto_switchAdd.setBounds(20, 153, 30, 30);
		Auto.add(Auto_switchAdd);
		
		JButton Auto_switchSubtract = new JButton("-");
		Auto_switchSubtract.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int x = Integer.parseInt(Auto_switch.getText());
				int y = Integer.parseInt(Auto_switch.getText())-1;
				if(!(x==0)) {
					Auto_switch.setText(Integer.toString(y));
				}
			}
		});
		Auto_switchSubtract.setBounds(96, 153, 30, 30);
		Auto.add(Auto_switchSubtract);
		
		Auto_switch = new JTextField();
		Auto_switch.setEditable(false);
		Auto_switch.setBounds(138, 154, 130, 26);
		Auto.add(Auto_switch);
		Auto_switch.setColumns(10);
		
		JLabel lblBlocksInLeaver = new JLabel("Blocks in Leaver:");
		lblBlocksInLeaver.setBounds(20, 195, 106, 16);
		Auto.add(lblBlocksInLeaver);
		
		JButton Auto_leaverAdd = new JButton("+");
		Auto_leaverAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int x = Integer.parseInt(Auto_leaver.getText())+1;
				Auto_leaver.setText(Integer.toString(x));
			}
		});
		Auto_leaverAdd.setBounds(20, 223, 30, 30);
		Auto.add(Auto_leaverAdd);
		
		JButton Auto_leaverSubtract = new JButton("-");
		Auto_leaverSubtract.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int x = Integer.parseInt(Auto_leaver.getText());
				int y = Integer.parseInt(Auto_leaver.getText())-1;
				if(!(x==0)) {
					Auto_leaver.setText(Integer.toString(y));
				}
			}
		});
		Auto_leaverSubtract.setBounds(96, 223, 30, 30);
		Auto.add(Auto_leaverSubtract);
		
		Auto_leaver = new JTextField();
		Auto_leaver.setEditable(false);
		Auto_leaver.setBounds(138, 224, 130, 26);
		Auto.add(Auto_leaver);
		Auto_leaver.setColumns(10);
		
		rdbtnCrossedLine = new JRadioButton("Crossed Line");
		rdbtnCrossedLine.setBounds(20, 265, 269, 23);
		Auto.add(rdbtnCrossedLine);
		
		Auto_comments = new JTextField();
		Auto_comments.setBounds(5, 338, 285, 26);
		Auto.add(Auto_comments);
		Auto_comments.setColumns(10);
		
		JLabel lblComments = new JLabel("Comments:");
		lblComments.setBounds(20, 320, 120, 16);
		Auto.add(lblComments);
		
		JLabel lblRound = new JLabel("Round #:");
		lblRound.setBounds(10, 70, 100, 30);
		Auto.add(lblRound);
		lblRound.setForeground(Color.YELLOW);
		lblRound.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		
		JLabel lblTeam = new JLabel("Team #:");
		lblTeam.setBounds(10, 28, 100, 30);
		Auto.add(lblTeam);
		lblTeam.setForeground(Color.YELLOW);
		lblTeam.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		
		teamNumber = new JTextField();
		teamNumber.setBounds(138, 28, 130, 26);
		Auto.add(teamNumber);
		teamNumber.setColumns(10);
		
		roundNumber = new JTextField();
		roundNumber.setBounds(138, 75, 130, 26);
		Auto.add(roundNumber);
		roundNumber.setColumns(10);
		
		JPanel Teleop = new JPanel();
		Teleop.setBorder(null);
		Teleop.setBounds(300, 0, 295, 370);
		Teleop.setBackground(colors.red);
		add(Teleop);
		Teleop.setLayout(null);
		
		JLabel lblTeleop = new JLabel("Teleop");
		lblTeleop.setHorizontalAlignment(SwingConstants.CENTER);
		lblTeleop.setBounds(0, 5, 295, 16);
		Teleop.add(lblTeleop);
		
		JLabel lblBlocksInSwitch_1 = new JLabel("Blocks in Switch:");
		lblBlocksInSwitch_1.setBounds(20, 28, 106, 16);
		Teleop.add(lblBlocksInSwitch_1);
		
		JButton Teleop_switchAdd = new JButton("+");
		Teleop_switchAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int x = Integer.parseInt(Teleop_switch.getText())+1;
				Teleop_switch.setText(Integer.toString(x));
			}
		});
		Teleop_switchAdd.setBounds(20, 56, 30, 30);
		Teleop.add(Teleop_switchAdd);
		
		JButton Teleop_switchSubtract = new JButton("-");
		Teleop_switchSubtract.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int x = Integer.parseInt(Teleop_switch.getText());
				int y = Integer.parseInt(Teleop_switch.getText())-1;
				if(!(x==0)) {
					Teleop_switch.setText(Integer.toString(y));
				}
			}
		});
		Teleop_switchSubtract.setBounds(96, 56, 30, 30);
		Teleop.add(Teleop_switchSubtract);
		
		Teleop_switch = new JTextField();
		Teleop_switch.setEditable(false);
		Teleop_switch.setBounds(138, 57, 130, 26);
		Teleop.add(Teleop_switch);
		Teleop_switch.setColumns(10);
		
		JLabel lblBlocksInLeaver_1 = new JLabel("Blocks in Leaver:");
		lblBlocksInLeaver_1.setBounds(20, 98, 106, 16);
		Teleop.add(lblBlocksInLeaver_1);
		
		JButton Teleop_leaverAdd = new JButton("+");
		Teleop_leaverAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int x = Integer.parseInt(Teleop_leaver.getText())+1;
				Teleop_leaver.setText(Integer.toString(x));
			}
		});
		Teleop_leaverAdd.setBounds(20, 126, 30, 30);
		Teleop.add(Teleop_leaverAdd);
		
		JButton Teleop_leaverSubtract = new JButton("-");
		Teleop_leaverSubtract.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int x = Integer.parseInt(Teleop_leaver.getText());
				int y = Integer.parseInt(Teleop_leaver.getText())-1;
				if(!(x==0)) {
					Teleop_leaver.setText(Integer.toString(y));
				}
			}
		});
		Teleop_leaverSubtract.setBounds(96, 126, 30, 30);
		Teleop.add(Teleop_leaverSubtract);
		
		Teleop_leaver = new JTextField();
		Teleop_leaver.setEditable(false);
		Teleop_leaver.setBounds(138, 127, 130, 26);
		Teleop.add(Teleop_leaver);
		Teleop_leaver.setColumns(10);
		
		JLabel lblBlocksInVault = new JLabel("Blocks in Vault:");
		lblBlocksInVault.setBounds(20, 168, 106, 16);
		Teleop.add(lblBlocksInVault);
		
		JButton Teleop_vaultAdd = new JButton("+");
		Teleop_vaultAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int x = Integer.parseInt(Teleop_vault.getText())+1;
				Teleop_vault.setText(Integer.toString(x));
			}
		});
		Teleop_vaultAdd.setBounds(20, 196, 30, 30);
		Teleop.add(Teleop_vaultAdd);
		
		JButton Teleop_vaultSubtract = new JButton("-");
		Teleop_vaultSubtract.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int x = Integer.parseInt(Teleop_vault.getText());
				int y = Integer.parseInt(Teleop_vault.getText())-1;
				if(!(x==0)) {
					Teleop_vault.setText(Integer.toString(y));
				}
			}
		});
		Teleop_vaultSubtract.setBounds(96, 196, 30, 30);
		Teleop.add(Teleop_vaultSubtract);
		
		Teleop_vault = new JTextField();
		Teleop_vault.setBounds(138, 197, 130, 26);
		Teleop.add(Teleop_vault);
		Teleop_vault.setColumns(10);
		
		rdbtnClimbed = new JRadioButton("Climbed");
		rdbtnClimbed.setBounds(20, 238, 269, 23);
		Teleop.add(rdbtnClimbed);
		
		Teleop_comments = new JTextField();
		Teleop_comments.setBounds(5, 338, 285, 26);
		Teleop.add(Teleop_comments);
		Teleop_comments.setColumns(10);
		
		JLabel lblComments_1 = new JLabel("Comments:");
		lblComments_1.setBounds(20, 320, 120, 16);
		Teleop.add(lblComments_1);
		
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Entry_Page_Setup EPS = new Entry_Page_Setup();
				EPS.EnterData();
			}
		});
		btnSave.setBounds(172, 279, 117, 29);
		Teleop.add(btnSave);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main_Frame.main_panel.removeAll();
				Main_Frame.main_panel.repaint();
				Main_Frame.main_panel.revalidate();
				
				
				Main_Frame.main_panel.add(panels.ynEntry);
				Main_Frame.main_panel.repaint();
				Main_Frame.main_panel.revalidate();
				
			}
		});
		btnCancel.setBounds(20, 279, 117, 29);
		Teleop.add(btnCancel);
		
		JPanel General = new JPanel();
		General.setBorder(null);
		General.setBounds(0, 375, 595, 95);
		General.setBackground(colors.red);
		add(General);
		General.setLayout(null);
		
		JLabel lblOther = new JLabel("Flags:");
		lblOther.setBounds(5, 5, 61, 16);
		General.add(lblOther);
		
		rdbtnRedFlag = new JRadioButton("Red Flag");
		rdbtnRedFlag.setBounds(6, 66, 103, 23);
		General.add(rdbtnRedFlag);
		
		rdbtnYellowFlag = new JRadioButton("Yellow Flag");
		rdbtnYellowFlag.setBounds(6, 31, 103, 23);
		General.add(rdbtnYellowFlag);
		
		JLabel lblDrivetrain = new JLabel("Drivetrain:");
		lblDrivetrain.setBounds(295, 5, 75, 16);
		General.add(lblDrivetrain);
		
		rdbtnMechanum = new JRadioButton("Mechanum");
		rdbtnMechanum.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdbtnMechanum.setSelected(true);
				rdbtnWestCoast.setSelected(false);
				rdbtnSwerve.setSelected(false);
				
			}
		});
		rdbtnMechanum.setBounds(382, 5, 141, 23);
		General.add(rdbtnMechanum);
		
		rdbtnWestCoast = new JRadioButton("West Coast");
		rdbtnWestCoast.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdbtnMechanum.setSelected(false);
				rdbtnWestCoast.setSelected(true);
				rdbtnSwerve.setSelected(false);
			}
		});
		rdbtnWestCoast.setBounds(382, 35, 141, 23);
		General.add(rdbtnWestCoast);
		
		rdbtnSwerve = new JRadioButton("Swerve");
		rdbtnSwerve.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdbtnMechanum.setSelected(false);
				rdbtnWestCoast.setSelected(false);
				rdbtnSwerve.setSelected(true);
			}
		});
		rdbtnSwerve.setBounds(382, 66, 141, 23);
		General.add(rdbtnSwerve);

	}
}