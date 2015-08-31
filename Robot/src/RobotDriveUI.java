import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Font;

import javax.swing.ImageIcon;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RobotDriveUI implements ActionListener {

	private JFrame frame;
	private JPanel mainPanel;
	private JPanel topPanel;
	private JPanel buttonPanel;
	private JButton agreesiveBtn;
	private JButton defensiveBtn;
	private JButton normalBtn;
	private JLabel titleLabel;
	private JLabel behaviourLabel;


	/**
	 * Create the application.
	 */
	public RobotDriveUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		int btnXsize = 105;
		int btnYsize = 50;

		frame = new JFrame();
		frame.setSize(700,550);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setTitle("CS356");

		mainPanel = new JPanel();
		mainPanel.setBackground(Color.DARK_GRAY);
		mainPanel.setBorder(new LineBorder(new Color(0, 0, 0), 10));

		frame.getContentPane().add(mainPanel);
		mainPanel.setLayout(new GridLayout(0, 2, 0, 0));


		topPanel = new JPanel(new FlowLayout());
		topPanel.setForeground(Color.CYAN);
		topPanel.setBackground(Color.DARK_GRAY);
		topPanel.setBorder(new LineBorder(Color.CYAN, 3));
		topPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		mainPanel.add(topPanel);

		titleLabel = new JLabel("Big Robot");
		titleLabel.setIcon(null);
		titleLabel.setFont(new Font("Silom", Font.BOLD, 22));
		titleLabel.setForeground(Color.CYAN);
		topPanel.add(titleLabel);

		JLabel label = new JLabel(new ImageIcon("animatedRobot.gif"), JLabel.CENTER);
		label.setBackground(Color.blue);
		topPanel.add(label);

		buttonPanel = new JPanel(new GridLayout(3,1));
		buttonPanel.setBackground(Color.DARK_GRAY);
		buttonPanel.setBorder(new LineBorder(Color.ORANGE, 10));

		agreesiveBtn = new JButton();
		agreesiveBtn.setBackground(Color.BLACK);
		agreesiveBtn.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		agreesiveBtn.setForeground(Color.RED);

		normalBtn = new JButton();
		normalBtn.setBackground(Color.BLACK);
		normalBtn.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		normalBtn.setForeground(Color.BLUE);

		agreesiveBtn.setSize(new Dimension(btnXsize, btnYsize));
		normalBtn.setSize(new Dimension(btnXsize, btnYsize));

		agreesiveBtn.setText("Agreesive");
		normalBtn.setText("Normal");
		buttonPanel.setLayout(new GridLayout(0, 1, 0, 0));

		behaviourLabel = new JLabel("Behaviour", JLabel.CENTER);
		behaviourLabel.setFont(new Font("Papyrus", Font.PLAIN, 15));
		behaviourLabel.setForeground(Color.CYAN);

		buttonPanel.add(behaviourLabel);
		defensiveBtn = new JButton();
		defensiveBtn.setBackground(Color.BLACK);
		defensiveBtn.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		defensiveBtn.setForeground(Color.MAGENTA);
		defensiveBtn.setSize(new Dimension(btnXsize, btnYsize));
		defensiveBtn.setText("Defensive");

		buttonPanel.add(agreesiveBtn);
		buttonPanel.add(defensiveBtn);
		buttonPanel.add(normalBtn);

		agreesiveBtn.addActionListener(this);
		defensiveBtn.addActionListener(this);
		normalBtn.addActionListener(this);

		mainPanel.add(buttonPanel);

	}

	/**
	 * Launch the application.
	 */
	public void RobotDrive(){
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RobotDriveUI window = new RobotDriveUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		String title = e.getActionCommand();
		Robot r1 = new Robot("Big Robot", frame);


		if(title.equals("Agreesive")){
			r1.setBehaviour(new AgressiveBehaviour(frame));

		}
		if(title.equals("Defensive")){
			r1.setBehaviour(new DefensiveBehaviour(frame));

		}
		if(title.equals("Normal")){

			r1.setBehaviour(new NormalBehaviour(frame));
		}
		r1.move();	

	}


}
