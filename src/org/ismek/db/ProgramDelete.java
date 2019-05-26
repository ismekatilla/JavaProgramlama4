package org.ismek.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class ProgramDelete {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Aktör Id");
		int actorId = scanner.nextInt();

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/sakila?useUnicode=true&useLegacyDatetimeCode=false&serverTimezone=Turkey",
					"root", "1234");
			// here sonoo is database name, root is username and password

			PreparedStatement prepareStatement = con.prepareStatement("delete from sakila.actor where actor_id = ?");
			prepareStatement.setInt(1, actorId);
			prepareStatement.execute();
			System.out.println("KAYIT SÝLÝNDÝ");
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
