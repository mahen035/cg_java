package com.test.cg;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class AppTest {

	/*
	 * @Test public void shouldAnswerWithTrue() { assertTrue(true); }
	 */
    
    @Test
    public void getSum() {
    	int sum = 4+5;
    	assertEquals(9, sum);
    }

}
