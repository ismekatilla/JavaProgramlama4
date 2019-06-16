package org.ismek.db.kutuphane;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import org.ismek.db.actor.Actor;

public class ProgramKutuphane {

	public static void main(String[] args) {
		
		kitaplariGetir();
//		kitapEkle();
		
	}

	private static void kitaplariGetir() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/kutuphane?useUnicode=true&useLegacyDatetimeCode=false&serverTimezone=Turkey",
					"root", "1234");
			// here sonoo is database name, root is username and password
			PreparedStatement prepareStatement = con.prepareStatement("SELECT * FROM kutuphane.kitap");

//			' or '1' = '1
//			PreparedStatement prepareStatement = con
//					.prepareStatement("SELECT * FROM sakila.actor where first_name = '" + aktorAdi + "'");

			prepareStatement.executeQuery();
			ResultSet rs = prepareStatement.getResultSet();
			while (rs.next()) {
				int kitap_id = rs.getInt("no");
				String adi = rs.getString("adi");
				Date basimYili = rs.getDate("basim_yili");

				System.out.println(kitap_id + " - - " + adi + " - - " + basimYili);
			}

			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	private static void kitapEkle() {
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Kitap Adý");
		String kitapAdi = scanner.nextLine();
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/kutuphane?useUnicode=true&useLegacyDatetimeCode=false&serverTimezone=Turkey",
					"root", "1234");
			// here sonoo is database name, root is username and password
			PreparedStatement prepareStatement = con.prepareStatement("INSERT INTO kutuphane.kitap (ADI) VALUES ('"+kitapAdi+"')");

//			' or '1' = '1
//			PreparedStatement prepareStatement = con
//					.prepareStatement("SELECT * FROM sakila.actor where first_name = '" + aktorAdi + "'");

			boolean execute = prepareStatement.execute();
			if (!execute) {
				System.out.println("Kayýt eklendi");
			} else {
				System.out.println("Kayýt eklenemedi");
			}

			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
