package com.juaracoding.ujian.function;

public class Kolam {
	public double kelilingKolam(String panjang, String lebar, String tinggi) {
		if (panjang.isEmpty() || lebar.isEmpty() || tinggi.isEmpty()) {
			return 0;
		} else {
			return (Double.parseDouble(panjang) + Double.parseDouble(lebar) + Double.parseDouble(tinggi)) * 4;
		}

	}

	public double volumeKolam(String panjang, String lebar, String tinggi) {
		if (panjang.isEmpty() || lebar.isEmpty() || tinggi.isEmpty()) {
			return 0;
		} else {
			return Double.parseDouble(panjang) * Double.parseDouble(lebar) * Double.parseDouble(tinggi);
		}

	}
}
