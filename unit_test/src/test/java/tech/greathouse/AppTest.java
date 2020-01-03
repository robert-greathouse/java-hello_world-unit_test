package tech.greathouse;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;

/**
 * Unit test for simple App.
 */
public class AppTest {

    @Rule
    public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();


    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        App.main(new String[]{""});
        assertEquals("Hello Philip!", systemOutRule.getLog());
    }
}
