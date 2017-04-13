package sklep.common;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class WyswietlZBazy {
	
	public static void main(Connection c) throws IOException, SQLException {
		String sql = "SELECT * FROM public.produkty";
		try {
			Statement s = c.createStatement();
			ResultSet rs = s.executeQuery(sql);
			System.out.println("nazwa produktu, ilosc w magazynie, cena");
			do {
				rs.next();
				System.out.println(rs.getString("nazwa") + " " + rs.getString("ilosc")+ " " + rs.getString("cena"));
			} while (rs.getString("id") != null);
			} catch (Exception e ) {
			WyswietlMenu.main(c);
		}
	
	
	}
}