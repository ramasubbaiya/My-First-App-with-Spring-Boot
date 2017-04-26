package com.rama;

import static org.junit.Assert.assertEquals;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.mockito.Mockito.*;

import com.rama.controller.ShipwreckController;
import com.rama.model.Shipwreck;
import com.rama.repository.ShipwreckRepository;


public class ShipwreckControllerTest {
	@InjectMocks
	private ShipwreckController shipwreckController;

	@Mock
	private ShipwreckRepository shipwreckRepository;
	
	@Before
	public void init() {
		MockitoAnnotations.initMocks(this);
	}
	@Test
	public void testShipwreckGet() {
		Shipwreck shipwreck = new Shipwreck();
		shipwreck.setId(1l);
		when(shipwreckRepository.findOne(1l)).thenReturn(shipwreck);

		Shipwreck result = shipwreckController.get(1L);
		
		verify(shipwreckRepository).findOne(1l);
		
		// assertEquals(1l, result.getId().longValue());
		assertThat(result.getId(), is(1l));
	}
}
