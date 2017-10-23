package sklep.common;

import java.io.IOException;
import java.sql.*;

import javax.swing.JOptionPane;

public class ZalogujDoBazy {
	public static Connection main(String login, String haslo) throws IOException, ClassNotFoundException, SQLException {
		Connection c = null;
		try {
			 Class.forName("org.postgresql.Driver");
	         c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/sklep", login, haslo);
	      } catch (Exception e) {
	    	  
	    	  }
	      return c;
	}
}
