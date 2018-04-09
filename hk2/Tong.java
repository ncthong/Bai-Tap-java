package hk2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Tong {

	private JFrame frame;
	private JTextField txtNhap;
	private JTextField txtTong;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tong window = new Tong();
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
	public Tong() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 349, 182);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNhapN = new JLabel("Nh\u1EADp N:");
		lblNhapN.setBounds(24, 26, 77, 21);
		frame.getContentPane().add(lblNhapN);
		
		JLabel lblTong = new JLabel("T\u1ED5ng");
		lblTong.setBounds(24, 58, 77, 21);
		frame.getContentPane().add(lblTong);
		
		txtNhap = new JTextField();
		txtNhap.setBounds(143, 26, 123, 20);
		frame.getContentPane().add(txtNhap);
		txtNhap.setColumns(10);
		
		txtTong = new JTextField();
		txtTong.setBounds(143, 58, 123, 20);
		frame.getContentPane().add(txtTong);
		txtTong.setColumns(10);
		
		JButton btTong = new JButton("T\u1ED5ng");
		btTong.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String text = txtTong.getText();
				int n = Integer.parseInt(text);
				long s=0;
				for(int i =1;i<=n;i++){
					s =s +i;
				}
				txtTong.setText(text);
				
			}
		});
		btTong.setBounds(48, 109, 89, 23);
		frame.getContentPane().add(btTong);
		
		JButton btThoat = new JButton("Tho\u00E1t");
		btThoat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					clone();
				} catch (CloneNotSupportedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btThoat.setBounds(171, 109, 95, 23);
		frame.getContentPane().add(btThoat);
	}
}
