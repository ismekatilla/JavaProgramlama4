package org.ismek.db.actor;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Aktör Adý");
		String aktorAdi = scanner.nextLine();

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/sakila?useUnicode=true&useLegacyDatetimeCode=false&serverTimezone=Turkey",
					"root", "1234");
			// here sonoo is database name, root is username and password
			PreparedStatement prepareStatement = con
					.prepareStatement("SELECT * FROM sakila.actor where first_name = ?");
			prepareStatement.setString(1, aktorAdi);

//			' or '1' = '1
//			PreparedStatement prepareStatement = con
//					.prepareStatement("SELECT * FROM sakila.actor where first_name = '" + aktorAdi + "'");

			prepareStatement.executeQuery();
			ResultSet rs = prepareStatement.getResultSet();
			while (rs.next()) {
				int actor_id = rs.getInt(1);
				String first_name = rs.getString(2);
				String last_name = rs.getString("last_name");
				Date last_update = rs.getDate("last_update");

				Actor actor = new Actor();
				actor.setActor_id(actor_id);
				actor.setFirst_name(first_name);
				actor.setLast_name(last_name);
				actor.setLast_update(last_update);

				System.out.println(actor.getActor_id() + " - - " + actor.getFirst_name());
			}

			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
