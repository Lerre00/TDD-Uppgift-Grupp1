package tdd.uppgift.grupp1;

public class Car {
    private boolean headlights;
    private boolean headlightsOn;
    private boolean headlightsMode;
    private boolean rearlights;

    public Car(boolean headlights, boolean headlightsOn, boolean headlightsMode, boolean rearlights) {
        this.headlights = headlights;
        this.headlightsOn = headlightsOn;
        this.headlightsMode = headlightsMode;
        this.rearlights = rearlights;
    }

    public boolean isRearlights() {
        return rearlights;
    }

    public void setRearlights(boolean rearlights) {
        this.rearlights = rearlights;
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

    public void setHeadlightsOn(boolean headlightsOn) {
        this.headlightsOn = headlightsOn;
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
}
