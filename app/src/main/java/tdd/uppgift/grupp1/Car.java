package tdd.uppgift.grupp1;

import tdd.uppgift.grupp1.Enums.Acceleration;
import tdd.uppgift.grupp1.Enums.Gear;

public class Car {
    private boolean headlights;
    private boolean headlightsOn;
    private boolean headlightsMode;
    private boolean rearlights;
    private boolean engine;
    private boolean hazardLights;
    private Acceleration acceleration;
    private Gear gear;
    private boolean breakLights;

    public Car(boolean headlights,
               boolean headlightsOn,
               boolean headlightsMode,
               boolean rearlights,
               boolean engine,
               boolean hazardLights,
               Acceleration acceleration,
               boolean breakLights) {

        this.headlights = headlights;
        this.headlightsOn = headlightsOn;
        this.headlightsMode = headlightsMode;
        this.rearlights = rearlights;
        this.engine = engine;
        this.hazardLights = hazardLights;
        this.acceleration = acceleration;
        this.breakLights = breakLights;
    }

    public boolean isRearlights() {
        return rearlights;
    }

    public void turnOnRearlights() {
        if(engine) {
            rearlights = true;
        }
    }
    public void turnOffRearlights() {
        if(engine) {
            rearlights = false;
        }
    }

    public String isHeadlightsMode() {
        if(headlightsMode){
            return "Full beam";
        }
        return "Half beam";
    }
    public void setHeadlightsMode(boolean headlightsMode) {
            this.headlightsMode = headlightsMode;
    }

    public boolean isHeadlightsOn() {
        return headlightsOn;
    }

    public void turnOnHeadlights() {
        if(engine) {
            headlightsOn = true;
        }
    }
    public void turnOffHeadlights() {
        if(engine) {
            headlightsOn = false;
        }
    }
    public boolean isHeadlights() {
        return headlights;
    }

    public void setHeadlights(boolean headlights) {
        this.headlights = headlights;
    }

    @Override
    public String toString() {
        return "Car{" +
                "headlights=" + headlights +
                ", headlightsOn=" + headlightsOn +
                ", headlightsMode=" + isHeadlightsMode() +
                '}';
    }

    public boolean isEngineOn() {
        return engine;
    }

    public void startEngine() {
        engine = true;
    }

    public void stopEngine() {
        engine = false;
        headlightsOn = false;
        rearlights = false;
    }

    public boolean isHazardLightsOn() {
        return hazardLights;
    }

    public void turnOnHazardLights() {
        hazardLights = true;
    }

    public void turnOffHazardLights() {
        hazardLights = false;
    }

    public void stepOnGas() {
        breakLights = false;
        acceleration = Acceleration.GAS;
    }

    public void stepOnBreak() {
        breakLights = true;
        acceleration = Acceleration.BREAK;
    }

    public Acceleration getAcceleration(){
        return acceleration;
    }

    public double calculateSpeed(double time, double currentSpeed) {
        if(acceleration.equals(Acceleration.GAS)){
            if(time * 10 + currentSpeed> 180){
                return 180;
            }
            return time * 10 + currentSpeed;
        }
        //if break is stepped on
        else {
            if(currentSpeed - time * 10 < 0 ){
                return 0;
            }else{
                return currentSpeed - time * 10;
            }
        }
    }
    public void setGear(Gear gear) {
        this.gear = gear;
    }

    public double calculateDistanceTraveled(double time, double speed){
        if (gear.equals(Gear.DRIVE)){
            //car is moving forward
            return time/3600 * speed;
        }
            //car is moving backwards
        return -(time/3600 * speed);
    }

    public boolean getBreakLights() {
        return breakLights;
    }
}
