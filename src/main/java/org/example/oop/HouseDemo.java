package org.example.oop;

public class HouseDemo {
    public static void main(String[] args) {
        House house = new House();
        house.setColor("Blue");
        house.setNumberOfFloors(2);
        house.setNumberOfWindows(16);

        System.out.println(house.getColor());
        System.out.println(house.getNumberOfFloors());
        System.out.println(house.getNumberOfWindows());

        // Using the improved subclass:

        CHouse chouse = new CHouse("Red", 12, 1);
        System.out.println(chouse.toString());
    }

}
