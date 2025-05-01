package service;


import org.junit.Assert;
import org.junit.Test;

public class ConversorTemperaturaTest {
    ConversorTemperatura dd = new ConversorTemperatura();
    @Test
    public void testCelsiusToFahrenheit() {
        String resultado = dd.convertir("0°C");
        Assert.assertEquals("32.00°F", resultado);
    }

    @Test
    public void testFahrenheitToCelsius() {
        String resultado = dd.convertir("212°F");
        Assert.assertEquals("100.00°C", resultado);
    }

    @Test
    public void testFormatoInvalido() {
        String resultado = dd.convertir("100C");
        Assert.assertEquals("Error: formato inválido. Usa el formato '30°C' o '86°F'.", resultado);
    }

    @Test
    public void testNullInput() {
        String resultado = dd.convertir(null);
        Assert.assertEquals("Error: formato inválido. Usa el formato '30°C' o '86°F'.", resultado);
    }

    @Test
    public void testCelsiusNegativo() {
        String resultado = dd.convertir("-40°C");
        Assert.assertEquals("-40.00°F", resultado);
    }

    @Test
    public void testFahrenheitNegativo() {
        String resultado = dd.convertir("-40°F");
        Assert.assertEquals("-40.00°C", resultado);
    }

    @Test
    public void testConDecimales() {
        String resultado = dd.convertir("36.6°C");
        Assert.assertEquals("97.88°F", resultado);
    }
}