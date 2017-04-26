package com.rama;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import com.rama.controller.HomeController;

public class AppTest {

	@Test
    public void testApp() {
		HomeController homeController = new HomeController();
		String result = homeController.home();
		assertEquals(result, "Rama Boot, My First boot Controller");
    }
}
