package tdd.uppgift.grupp1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {
    Car car;

    @BeforeEach
    void setUp(){
        car = new Car(true, true, true, true,false);
    }

    @Test
    void assertIsCarExpectingTrue() {
        assertEquals(Car.class, car.getClass());
        //assertNotNull(car);
    }

    @Test
    void assertIsHeadlightExpectingTrue() {
        assertTrue(car.isHeadlights());
    }

    @Test
    void assertIsHeadlightsOnExpectingTrue() {
        assertTrue(car.isHeadlightsOn());
    }

    @Test
    void assertIsHeadlightsOffExpectingTrue() {
        car.setHeadlightsOn(false);
        assertFalse(car.isHeadlightsOn());
    }

    @Test
    void assertIsHeadlilghtsFullBeamExpectingTrue() {
        assertEquals(car.isHeadlightsMode(), "Full beam");
    }

    @Test
    void assertIsHeadlilghtsHalfBeamExpectingTrue() {
        car.setHeadlightsMode(false);
        assertEquals(car.isHeadlightsMode(), "Half beam");
    }

    @Test
    void assertIsRearLightsExpectingTrue() {
        assertTrue(car.isRearlights());
    }

    @Test
    void assertThatEngineIsOnExpectingFalse(){
        assertEquals(car.isEngineOn(), false);
    }

    @Test
    void assertThatEngineStartsExpectingTrue(){
        assertEquals(car.isEngineOn(), false);
        car.startEngine();
        assertEquals(car.isEngineOn(),true);
    }
    @Test
    void assertThatEngineStopsExpectingTrue(){
        car.startEngine();
        assertEquals(car.isEngineOn(), true);
        car.stopEngine();
        assertEquals(car.isEngineOn(),false);
    }
}