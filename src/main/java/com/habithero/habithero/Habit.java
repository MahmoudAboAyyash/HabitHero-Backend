
package com.habithero.habithero;

public class Habit {

    private Long id;
    private String name;
    private String description;
    private int targetPerWeek;
    private boolean active;

    public Habit(Long id, String name, String description,
                 int targetPerWeek, boolean active) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.targetPerWeek = targetPerWeek;
        this.active = active;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getTargetPerWeek() {
        return targetPerWeek;
    }

    public boolean isActive() {
        return active;
    }
}
