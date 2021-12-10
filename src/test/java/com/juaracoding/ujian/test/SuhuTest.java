package com.juaracoding.ujian.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.juaracoding.ujian.function.Suhu;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;

@RunWith(JUnitParamsRunner.class)
public class SuhuTest {
	Suhu suhu;

	@Before
	public void setUp() throws Exception {
		suhu = new Suhu();
	}

	@Test
	@FileParameters("src/test/resources/Ujian JUnit - F ke C.csv")
	public void testFahrenheitCelcius(String f, String c) {
		assertEquals(Double.parseDouble(c), suhu.fahrenheitCelcius(f), 0.9);
	}

	@Test
	public void testFahrenheitCelciusHuruf() {
		assertEquals("error", suhu.fahrenheitCelcius("x"), 0.9);
	}

	@Test
	public void testFahrenheitCelciusNegatif() {
		assertEquals(((-1.0 - 32.0) * 5.0 / 9.0) * -1.0, suhu.fahrenheitCelcius("-1"), 0.9);
	}

	@Test
	public void testFahrenheitCelciusNol() {
		assertEquals(0, suhu.fahrenheitCelcius("0"), 0.9);
	}

}
