package src.edu.lukyanov.task5;

public class Vet {
    public void treatAnimal(Animal animal) {
        if (animal instanceof Dog) {
            Dog dog = (Dog) animal;
            System.out.printf("%-5s, %-5s, %-5s%n", "Собака ест: " + dog.getFood(),
                    "Собака находится в: " + dog.getLocation(),
                    "Выполняемая команда: " + dog.getCommand());
        } else if (animal instanceof Cat) {
            Cat cat = (Cat) animal;
            System.out.printf("%-5s, %-5s, %-5s%n", "Кошка ест: " + cat.getFood(),
                    "Кошка находится в: " + cat.getLocation(),
                    "Окрас кошки: " + cat.getColor());
        } else if (animal instanceof Horse) {
            Horse horse = (Horse) animal;
            System.out.printf("%-5s, %-5s, %-5s%n", "Лошадь ест: " + horse.getFood(),
                    "Лошадь находится в: " + horse.getLocation(),
                    "Скорость лошади: " + horse.getSpeedMovement());
        }
    }
}
