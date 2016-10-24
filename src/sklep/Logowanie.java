package sklep;

import java.io.*;
import java.sql.Connection;
import java.sql.SQLException;

public class Logowanie {
	
	public static void main(String[] args) throws IOException, SQLException, ClassNotFoundException {
		String login, haslo;
		Connection conn;
		System.out.println("Podaj login:");
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		login = in.readLine();
		System.out.println("Podaj haslo:");	
		in = new BufferedReader(new InputStreamReader(System.in));
		haslo = in.readLine();
		conn = ZalogujDoBazy.main(login, haslo);
		System.out.println("Logowanie pomyslne!");	
		WyswietlMenu.main(conn);
		
	}

}
