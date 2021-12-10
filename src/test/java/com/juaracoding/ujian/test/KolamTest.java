package com.juaracoding.ujian.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.juaracoding.ujian.function.Kolam;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;

@RunWith(JUnitParamsRunner.class)
public class KolamTest {
	Kolam kolam;

	@Before
	public void setUp() throws Exception {
		kolam = new Kolam();
	}

	@Test
	@FileParameters("src/test/resources/Ujian JUnit - Keliling Kolam.csv")
	public void testKelilingKolam(String panjang, String lebar, String tinggi, String hasil) {
		assertEquals(Double.parseDouble(hasil), kolam.kelilingKolam(panjang, lebar, tinggi), 0.9);

	}

	@Test
	public void testKelilingKolamHuruf() {
		assertEquals("error", kolam.kelilingKolam("x", "x", "x"), 0.9);
	}

	@Test
	public void testKelilingKolamNegative() {
		assertEquals(Math.abs(4 * (-1 - 1 - 1)), kolam.kelilingKolam("-1", "-1", "-1"), 0.9);
	}

	@Test
	public void testKelilingKolamNol() {
		assertEquals(0, kolam.kelilingKolam("0", "0", "0"), 0.9);

	}

	@Test
	@FileParameters("src/test/resources/Ujian JUnit - Volume Air Kolam.csv")
	public void testVolumeKolam(String panjang, String lebar, String tinggi, String hasil) {
		assertEquals(Double.parseDouble(hasil), kolam.volumeKolam(panjang, lebar, tinggi), 0.9);
	}

	@Test
	public void testVolumeKolamHuruf() {
		assertEquals("error", kolam.volumeKolam("x", "x", "x"), 0.9);

	}

	@Test
	public void testVolumeKolamNegative() {
		assertEquals(1, kolam.volumeKolam("-1", "-1", "-1"), 0.9);
	}

	@Test
	public void testVolumeKolamNol() {
		assertEquals(0, kolam.volumeKolam("0", "0", "0"), 0.9);

	}

}
