package Enums;

public enum Places {
    CIRCUS("цирк"),
    CAGE("клетка"),
    ZOO("зоопарк"),
    NEARCAGE("около клетки");


    private String title;

    Places(String title) {
        this.title=title;
    }
    @Override
    public String toString(){
        return title;
    }
}

