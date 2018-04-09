package hk2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Bai1 {

	private JFrame frame;
	private JTextField txtA;
	private JTextField txtB;
	private JTextField txtMax;
	private JTextField txtMin;
	private JTextField txtC;
	private JTextField txtD;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bai1 window = new Bai1();
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
	public Bai1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNhap = new JLabel("S\u1ED1 nh\u1EADp v\u00E0o:");
		lblNhap.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNhap.setBounds(23, 22, 106, 19);
		frame.getContentPane().add(lblNhap);
		
		JLabel lblKetqua = new JLabel("K\u1EBFt Qu\u1EA3:");
		lblKetqua.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblKetqua.setBounds(23, 166, 106, 19);
		frame.getContentPane().add(lblKetqua);
		
		txtA = new JTextField();
		txtA.setBounds(33, 52, 86, 20);
		frame.getContentPane().add(txtA);
		txtA.setColumns(10);
		
		txtB = new JTextField();
		txtB.setBounds(142, 52, 86, 20);
		frame.getContentPane().add(txtB);
		txtB.setColumns(10);
		
		JLabel lblMax = new JLabel("S\u1ED1 l\u1EDBn nh\u1EA5t:");
		lblMax.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblMax.setBounds(33, 212, 71, 14);
		frame.getContentPane().add(lblMax);
		
		txtMax = new JTextField();
		txtMax.setBounds(102, 210, 86, 20);
		frame.getContentPane().add(txtMax);
		txtMax.setColumns(10);
		
		JLabel lblMin = new JLabel("S\u1ED1 nh\u1ECF nh\u1EA5t:");
		lblMin.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblMin.setBounds(218, 212, 86, 14);
		frame.getContentPane().add(lblMin);
		
		txtMin = new JTextField();
		txtMin.setBounds(301, 210, 98, 20);
		frame.getContentPane().add(txtMin);
		txtMin.setColumns(10);
		
		JButton btTim = new JButton("T\u00ECm");
		btTim.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a = Integer.parseInt(txtA.getText());
				int b = Integer.parseInt(txtB.getText());
				int c = Integer.parseInt(txtC.getText());
				int d = Integer.parseInt(txtD.getText());
				int max = a;
				if(max <b) max = b;
				if(max < c) max = c;
				if(max < d) max = d;
				int min = a;
				if(min > b) min = b;
				if(min > c) min = c;
				if(min > d) min = d;
				txtMax.setText(max +"");
				txtMin.setText(min +"");
			}
		});
		btTim.setForeground(new Color(255, 255, 255));
		btTim.setBackground(new Color(51, 102, 153));
		btTim.setBounds(142, 107, 123, 31);
		frame.getContentPane().add(btTim);
		
		txtC = new JTextField();
		txtC.setBounds(239, 52, 86, 20);
		frame.getContentPane().add(txtC);
		txtC.setColumns(10);
		
		txtD = new JTextField();
		txtD.setColumns(10);
		txtD.setBounds(338, 52, 86, 20);
		frame.getContentPane().add(txtD);
	}
}
