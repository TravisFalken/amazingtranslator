package nz.ac.eit;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConverterTest {
    private Converter converter;
    @Before
    public void setup(){
        converter = new Converter();
    }

    @Test
    public void test_covert_1_toFrench(){
        String translator = converter.convert(1, "french");
        assertEquals("1 is giving null", "un", translator);
    }

    @Test
    public void test_convert_30_toFrench(){
        String translator = converter.convert(30, "french");
        assertEquals("30 is giving null", "trente", translator);
    }
}