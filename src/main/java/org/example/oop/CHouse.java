package org.example.oop;

public class CHouse extends House {
    public CHouse(String color, int windows, int floors) {
        setColor(color);
        setNumberOfFloors(floors);
        setNumberOfWindows(windows);
    }

    public String toString() {
        return "\nColor: " + getColor() + "\nFloors: " + getNumberOfFloors() + "\nWindows: " + getNumberOfWindows();
    }
}
