package sklep.common;

import java.io.*;
import java.sql.Connection;
import java.sql.SQLException;

public class Logowanie {
	
	public static void main(String[] args) throws IOException, SQLException, ClassNotFoundException {
		String login, haslo;
		Connection conn;
		PobierzKomunikat.main(1);
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		login = in.readLine();
		PobierzKomunikat.main(2);	
		in = new BufferedReader(new InputStreamReader(System.in));
		haslo = in.readLine();
		conn = ZalogujDoBazy.main(login, haslo);
		PobierzKomunikat.main(3);
		WyswietlMenu.main(conn); 
		
	}

}
