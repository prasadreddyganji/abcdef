package ilp1.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import ilp1.bean.User;

public class UserDAO {
	Connection con;
	public UserDAO() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookstore_ilp","root","DRx5N951");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Connection not Extablished");
			e.printStackTrace();
		}
	}
	public boolean validate(User u) {
		try {
			PreparedStatement pstmt = con.prepareStatement("select * from Users where Email = ? and Password = ?");
			pstmt.setString(1, u.getUsername());
			pstmt.setString(2, u.getPassword());
			ResultSet rs = pstmt.executeQuery();
			if(rs.next())
				return true;
			return false;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			
			e.printStackTrace();
			return false;
		}
		
	}
	public boolean addUser(User u) {
		PreparedStatement pst;
		int res = 0;
		try {
			if(validate(u)) {
				return false;
			}
			else {
				pst = con.prepareStatement("insert into Users values(?,?)");
				pst.setString(1, u.getUsername());
				pst.setString(2, u.getPassword());
				res = pst.executeUpdate();
			}
		}
		catch(SQLException ex) {
			ex.printStackTrace();
			return false;
		}
		return (res==1)?true:false;
	}
	
	public boolean resetUser(User u) {
		try {
			PreparedStatement pstmt = con.prepareStatement("select * from Users where Email = ?");
			pstmt.setString(1, u.getUsername());
			ResultSet rs = pstmt.executeQuery();
			if(rs.next())
				return true;
			return false;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			
			e.printStackTrace();
			return false;
		}
		
	}
}
