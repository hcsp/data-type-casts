
package com.github.hcsp.datatype;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

class CastTest {
@Test
public void castTest() {
    assertEquals(1, Cast.int2byte(1));
    assertEquals(1, Cast.int2short(1));
    assertEquals(1, Cast.int2char(1));
    assertEquals("123", Cast.int2String(123));
    assertEquals("-123", Cast.int2String(-123));
    assertEquals(123, Cast.int2String("123"));
    assertEquals(-123, Cast.int2String("-123"));
    assertEquals(1, Cast.int2String("0x1"));
    assertEquals(1, Cast.int2String("0b1"));
    assertEquals(1, Cast.int2String("0e1"));
    assertTrue(Math.abs(0.5 - Cast.string2double("0.5")) < 1e-5)
    assertTrue(Math.abs(0.123 - Cast.string2double("0.123")) < 1e-5)
    assertTrue(Math.abs(1e-5 - Cast.string2double("1e-5")) < 1e-5)
}

}
