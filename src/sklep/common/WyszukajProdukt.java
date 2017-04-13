package sklep.common;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class WyszukajProdukt {

	public static void main(Connection c) throws IOException, SQLException {
		PobierzKomunikat.main(9);
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String s = in.readLine();
		String sql = "SELECT * FROM public.produkty where ID = " + s;
		try {
			Statement state = c.createStatement();
			ResultSet rs = state.executeQuery(sql);
			if (!rs.isBeforeFirst() ) {    
			    System.out.println("nie ma produktu o takim id"); 
			}
			else {
				rs.next();
				System.out.println(rs.getString("nazwa") + " " + rs.getString("ilosc")+ " " + rs.getString("cena"));
			}
		} catch (Exception e ) {
			System.err.println(e.getMessage());
			WyswietlMenu.main(c);
		}
	}

}