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
                false,
                false);
    }

    @Test
    void assertCarIsObjectOfCarExpectingCar() {
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
        assertFalse(car.isEngineOn());
    }

    @Test
    void assertThatEngineStartsExpectingTrue(){
        assertFalse(car.isEngineOn());
        car.startEngine();
        assertTrue(car.isEngineOn());
    }
    @Test
    void assertThatEngineStopsExpectingTrue(){
        car.startEngine();
        assertTrue(car.isEngineOn());
        car.stopEngine();
        assertFalse(car.isEngineOn());
    }

    @Test
    void assertThatEngineAndLightsAreOffExpectingTrue(){
        car.startEngine();
        car.turnOnHeadlights();
        car.turnOnRearlights();
        assertTrue(car.isEngineOn());
        assertTrue(car.isHeadlightsOn());
        assertTrue(car.isRearlights());
    }
    @Test
    void assertThatEngineAndLightsAreOffExpectingFalse(){
        assertFalse(car.isEngineOn());
        assertFalse(car.isHeadlightsOn());
        assertFalse(car.isRearlights());
    }
    @Test
    void assertThatEngineAndLightsAreOffExpectingFalseAfterTurningOnEngine(){
        car.startEngine();
        car.turnOnHeadlights();
        car.turnOnRearlights();
        car.stopEngine();
        assertFalse(car.isEngineOn());
        assertFalse(car.isHeadlightsOn());
        assertFalse(car.isRearlights());
    }

    @Test
    void assertThatHazardLightsAreOffExpectingFalse(){
        assertFalse(car.isHazardLightsOn());
    }

    @Test
    void assertThatHazardLightsTurnOnWhilstEngineIsOffExpectingTrue(){
        car.turnOnHazardLights();
        assertTrue(car.isHazardLightsOn());
    }

    @Test
    void stateIsGAS(){
        car.stepOnGas();
        assertThat(car.gas = "GAS");
    }
    @Test
    void stateIsBREAK(){
        car.stepOnBreak();
        assertThat(car.gas = "BREAK");
    }
}