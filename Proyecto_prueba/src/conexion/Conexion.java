package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Conexion  {
	static{
		try {
		Class.forName("com.mysql.jdbc.Driver");
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}	 
	}
	
	public static void main(String[] args) throws SQLException{
		String url = "jdbc:mysql://localhost/";
		String bd = "proyectoz";
		Connection conn = null;
		conn = DriverManager.getConnection(url + bd +"?useSSL=false" , "root","C2rb2r4$");
		PreparedStatement ps = null;
		Statement s = conn.createStatement();
		ResultSet rs = s.executeQuery("select * from usuarios");
		while (rs.next()){
			System.out.println(rs.getString("usuario"+" "+"nombre"));
			
		}
		///////////////
		
		
	}

}
