package gui;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import com.mysql.jdbc.PreparedStatement;

public class Login extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JFrame frame;
	JLabel lblUser;
	
	
	JTextField tfUser;
	JLabel lblPassword;
	JPasswordField jpPassword;
	JButton btDangKy;
	JButton btDangNhap;
	// Tao doi tuong de ket noi voi csdl	
	Connection conn;
	// Tao doi tuong lop statement de thuc hien cac cau lenh789
	java.sql.Statement st;
	// Ham ket noi sql Server
	public void KetNoidb() {
		try{
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/qlcf", "root", "");
		}
		catch(Exception ex){
			System.out.println(ex.getMessage());
		}
	}
	public Login() {
		setTitle("Login");
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 102));	
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		lblUser = new JLabel("Tên Đăng Nhập: ");
		lblUser.setHorizontalAlignment(JLabel.RIGHT);
		
		tfUser = new JTextField();
		tfUser.setColumns(15);
		
		lblPassword = new JLabel("Mật Khẩu: ");
		lblPassword.setHorizontalAlignment(JLabel.LEFT);
		
		jpPassword = new JPasswordField();
		jpPassword.setColumns(15);
		
		
		
		btDangKy = new JButton("Đăng ký");
		btDangKy.addActionListener(new ActionListener() {
			private Statement st;			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				// Thong bao neu User con trong
				if(tfUser.getText().equals("")){
					JOptionPane.showMessageDialog(null, "Vui lòng điền Tên đăng nhập");
					return;
				}
				// Thong bao neu Password con trong
				else if(jpPassword.getText().equals("")){
					JOptionPane.showMessageDialog(null, "Vui lòng điền mật khẩu");
					return;
				}
				try{
					KetNoidb();
					st = conn.createStatement();
					System.setProperty("file.encoding","UTF-8");
					int i = st.executeUpdate("Insert into login(User, Password) values ('"+tfUser.getText()+"','"+jpPassword.getText()+"')");
					if(i>0) JOptionPane.showConfirmDialog(null,"Xác nhận đăng kí","Question",JOptionPane.YES_NO_OPTION);
					
					conn.close();
				}
				catch(Exception ex){
					System.out.println(ex.getMessage());
				}
				JOptionPane.showMessageDialog(null, "Đăng ký thành công");				
			}
		});
		btDangNhap = new JButton("Đăng Nhập");
		btDangNhap.addActionListener(new ActionListener() {
			
		
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				// Thong bao neu User con trong
				if(tfUser.getText().equals("")){
					JOptionPane.showMessageDialog(null, "Vui lòng điền Tên đăng nhập");	
					return;
				}
				// Thong bao neu Password con trong
				else if(jpPassword.getText().equals("")){
					JOptionPane.showMessageDialog(null, "Vui lòng điền mật khẩu");
					return;
				}
				else{
						try {
							KetNoidb();
							st = conn.createStatement();
							String sql = "select * from login\n" + "where User=? and Password=?";
							PreparedStatement ps = (PreparedStatement) conn.prepareStatement(sql);
							ps.setString(1, tfUser.getText());
							ps.setString(2, jpPassword.getText());
							ResultSet rs = ps.executeQuery();
							
							if(rs.next()){
								JOptionPane.showMessageDialog(null, "Đăng nhập thành công!");
								ttdrink2 obj = new ttdrink2();
								obj.setVisible(true);
								obj.setSize(550, 600);
							}
							else{
								JOptionPane.showMessageDialog(null, "Mật khẩu hoặc tài khoản không đúng, đăng nhập thất bại!");
								return;
							}
						} catch (Exception ex) {
							// TODO: handle exception
							System.out.println(ex);
						}
				}
			}
		});
		Container cont = this.getContentPane();
		// Sap xep cac control tu trai qua phai
		setLayout(new FlowLayout());
		cont.add(lblUser);
		cont.add(tfUser);
		cont.add(lblPassword);
		cont.add(jpPassword);
		cont.add(btDangKy);
		cont.add(btDangNhap);
		this.setSize(300, 200);
		this.setLocation(100, 50);
		pack();
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Login obj = new Login();
		obj.setSize(320, 350);
		obj.setVisible(true);
	}
}