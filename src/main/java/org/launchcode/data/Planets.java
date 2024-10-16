package org.launchcode.data;

public enum Planets {
    MERCURY("Mercury", 88, 57),
    VENUS("Venus", 225, 108),
    EARTH("Earth", 365, 149),
    MARS("Mars", 687, 228),
    JUPITER("Jupiter", 4333, 780),
    SATURN("Saturn", 10759, 1437),
    URANUS("Uranus", 30687, 2871),
    NEPTUNE("Neptune", 60200, 4530);

    private final String name;

    private final int yearLength;

    private final int distanceFromSun;

    Planets(String name, int yearLength, int distanceFromSun) {
        this.name = name;
        this.yearLength = yearLength;
        this.distanceFromSun = distanceFromSun;
    }

    public String getName() {
        return name;
    }

    public int getYearLength() {
        return yearLength;
    }
}
