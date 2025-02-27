package com.platzi.javatests.romannumerals;

import org.junit.Test;

import static org.junit.Assert.*;

public class RomanNumeralsTest {
    @Test
    public void testUnidades() {
        assertEquals("I", RomanNumerals.arabicToRoman(1));
        assertEquals("II", RomanNumerals.arabicToRoman(2));
        assertEquals("III", RomanNumerals.arabicToRoman(3));
        assertEquals("IV", RomanNumerals.arabicToRoman(4));
        assertEquals("V", RomanNumerals.arabicToRoman(5));
    }

    @Test
    public void testDecenas() {
        assertEquals("X", RomanNumerals.arabicToRoman(10));
        assertEquals("XX", RomanNumerals.arabicToRoman(20));
        assertEquals("XXX", RomanNumerals.arabicToRoman(30));
        assertEquals("XL", RomanNumerals.arabicToRoman(40));
        assertEquals("L", RomanNumerals.arabicToRoman(50));
    }

    @Test
    public void testCientos() {
        assertEquals("C", RomanNumerals.arabicToRoman(100));
        assertEquals("CC", RomanNumerals.arabicToRoman(200));
        assertEquals("CCC", RomanNumerals.arabicToRoman(300));
        assertEquals("CD", RomanNumerals.arabicToRoman(400));
        assertEquals("D", RomanNumerals.arabicToRoman(500));
    }

    @Test
    public void testMil() {
        assertEquals("M", RomanNumerals.arabicToRoman(1000));
        assertEquals("MM", RomanNumerals.arabicToRoman(2000));
        assertEquals("MMM", RomanNumerals.arabicToRoman(3000));
    }

    @Test
    public void testNumerosCompuestos() {
        assertEquals("IX", RomanNumerals.arabicToRoman(9));
        assertEquals("XIV", RomanNumerals.arabicToRoman(14));
        assertEquals("XLIV", RomanNumerals.arabicToRoman(44));
        assertEquals("XCIX", RomanNumerals.arabicToRoman(99));
        assertEquals("CDXLIV", RomanNumerals.arabicToRoman(444));
        assertEquals("CMXCIX", RomanNumerals.arabicToRoman(999));
    }
}