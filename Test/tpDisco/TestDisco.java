package tpDisco;

import org.junit.Assert;
import org.junit.Test;

public class TestDisco {

	@Test
	public void radiosDelDiscoValidos() {
		Disco miDisco = new Disco(4.6, 7.1);
		Assert.assertEquals((Double)4.6, miDisco.getRadioInterior());
		Assert.assertEquals((Double)7.1, miDisco.getRadioExterior());
	}
	
	@Test
	public void radiosDelDiscoInvalidos() {
		Disco miDisco = new Disco(4.6, 2.7);
		Assert.assertEquals((Double)0.0, miDisco.getRadioInterior());
		Assert.assertEquals((Double)0.0, miDisco.getRadioExterior());
	}
	
	@Test
	public void perimetroInteriorDelDisco() {
		Disco miDisco = new Disco(4.6, 7.1);
		Assert.assertEquals((Double)28.9, miDisco.perimetroInterior(), 0.01);
	}
	
	@Test
	public void perimetroExteriorDelDisco() {
		Disco miDisco = new Disco(4.6, 7.1);
		Assert.assertEquals((Double)44.61, miDisco.perimetroExterior(), 0.01);
	}
	
	@Test
	public void superficieDelDisco() {
		Disco miDisco = new Disco(4.6, 7.1);
		Assert.assertEquals((Double)91.89, miDisco.calcularSuperficie(), 0.01);
	}
	
	@Test
	public void cambioDelRadioInteriorCorrecto() {
		Disco miDisco = new Disco(4.6, 7.1);
		Assert.assertTrue(miDisco.cambiarRadioInterior(5.3));
		Assert.assertEquals((Double)5.3, miDisco.getRadioInterior());
	}
	
	@Test
	public void cambioDelRadioInteriorIncorrecto() {
		Disco miDisco = new Disco(4.6, 7.1);
		Assert.assertFalse(miDisco.cambiarRadioInterior(9.4));
		Assert.assertEquals((Double)4.6, miDisco.getRadioInterior());
	}
	
	@Test
	public void cambioDelRadioExteriorCorrecto() {
		Disco miDisco = new Disco(4.6, 7.1);
		Assert.assertTrue(miDisco.cambiarRadioExterior(6.8));
		Assert.assertEquals((Double)6.8, miDisco.getRadioExterior());
	}
	
	@Test
	public void cambioDelRadioExteriorIncorrecto() {
		Disco miDisco = new Disco(4.6, 7.1);
		Assert.assertFalse(miDisco.cambiarRadioExterior(3.7));
		Assert.assertEquals((Double)7.1, miDisco.getRadioExterior());
	}

}
