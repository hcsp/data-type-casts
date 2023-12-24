package com.github.hcsp.datatype;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CastTest {
    @Test
    public void castTest() {
        Assertions.assertEquals(1, Cast.int2byte(1));
        Assertions.assertEquals(1, Cast.int2short(1));
        Assertions.assertEquals(1, Cast.int2char(1));
        Assertions.assertEquals("123", Cast.int2String(123));
        Assertions.assertEquals("-123", Cast.int2String(-123));
        Assertions.assertEquals(123, Cast.string2int("123"));
        Assertions.assertEquals(-123, Cast.string2int("-123"));
        Assertions.assertEquals(123, Cast.Long2int(123L));
        Assertions.assertEquals(123L, Cast.double2Long(123d));
        Assertions.assertTrue(Math.abs(0.5 - Cast.string2double("0.5")) < 1e-5);
        Assertions.assertTrue(Math.abs(0.123 - Cast.string2double("0.123")) < 1e-5);
        Assertions.assertTrue(Math.abs(1e-5 - Cast.string2double("1e-5")) < 1e-5);
    }
}
