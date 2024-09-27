package lab1;

public class Main {
    public static void main(String[] args) {

        Date birthdate = new Date(15, 5, 2015);
        Date visitDate1 = new Date(20, 9, 2024);
        Date visitDate2 = new Date(25, 9, 2024);

        Owner owner = new Owner("John", "Doe", birthdate);

        Animal animal = new Animal("Max", AnimalType.DOG, owner);

        Visit visit1 = new Visit("Vaccination", 50.0, visitDate1);
        Visit visit2 = new Visit("Check-up", 30.0, visitDate2);
        animal.addVisit(visit1);
        animal.addVisit(visit2);

        animal.displayAnimalInfo();

        System.out.println("Owner's Name: " + owner.getName() + " " + owner.getSurname());
        System.out.println("Number of Visits: " + animal.getVisits().size());
    }
}