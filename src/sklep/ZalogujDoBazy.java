package sklep;

import java.io.IOException;
import java.sql.*;

public class ZalogujDoBazy {
	public static Connection main(String login, String haslo) throws IOException, ClassNotFoundException, SQLException {
		/*
		 * chcialbym w tym miejscu zasygnalizowac
		 * ze lepszym rozwiazaniem mogloby byc uzycie puli polaczen
		 * jednak aplikacja ta ma na celu tylko prezentacje kodu, nie jest to wiec potrzebne
		 * skoro obslugiwac ma tylko pojedyncze polaczenie
		 */
		Connection c = null;
		try {
			 Class.forName("org.postgresql.Driver");
	         c = DriverManager
	            .getConnection("jdbc:postgresql://localhost:5432/sklep",
	            login, haslo);
	      } catch (Exception e) {
	    	  System.out.println("Niewlasciwy login lub haslo");
	    	  Logowanie.main(null);
	      }
	      return c;
	}
}
