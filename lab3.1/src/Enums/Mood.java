package Enums;

public enum Mood {
    HAPPY("радостный"),
    SAD("грустный"),
    ANGRY("сердитый"),
    SCARED("испуганный"),
    EXCITED("взволнованный"),
    NORMAL("нейтральный");

    private String description;

    Mood(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return description;
    }
}