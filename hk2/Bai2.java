package hk2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JEditorPane;

public class Bai2 {

	private JFrame frame;
	int count;
	String MangS;
	Integer[] MangInt;
	String[] MangChuoi;
	private JTextField tfNhap;
	private JTextField tfKetqua;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bai2 window = new Bai2();
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
	public Bai2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(51, 102, 153));
		frame.getContentPane().setLayout(null);
		
		tfNhap = new JTextField();
		tfNhap.setBounds(167, 23, 228, 28);
		frame.getContentPane().add(tfNhap);
		tfNhap.setColumns(10);
		
		tfKetqua = new JTextField();
		tfKetqua.setBounds(167, 72, 228, 28);
		frame.getContentPane().add(tfKetqua);
		tfKetqua.setColumns(10);
		
		JButton btSoMin = new JButton("S\u1ED1 Nh\u1ECF nh\u1EA5t");
		btSoMin.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btSoMin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btSoMin.setBounds(83, 153, 142, 35);
		frame.getContentPane().add(btSoMin);
		
		JButton btSoXephang = new JButton("S\u1ED1 x\u1EBFp h\u1EA1ng nh\u1ECF nh\u1EA5t");
		btSoXephang.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btSoXephang.setBounds(261, 153, 183, 35);
		frame.getContentPane().add(btSoXephang);
		frame.setBackground(new Color(51, 102, 153));
		frame.setBounds(100, 100, 533, 349);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
