package org.example1.java_jenkins_docker;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class TestMain {
	@Test
	public void testInputIsEven()
	{
		assertTrue(Main.cheackIfInputIsAnEvenNumber(23));
	}

}