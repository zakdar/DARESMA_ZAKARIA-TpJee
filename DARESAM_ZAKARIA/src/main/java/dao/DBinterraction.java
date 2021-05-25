package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBinterraction {
	
	static Connection con=null;
	static Statement st = null;
	
	        /*---------------------constructeur--------------------------*/
	
	public DBinterraction() {
		
	}
          /*--------------------méthode de connection--------------------*/
	
	public static void connect(){
      try {
    	 Class.forName("com.mysql.cj.jdbc.Driver");
         con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/firsttable","root","");
         st=con.createStatement();
	  } 
      catch (ClassNotFoundException ex) {
    	  System.out.println("Error: unable to load driver class!");
	  } 
      catch (SQLException ex) {
    	  System.out.println("Error: Statement is null!"); 
      }  
	}
	        /*------------------méthode select-----------------*/
	
	public static ResultSet select(String sql) {
		ResultSet res =null;
		try {
			res = st.executeQuery(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return res;
	}
	             /*-------------Mis A Jour-------------*/
	
	public static void misajour(String sql) {
	    try {
			st.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		    }
		
		
	}
	          /*----------------méthode de déconnexion----------------*/
	public static void disconnect() {
		try {
			if(con != null)
				con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			if(st != null)
				st.close();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
}

