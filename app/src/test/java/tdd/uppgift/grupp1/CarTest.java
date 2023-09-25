package tdd.uppgift.grupp1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tdd.uppgift.grupp1.Enums.Acceleration;
import tdd.uppgift.grupp1.Enums.Gear;

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
                false,
                Acceleration.BREAK,
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
        assertEquals(car.getAcceleration(), Acceleration.valueOf("GAS"));

    }
    @Test
    void stateIsBREAK(){
        car.stepOnBreak();
        assertEquals(car.getAcceleration(), Acceleration.valueOf("BREAK"));
    }

    @Test
    void assertThatCarAcceleratedFor20SecondsGoesAt180kmh(){
        car.stepOnGas();
        car.setGear(Gear.DRIVE);
        assertEquals(car.calculateSpeed(20.0,0),180.0);
    }

    @Test
    void assertThatCarAcceleratedFor18SecondsGoesAt180kmh(){
        car.stepOnGas();
        car.setGear(Gear.REVERSE);
        assertEquals(car.calculateSpeed(18.0,0),180.0);
    }
    @Test
    void assertThatCarAcceleratedFor9SecondsGoesAt90kmh(){
        car.stepOnGas();
        car.setGear(Gear.DRIVE);
        assertEquals(car.calculateSpeed(9.0,0),90.0);
    }
    @Test
    void assertThatCarGoing180kmhAndBreaksFor10SecondsGoes80kmh(){
        car.stepOnBreak();
        car.setGear(Gear.REVERSE);
        assertEquals(car.calculateSpeed(10.0,180),80.0);
    }
    @Test
    void assertThatCarGoing180kmhAndBreaksFor20SecondsGoes0kmh(){
        car.stepOnBreak();
        car.setGear(Gear.DRIVE);
        assertEquals(car.calculateSpeed(20.0,180),0.0);
    }

    @Test
    void assertThatCarIsGoingForwardExpecting200(){
        car.stepOnGas();
        car.setGear(Gear.DRIVE);
        assertEquals(car.calculateDistanceTraveled(7200,100),200);
    }
    @Test
    void assertThatCarIsGoingBackwardsExpectingNegative200(){
        car.stepOnGas();
        car.setGear(Gear.REVERSE);
        assertEquals(car.calculateDistanceTraveled(7200,100),-200);
    }

    @Test
    void assertThatBreaklightsAreOff(){
        car.stepOnGas();
        assertEquals(car.getBreakLights(), false);
    }

    @Test
    void assertThatBreaklightsAreOn(){
        car.stepOnBreak();
        assertEquals(car.getBreakLights(), true);
    }
}