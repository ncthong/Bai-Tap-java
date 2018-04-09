package hk2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Nhapsonguyen {

	private JFrame frmcSThnh;
	private JTextField txtNhap;
	private JTextField txtKetqua;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Nhapsonguyen window = new Nhapsonguyen();
					window.frmcSThnh.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Nhapsonguyen() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmcSThnh = new JFrame();
		frmcSThnh.setTitle("Đọc số thành chữ");
		frmcSThnh.setBackground(new Color(0, 0, 255));
		frmcSThnh.getContentPane().setBackground(new Color(65, 105, 225));
		frmcSThnh.setBounds(100, 100, 573, 355);
		frmcSThnh.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmcSThnh.getContentPane().setLayout(null);
		
		JLabel lblNhap = new JLabel("Nh\u1EADp v\u00E0o s\u1ED1 nguy\u00EAn N: ");
		lblNhap.setForeground(Color.WHITE);
		lblNhap.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNhap.setBounds(59, 21, 174, 26);
		frmcSThnh.getContentPane().add(lblNhap);
		
		txtNhap = new JTextField();
		txtNhap.setBounds(294, 26, 166, 20);
		frmcSThnh.getContentPane().add(txtNhap);
		txtNhap.setColumns(10);
		
		txtKetqua = 	new JTextField();
		txtKetqua.setFont(new Font("Tahoma", Font.PLAIN, 35));
		txtKetqua.setBounds(41, 99, 475, 195);
		frmcSThnh.getContentPane().add(txtKetqua);
		txtKetqua.setColumns(10);
		
		JLabel lblKtQuc = new JLabel("K\u1EBFt qu\u1EA3 \u0111\u1ECDc s\u1ED1:");
		lblKtQuc.setForeground(Color.WHITE);
		lblKtQuc.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblKtQuc.setBounds(59, 69, 162, 19);
		frmcSThnh.getContentPane().add(lblKtQuc);
		
		JButton btKetQua = new JButton("K\u1EBFt Qu\u1EA3");
		btKetQua.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int hdv = Integer.parseInt(txtNhap.getText());
				String dv ="";
				String chuc="";
				String tram="";
				int hangdv=(hdv%100)%10;
				int hangchuc=(hdv%100)/10;
				int hangtram=hdv/100;

				switch (hangdv) {
				case 1: dv = " một";
				break;
				case 2: dv = " hai";
				break;
				case 3: dv = " ba";
				break;
				case 4: dv = " bốn";
				break;
				case 5: dv = " năm";
				break;
				case 6: dv = " sáu";
				break;
				case 7: dv = " bảy";
				break;
				case 8: dv = " tám";
				break;
				case 9: dv = " chín";
				break;
				default: dv="";
					break;
				}
				
				switch (hangchuc) {
				case 1: chuc=" mười";					
					break;
				case 2: chuc=" hai mươi";					
				break;	
				case 3: chuc=" ba mươi";					
				break;
				case 4: chuc=" bốn mươi";					
				break;
				case 5: chuc=" năm mươi";					
				break;
				case 6: chuc=" sáu mươi";					
				break;
				case 7: chuc=" bảy mươi";					
				break;
				case 8: chuc=" tám mươi";					
				break;
				case 9: chuc=" chín mươi";				
				break;
				default: chuc="";
					break;
				}
				
				switch (hangtram) {
				case 1: tram="Một trăm";					
				break;
				case 2: tram="hai trăm";					
				break;	
				case 3: tram="ba trăm";					
				break;
				case 4: tram="bốn trăm";					
				break;
				case 5: tram="năm trăm";					
				break;
				case 6: tram="sáu trăm";					
				break;
				case 7: tram="bảy trăm";					
				break;
				case 8: tram="tám trăm";					
				break;
				case 9: tram="chín trăm";				
				break;
				default: tram="";
				break;
				}
				txtKetqua.setText(tram + chuc + dv);
			}
		});
		btKetQua.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btKetQua.setBounds(239, 62, 149, 26);
		frmcSThnh.getContentPane().add(btKetQua);
	}
}
