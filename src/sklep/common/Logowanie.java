package sklep.common;

import java.io.*;
import java.sql.Connection;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class Logowanie {
	
	public static void main(String login, String haslo) throws IOException, SQLException, ClassNotFoundException {
		Connection conn;
		conn = ZalogujDoBazy.main(login, haslo);
		if (conn == null)
		{
			JOptionPane.showMessageDialog(null, "Niewlasciwy login lub haslo!");
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Logowanie pomyslne!");
			WyswietlMenu.main(conn); 
		}
	}

}
