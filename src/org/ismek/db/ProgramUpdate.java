package org.ismek.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class ProgramUpdate {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Akt�r Ad�");
		String aktorAdi = scanner.next();

		System.out.println("Akt�r Yeni Ad�");
		String aktorYeniAdi = scanner.next();

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/sakila?useUnicode=true&useLegacyDatetimeCode=false&serverTimezone=Turkey",
					"root", "1234");
			// here sonoo is database name, root is username and password

			PreparedStatement prepareStatement = con.prepareStatement(
					"update sakila.actor " +
					"set " +
					"first_name = ? " +
					"where first_name = ?");
			prepareStatement.setString(1, aktorYeniAdi);
			prepareStatement.setString(2, aktorAdi);
			prepareStatement.execute();
			System.out.println("KAYIT G�NCELLEND�");
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
