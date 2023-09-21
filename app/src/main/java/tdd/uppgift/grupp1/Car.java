package tdd.uppgift.grupp1;

public class Car {
    private boolean headlights;
    private boolean headlightsMode;

    public boolean isHeadlightsMode() {
        return headlightsMode;
    }

    public void setHeadlightsMode(boolean headlightsMode) {
        this.headlightsMode = headlightsMode;
    }

    public boolean isHeadlights() {
        return headlights;
    }

    public void setHeadlights(boolean headlights) {
        this.headlights = headlights;
    }

    public Car(boolean headlights, boolean headlightsMode) {
        this.headlights = headlights;
        this.headlightsMode = headlightsMode;
    }
}
