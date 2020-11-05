package lesson6;

public class AnimalAct {
    public static void main(String[] args) {
        Dog dog1  = new Dog("Собака 1");
        dog1.runLimit = 150;
        dog1.run(300);
        dog1.jumpLimit = 100;
        dog1.jumping_obstacle(50);
        dog1.swimLimit=50;
        dog1.swim(100);

        Dog dog2  = new Dog("Собака 2");
        dog2.runLimit = 1500;
        dog2.run(200);
        dog2.jumpLimit = 10;
        dog2.jumping_obstacle(50);
        dog2.swimLimit=500;
        dog2.swim(100);

        Cat cat1  = new Cat("Кошка 1");
        cat1.runLimit = 150;
        cat1.run(200);
        cat1.jumpLimit = 100;
        cat1.jumping_obstacle(50);
        cat1.swim(500);

        Cat cat2  = new Cat("Кошка 2");
        cat2.runLimit = 1500;
        cat2.run(200);
        cat2.jumpLimit = 10;
        cat2.jumping_obstacle(50);
        cat2.swim(100);
    }
}
