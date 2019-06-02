package com.github.hcsp.datatype;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class CastTest {
    @Test
    public void castTest() {
        assertEquals(1, Cast.int2byte(1));
        assertEquals(1, Cast.int2short(1));
        assertEquals(1, Cast.int2char(1));
        assertEquals("123", Cast.int2String(123));
        assertEquals("-123", Cast.int2String(-123));
        assertEquals(123, Cast.string2int("123"));
        assertEquals(-123, Cast.string2int("-123"));
        assertEquals(123, Cast.Long2int(123L));
        assertEquals(123L, Cast.double2Long(123d));
        assertTrue(Math.abs(0.5 - Cast.string2double("0.5")) < 1e-5);
        assertTrue(Math.abs(0.123 - Cast.string2double("0.123")) < 1e-5);
        assertTrue(Math.abs(1e-5 - Cast.string2double("1e-5")) < 1e-5);
    }
}
