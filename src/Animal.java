public class Animal {
    String food;
    String location;

    public Animal(String food, String location) {
        this.food = food;
        this.location = location;
    }

    public void makeNoise() {
        System.out.println("Such an animal is sleeping");
    }

    public void eat() {
        System.out.println("Animal is eating " + food);
    }

    public void sleep() {
        System.out.println("Animal is sleeping");
    }
}


class Dog extends Animal {
    String breed;

    public Dog(String food, String location, String breed) {
        super(food, location);
        this.breed = breed;
    }

    @Override
    public void makeNoise() {
        System.out.println("Dog is barking");
    }

    @Override
    public void eat() {
        System.out.println("Dog is eating " + food);
    }
}


class Cat extends Animal {
    boolean hasFur;

    public Cat(String food, String location, boolean hasFur) {
        super(food, location);
        this.hasFur = hasFur;
    }

    @Override
    public void makeNoise() {
        System.out.println("Cat is meowing");
    }

    @Override
    public void eat() {
        System.out.println("Cat is eating " + food);
    }
}

class Horse extends Animal {
    String color;

    public Horse(String food, String location, String color) {
        super(food, location);
        this.color = color;
    }

    @Override
    public void makeNoise() {
        System.out.println("Horse is neighing");
    }

    @Override
    public void eat() {
        System.out.println("Horse is eating " + food);
    }
}

class Veterinary {
    public void treatAnimal(Animal animal) {
        System.out.println("food: " + animal.food);
        System.out.println("llocation: " + animal.location);
    }
}
