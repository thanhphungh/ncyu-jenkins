import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GradeConverterTest {

    private GradeConverter converter;

    @Before
    public void setUp() throws Exception {
        converter = new GradeConverter();
    }

    @Test
    public void convert() {
        String expected = "A";
        String actual = converter.convert(100);
        assertEquals(expected, actual);
    }

    @Test
    public void convert2() {
        String expected = "A";
        String actual = converter.convert(90);
        assertEquals(expected, actual);
    }
}