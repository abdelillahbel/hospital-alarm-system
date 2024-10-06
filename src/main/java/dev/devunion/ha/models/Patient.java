package dev.devunion.ha.models;


public class Patient {
    private final String name;
    private final int id;
    private String condition;

    public Patient(String name, int id, String condition) {
        this.name = name;
        this.id = id;
        this.condition = condition;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }
}
