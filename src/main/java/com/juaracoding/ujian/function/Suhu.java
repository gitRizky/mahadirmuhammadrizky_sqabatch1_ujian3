package com.juaracoding.ujian.function;

public class Suhu {
	public double fahrenheitCelcius(String suhu) {
		if (suhu.isEmpty()) {
			return 0;
		} else {
			return (Double.parseDouble(suhu) - 32) * 5 / 9;
		}

	}
}
