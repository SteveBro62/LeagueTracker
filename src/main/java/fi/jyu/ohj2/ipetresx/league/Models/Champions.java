package fi.jyu.ohj2.ipetresx.league.Models;

import java.util.*;

import java.util.List;

public class Champions {
    private String name;
    private List<String> classes;
    private int difficulty;

    // Constructor
    public Champions(String name, List<String> classes, int difficulty) {
        this.name = name;
        this.classes = classes;
        this.difficulty = difficulty;
    }

    // Getters
    public String getName() {
        return name;
    }

    public List<String> getClasses() {
        return classes;
    }

    public int getDifficulty() {
        return difficulty;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(List<String> classes) {
        this.classes = classes;
    }

    public void setDifficulty(int difficulty) {
        this.difficulty = difficulty;
    }
}