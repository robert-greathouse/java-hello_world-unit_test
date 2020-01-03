package tech.greathouse;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.junit.jupiter.SpringExtension;

/**
 * Unit test for simple App.
 */
@ExtendWith(SpringExtension.class)
public class AppTest {

    @Rule
    public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();


    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        String[] args = {""};
        App.main(args);
        assertEquals("Hello World!", systemOutRule.getLog());
    }
}
