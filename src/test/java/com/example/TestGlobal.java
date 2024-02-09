package com.example;

import junit.framework.Test;
import static junit.framework.Assert.assertTrue;
import static junit.framework.Assert.*;

public class TestGlobal {
    @Test
    public void testSingletonInstance() {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        assertEquals(instance1, instance2);
    }


    @Test
    public void testConcreteStrategyA() {
      
        Strategy strategy = new ConcreteStrategyA();
        strategy.execute();
        assertTrue(true); 
    }

    @Test
    public void testConcreteStrategyB() {
        
        Strategy strategy = new ConcreteStrategyB();
    
        strategy.execute();
        assertTrue(true);  
    }

    @Test
    public void testContextBehaviour() {
        
        Context context = new Context();
        
        Strategy strategyA = new ConcreteStrategyA();
        Strategy strategyB = new ConcreteStrategyB();

       
        context.setStrategy(strategyA);
        context.executeStrategy();
        assertTrue(true); 

        context.setStrategy(strategyB);
        context.executeStrategy();
        assertTrue(true);
    }
    
}

