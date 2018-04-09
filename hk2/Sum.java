package hk2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;

public class Sum {

	private JFrame frame;
	private JTextField tf1;
	private JTextField tf2;
	private JTextField tf3;
	private JTextField tf4;
	private JTextField tfKQ;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sum window = new Sum();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Sum() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 459, 391);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		tf1 = new JTextField();
		tf1.setBounds(46, 33, 66, 20);
		frame.getContentPane().add(tf1);
		tf1.setColumns(10);
		
		tf2 = new JTextField();
		tf2.setColumns(10);
		tf2.setBounds(137, 33, 66, 20);
		frame.getContentPane().add(tf2);
		
		tf3 = new JTextField();
		tf3.setColumns(10);
		tf3.setBounds(213, 33, 66, 20);
		frame.getContentPane().add(tf3);
		
		tf4 = new JTextField();
		tf4.setColumns(10);
		tf4.setBounds(308, 33, 66, 20);
		frame.getContentPane().add(tf4);
		
		JButton btnNewButton = new JButton("Tính Tổng");
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\User\\Pictures\\APP\\images.png"));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBackground(new Color(255, 51, 0));
		btnNewButton.setForeground(new Color(255, 255, 224));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int a=Integer.parseInt(tf1.getText());
				int b=Integer.parseInt(tf2.getText());
				int c=Integer.parseInt(tf3.getText());
				int d=Integer.parseInt(tf4.getText());
				
				int sum = a+b+c+d;	
				tfKQ.setText(sum +"");
			}
		});
		btnNewButton.setBounds(147, 86, 154, 154);
		frame.getContentPane().add(btnNewButton);
		
		tfKQ = new JTextField();
		tfKQ.setBounds(158, 276, 121, 20);
		frame.getContentPane().add(tfKQ);
		tfKQ.setColumns(10);
	}
}
