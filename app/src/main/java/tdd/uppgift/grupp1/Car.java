package tdd.uppgift.grupp1;

public class Car {
    private boolean headlights;
    private boolean headlightsOn;
    private boolean headlightsMode;
    private boolean rearlights;
    private boolean engine;
    private boolean hazardLights;

    public Car(boolean headlights,
               boolean headlightsOn,
               boolean headlightsMode,
               boolean rearlights,
               boolean engine,
               boolean hazardLights) {

        this.headlights = headlights;
        this.headlightsOn = headlightsOn;
        this.headlightsMode = headlightsMode;
        this.rearlights = rearlights;
        this.engine = engine;
        this.hazardLights = hazardLights;
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
}
