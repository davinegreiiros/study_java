package application;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


import db.DB;

public class Program {

	public static void main(String[] args) {
		
		
		Connection conn  = null;
		Statement st = null;
		ResultSet rs = null;
		try {
			conn = DB.getConnection(); //conex�o com banco de dados
			
			st = conn.createStatement();
		
			rs = st.executeQuery("SELECT * FROM department");
			
			while(rs.next()) {
				System.out.println(rs.getInt("Id") + "," + rs.getString("Name"));
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		finally {
			DB.closeResultSet(rs);
			DB.closeStatement(st);
			DB.closeConnection();
		}
		

	}

}
