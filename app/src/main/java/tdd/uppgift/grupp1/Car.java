package tdd.uppgift.grupp1;

public class Car {
    private boolean headlights;
    private boolean headlightsOn;
    private boolean headlightsMode;
    private boolean rearlights;
    private boolean engine;

    public Car(boolean headlights, boolean headlightsOn, boolean headlightsMode, boolean rearlights, boolean engine) {
        this.headlights = headlights;
        this.headlightsOn = headlightsOn;
        this.headlightsMode = headlightsMode;
        this.rearlights = rearlights;
        this.engine = engine;
    }

    public boolean isRearlights() {
        return rearlights;
    }

    public void turnOnRearlights() {
        rearlights = true;
    }
    public void turnOffRearlights() {
        rearlights = false;
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
        headlightsOn = true;
    }
    public void turnOffHeadlights() {
        headlightsOn = false;
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
}
