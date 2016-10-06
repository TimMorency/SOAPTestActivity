package com.tmorency;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

/**
 * Created by Tim on 10/6/2016.
 */
public class TemperatureConversionsTest {
    @Test
    public void getTemperatureConversionsSoap12() throws Exception {
        TemperatureConversionsSoapType service = new TemperatureConversions().getTemperatureConversionsSoap12();

        BigDecimal cToFResult = service.celsiusToFahrenheit(BigDecimal.valueOf(0.0));

        assertEquals(cToFResult, BigDecimal.valueOf(32));

        BigDecimal fToCResult = service.fahrenheitToCelsius(BigDecimal.valueOf(32));
        assertEquals(fToCResult, BigDecimal.valueOf(0));

        BigDecimal windChillC = service.windChillInCelsius(BigDecimal.valueOf(12), BigDecimal.valueOf(10));

        assert(windChillC.intValue() < 12);

        BigDecimal windChillf = service.windChillInFahrenheit(BigDecimal.valueOf(12), BigDecimal.valueOf(10));

        assert(windChillC.intValue() < 12);
    }

}