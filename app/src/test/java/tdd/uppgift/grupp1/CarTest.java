package tdd.uppgift.grupp1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {
    Car car;

    @BeforeEach
    void setUp(){
        car = new Car(true,
                false,
                true,
                false,
                false);
    }

    @Test
    void assertIsCarExpectingTrue() {
        assertEquals(Car.class, car.getClass());
    }

    @Test
    void assertIsHeadlightExpectingTrue() {
        assertTrue(car.isHeadlights());
    }

    @Test
    void assertIsHeadlightsOnExpectingTrue() {
        car.startEngine();
        car.turnOnHeadlights();
        assertTrue(car.isHeadlightsOn());
    }

    @Test
    void assertIsHeadlightsOffExpectingTrue() {
        car.turnOffHeadlights();
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
        car.startEngine();
        car.turnOnRearlights();
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

    @Test
    void assertThatEngineAndLightsAreOffExpectingTrue(){
        car.startEngine();
        car.turnOnHeadlights();
        car.turnOnRearlights();
        assertEquals(car.isEngineOn(),true);
        assertEquals(car.isHeadlights(),true);
        assertEquals(car.isRearlights(),true);
    }
    @Test
    void assertThatEngineAndLightsAreOffExpectingFalse(){
        assertEquals(car.isEngineOn(),false);
        assertEquals(car.isHeadlightsOn(),false);
        assertEquals(car.isRearlights(),false);
    }
    @Test
    void assertThatEngineAndLightsAreOffExpectingFalseAfterTurningOnEngine(){
        car.startEngine();
        car.turnOnHeadlights();
        car.turnOnRearlights();
        car.stopEngine();
        assertEquals(car.isEngineOn(),false);
        assertEquals(car.isHeadlightsOn(),false);
        assertEquals(car.isRearlights(),false);
    }
}