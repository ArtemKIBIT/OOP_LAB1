package lab1;

import java.util.ArrayList;
import java.util.List;

public class Animal {
    private String name;
    private AnimalType animalType;
    private Owner owner;
    private List<Visit> visits;

    public Animal(String name, AnimalType animalType, Owner owner) {
        this.name = name;
        this.animalType = animalType;
        this.owner = owner;
        this.visits = new ArrayList<>();
    }

    public void addVisit(Visit visit) {
        visits.add(visit);
    }

    public List<Visit> getVisits() {
        return visits; // Додаємо цей метод
    }

    public void displayAnimalInfo() {
        System.out.println("Animal Name: " + name);
        System.out.println("Animal Type: " + animalType);
        owner.displayOwnerInfo();
        System.out.println("Number of Visits: " + visits.size());
        System.out.println("Visits:");
        for (Visit visit : visits) {
            visit.displayVisitInfo();
        }
    }

    public String getName() {
        return name;
    }

    public Owner getOwner() {
        return owner;
    }
}