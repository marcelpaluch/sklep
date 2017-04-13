package sklep;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class WyswietlZBazy {
	
	public static void main(Connection c) throws IOException {
		String sql = "SELECT * FROM public.produkty";
		try {
			Statement s = c.createStatement();
			ResultSet rs = s.executeQuery(sql);
			do {
				rs.next();
				System.out.println(rs.getString("nazwa") + " " + rs.getString("ilosc"));
			} while (rs.getString("id") != null);
			} catch (Exception e ) {
			WyswietlMenu.main(c);
		}
	
	
	}
}