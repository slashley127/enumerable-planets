package org.launchcode.enumerableplanets;

public enum Planets {
    MERCURY("Mercury", 88),
    VENUS("Venus", 225),
    EARTH("Earth", 365),
    MARS("Mars", 687),
    JUPITER("Jupiter", 4333),
    SATURN("Saturn", 10759),
    URANUS("Uranus", 30687),
    NEPTUNE("Neptune", 60200);

    private final String displayName;
    private final Integer yearLength;

    Planets(String displayName, Integer yearLength) {
        this.displayName = displayName;
        this.yearLength = yearLength;
    }

    public String getDisplayName() {
        return displayName;
    }

    public Integer getYearLength() {
        return yearLength;
    }
}


