package org.ismek.karisik;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class FilmProgram {

	public static void main(String[] args) {
		Oyuncu oyuncu1 = new Oyuncu("ALÝ VELÝ", EnumCinsiyet.ERKEK);
		Oyuncu oyuncu2 = new Oyuncu("MEHMET AA", EnumCinsiyet.ERKEK);
		Oyuncu oyuncu3 = new Oyuncu("AYÞE T", EnumCinsiyet.KADIN);
		Oyuncu oyuncu4 = new Oyuncu("MERVE M", EnumCinsiyet.KADIN);
		Oyuncu oyuncu5 = new Oyuncu("YASÝN CFRT", EnumCinsiyet.ERKEK);
		Oyuncu oyuncu6 = new Oyuncu("YASÝN CFRT", EnumCinsiyet.ERKEK);
		
		ArrayList<Oyuncu> oyuncuList = new ArrayList<Oyuncu>();
		oyuncuList.add(oyuncu1);
		oyuncuList.add(oyuncu2);
		oyuncuList.add(oyuncu3);
		oyuncuList.add(oyuncu4);
		oyuncuList.add(oyuncu5);
		oyuncuList.add(oyuncu6);
		
		HashSet<Oyuncu> oyuncuSet = new HashSet<Oyuncu>();
		oyuncuSet.add(oyuncu1);
		oyuncuSet.add(oyuncu2);
		oyuncuSet.add(oyuncu3);
		oyuncuSet.add(oyuncu4);
		oyuncuSet.add(oyuncu5);
		oyuncuSet.add(oyuncu6);
		
		Oyuncu oyuncuListeDisindaki = new Oyuncu("ALÝ VELÝ", EnumCinsiyet.KADIN);
		boolean oyuncuListedeVarMi = oyuncuList.contains(oyuncuListeDisindaki);
		
		Language turkce = new Language("Türkçe", "tr-TR");
		Language ingilizce = new Language("Ýngilizce", "en-US");
		
		Film matrix = new Film("Matrix", EnumKategori.AKSIYON, turkce);
		Film vizontele = new Film("Vizontele", EnumKategori.MACERA, turkce);
		Film gora = new Film("GORA", EnumKategori.AKSIYON, turkce);
		Film scaryMovie = new Film("Scary Movie", EnumKategori.KORKU, ingilizce);
		Film zorOlum = new Film("Zor Ölüm", EnumKategori.AKSIYON, ingilizce);
		
		LinkedList<Film> filmList = new LinkedList<Film>();
		filmList.add(matrix);
		filmList.add(vizontele);
		filmList.add(gora);
		filmList.add(scaryMovie);
		filmList.add(zorOlum);
		
		Map<Film, List<Oyuncu>> filmOyuncuMap = new HashMap<Film, List<Oyuncu>>();
		
		ArrayList<Oyuncu> matrixdeOynayanOyuncuList = new ArrayList<Oyuncu>();
		matrixdeOynayanOyuncuList.add(oyuncu2);
		matrixdeOynayanOyuncuList.add(oyuncu3);
		
		filmOyuncuMap.put(matrix, matrixdeOynayanOyuncuList);
		
		
		writeAndReadOyuncuList(oyuncuList);
		writeAndReadMatrixdeOynayanOyuncuMap(filmOyuncuMap);
	}

	private static void writeAndReadMatrixdeOynayanOyuncuMap(Map<Film, List<Oyuncu>> filmOyuncuMap) {
		File fileOyuncular = new File("Z:\\Java\\FilmCollection\\matrixdeOynayanOyuncuMap.dat");
		
		try (FileOutputStream fileOutputStream = new FileOutputStream(fileOyuncular)) {
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
			objectOutputStream.writeObject(filmOyuncuMap);
			fileOutputStream.flush();
		} catch (Exception e) {
			System.out.println("Yazma Hatasý" + e.getMessage());
		}
		
		
		try (FileInputStream fileInputStream = new FileInputStream(fileOyuncular)) {
			ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
			Map<Film, List<Oyuncu>> filmOyuncuMapKayitli = (Map<Film, List<Oyuncu>>) objectInputStream.readObject();
			for (Film film : filmOyuncuMapKayitli.keySet()) {
				List<Oyuncu> filmdeOynayanOyuncuList = filmOyuncuMap.get(film);
				for (Oyuncu oyuncu2 : filmdeOynayanOyuncuList) {
					System.out.println(oyuncu2.getIsim() + " - " + oyuncu2.getCinsiyet());
				}
			}
		} catch (Exception e) {
			System.out.println("Okuma Hatasý" + e.getMessage());
		}
		
	}

	private static void writeAndReadOyuncuList(ArrayList<Oyuncu> oyuncuList) {
		File fileOyuncular = new File("Z:\\Java\\FilmCollection\\oyuncular.dat");
		
		try (FileOutputStream fileOutputStream = new FileOutputStream(fileOyuncular)) {
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
			objectOutputStream.writeObject(oyuncuList);
			fileOutputStream.flush();
		} catch (Exception e) {
			System.out.println("Yazma Hatasý" + e.getMessage());
		}
		
		
		try (FileInputStream fileInputStream = new FileInputStream(fileOyuncular)) {
			ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
			ArrayList<Oyuncu> oyuncuListKayitli = (ArrayList<Oyuncu>) objectInputStream.readObject();
			for (Oyuncu oyuncu : oyuncuListKayitli) {
				System.out.println(oyuncu.getIsim() + " - " + oyuncu.getCinsiyet());
			}
		} catch (Exception e) {
			System.out.println("Okuma Hatasý" + e.getMessage());
		}
	}

}