package Models;

public class Champions {
    private String name;
    private List<String> classes;
    private int difficulty;

    public Champions(String name, List<String> classes, int difficulty) {
        this.name = name;
        this.classes = classes;
        this.difficulty = difficulty;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
