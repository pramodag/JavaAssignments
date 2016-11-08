package com.hagenberg.ENI515.exercise7.test;
import static org.junit.Assert.*;
import org.junit.Test;

public class TemperatureTest {
@Test
public void testCelsius2Fahrenheit() {
assertTrue("-40°C = -40°F",Temperature.Celsius2Fahrenheit(-40)==-40);
assertTrue("-10°C = 14°F",Temperature.Celsius2Fahrenheit(-10)==14);
assertTrue(" 0°C = 32°F",Temperature.Celsius2Fahrenheit(0)==32);
assertTrue("10°C = 50°F",Temperature.Celsius2Fahrenheit(10)==50);
assertTrue("20°C = 68°F",Temperature.Celsius2Fahrenheit(20)==68);
assertTrue("30°C = 86°F",Temperature.Celsius2Fahrenheit(30)==86);
assertTrue("40°C = 104°F",Temperature.Celsius2Fahrenheit(40)==104);
assertTrue("50°C = 122°F",Temperature.Celsius2Fahrenheit(50)==122);
}
@Test
public void testFahrenheit2Celsius() {
…
}
}
CREATING TES