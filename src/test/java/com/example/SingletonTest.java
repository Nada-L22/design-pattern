package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class SingletonTest {
    @Test
    public void testSingletonInstance() {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        assertEquals(instance1, instance2);
    }
    
}
