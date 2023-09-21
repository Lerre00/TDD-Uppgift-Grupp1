package tdd.uppgift.grupp1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {
    Car car;

    @BeforeEach
    void setUp(){
        car = new Car(true, true, true, true);
    }

    @Test
    void isCar() {
        assertEquals(Car.class, car.getClass());
        //assertNotNull(car);
    }

    @Test
    void testIsHeadlights() {
        assertTrue(car.isHeadlights());
    }

    @Test
    void testIsHeadlightsOn() {
        assertTrue(car.isHeadlightsOn());
        car.setHeadlightsOn(false);
        assertFalse(car.isHeadlightsOn());
    }

    @Test
    void testIsHeadlightsMode() {
        assertEquals(car.isHeadlightsMode(), "Full beam");
        car.setHeadlightsMode(false);
        assertEquals(car.isHeadlightsMode(), "Half beam");
    }

    @Test
    void testIsRearlights() {
        assertTrue(car.isRearlights());
    }
}