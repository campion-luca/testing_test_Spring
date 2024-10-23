package com.epicode.U5D2;

import com.epicode.U5D2.entities.*;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class Esercizio30102023ApplicationTests {

	@Test
	void possiamoCreareDrink() {
		System.out.println("-------------TEST 1-------------");
		Drink bianchi = new Drink("Margherita test",100,20.0);
		assertNotNull(bianchi);
	}



}
