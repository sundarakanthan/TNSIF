package oxygenplants;

import java.util.Scanner;

class Room {
    private double length;
    private double breadth;

    public Room(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double calculateArea() {
        return (length / 100) * (breadth / 100); // Convert cm to m and calculate area
    }
    public double getLength() {
        return length;
    }

    public double getBreadth() {
        return breadth;
    }
}

class Plant {
    private double area;

    public Plant(double area) {
        this.area = area;
    }

    public int calculateMaxPlants(Room room) {
        double maxPlantsArea = room.calculateArea() * 10; // Each plant requires 0.1 square meters
        return (int) (maxPlantsArea / area) * 10; // Round to the nearest and lowest multiple of 10
    }

    public double calculateOxygenProduction(int totalPlants) {
        return totalPlants * 0.9; // Each mature plant produces 0.9 liters of oxygen per day
    }

    public double getArea() {
        return area;
    }
}

public class OxygenProductionCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read room dimensions
        System.out.print("Enter length of the room in cm: ");
        double length = scanner.nextDouble();
        if (length <= 0) {
            System.out.println("Invalid length");
            return;
        }

        System.out.print("Enter breadth of the room in cm: ");
        double breadth = scanner.nextDouble();
        if (breadth <= 0) {
            System.out.println("Invalid breadth");
            return;
        }

        // Read plant area
        System.out.print("Enter area occupied by each plant in cm2: ");
        double plantArea = scanner.nextDouble();
        if (plantArea <= 0) {
            System.out.println("Invalid plant area");
            return;
        }

        // Create room and plant objects
        Room room = new Room(length, breadth);
        Plant plant = new Plant(plantArea);

        // Calculate maximum number of plants and oxygen production
        int maxPlants = plant.calculateMaxPlants(room);
        double oxygenProduction = plant.calculateOxygenProduction(maxPlants);

        // Output results
        System.out.printf("Maximum number of plants that can be placed in the room: %d " , maxPlants);
        System.out.printf("Total production of oxygen per day: %.2f liters\n " , oxygenProduction);

        scanner.close();
    }
}
