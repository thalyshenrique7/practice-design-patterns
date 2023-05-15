package singletonPattern.test;

import org.junit.Before;
import org.junit.Test;
import singletonPattern.models.Logger;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Author: Thalys Henrique
 * LinkedIn: https://www.linkedin.com/in/thalyshenrique7/
 * Singleton Pattern
 */

public class TestLogger {

    private Logger instance;

    @Before
    public void initialize(){
        instance = Logger.getInstance();
    }

    @Test
    public void testLogger(){
        instance.addMessageList("First message in log");
        instance.addMessageList("Second message in log");

        assertNotNull(instance);
        assertEquals("First message in log", instance.getAllMessages().get(0));
        assertEquals("Second message in log", instance.getAllMessages().get(1));
        assertEquals(2, instance.getAllMessages().size());
        assertEquals(Logger.class, instance.getClass());
    }
}
