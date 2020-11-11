package lesson6;

public class Cat extends Animal{

    public Cat(String typeOfAnimal) {
        super(typeOfAnimal);
    }

    public boolean swim(int length) {
        System.out.println("Кошки не умеют плавать");
        return false;
    }
}
