package src.edu.lukyanov.task5;

public class Main {

    public static void main(String[] args) {
        Animal[] animals = new Animal[3];
        animals[0] = new Dog("кость", "квартире в городе", "сидеть");
        animals[1] = new Cat("рыбу", "домике в деревне", "черный");
        animals[2] = new Horse("сено", "конюшне", "галоп");

        Vet vet = new Vet();

        for (Animal animal : animals) {
            vet.treatAnimal(animal);
        }
    }
}

