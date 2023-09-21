package tdd.uppgift.grupp1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {
    Car car;

    @BeforeEach
    void setUp(){
        car = new Car(true, true);
    }

    @Test
    void isCar() {
        assertEquals(Car.class, car.getClass());
    }

    @Test
    void testIsHeadlights() {
        assertTrue(car.isHeadlights());
    }

    @Test
    void testIsHeadlightsMode() {
        assertTrue(car.isHeadlightsMode());
        car.setHeadlightsMode(false);
        assertFalse(car.isHeadlightsMode());
    }
}