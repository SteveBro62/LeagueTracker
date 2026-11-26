package fi.jyu.ohj2.ipetresx.league.Models;

import java.util.*;

import java.util.List;

public class Champion {
    private final String name;
    private final List<String> classes = new ArrayList<>();
    private final Difficulty difficulty;

    // Constructor
    public Champion(String name, List<String> classes, Difficulty difficulty) {
        this.name = name;
        if(!classes.isEmpty())
            this.classes.addAll(classes);
        this.difficulty = difficulty;
    }

    // Getters
    public String getName() {
        return name;
    }

    public List<String> getClasses() {
        return classes;
    }

    public Difficulty getDifficulty() {
        return difficulty;
    }
}