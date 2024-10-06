package dev.devunion.ha.models;

public class Alarm {
    private final String type;
    private boolean isTriggered;

    public Alarm(String type) {
        this.type = type;
        this.isTriggered = false;
    }

    public String getType() {
        return type;
    }

    public boolean isTriggered() {
        return isTriggered;
    }

    public void trigger() {
        isTriggered = true;
        System.out.println("Alarm triggered: " + type);
    }

    public void reset() {
        isTriggered = false;
        System.out.println("Alarm reset: " + type);
    }
}
