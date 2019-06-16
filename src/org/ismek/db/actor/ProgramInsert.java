package org.ismek.db.actor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class ProgramInsert {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Aktör Adý");
		String aktorAdi = scanner.next();

		System.out.println("Aktör Soyadý");
		String aktorSoyadi = scanner.next();

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/sakila?useUnicode=true&useLegacyDatetimeCode=false&serverTimezone=Turkey",
					"root", "1234");
			// here sonoo is database name, root is username and password

			PreparedStatement prepareStatement = con.prepareStatement("insert into sakila.actor "
					+ "(first_name, last_name, last_update) " + " values " + "(?, ?, sysdate()) ");
			prepareStatement.setString(1, aktorAdi);
			prepareStatement.setString(2, aktorSoyadi);
			prepareStatement.execute();
			System.out.println("KAYIT EKLENDÝ");
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
