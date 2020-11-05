package lesson6;
/*
1. Создать классы Собака и Кот с наследованием от класса Животное.

2. Животные могут выполнять действия: бежать, плыть, перепрыгивать препятствие. В качестве параметра каждому методу
 передается величина, означающая или длину препятствия (для бега и плавания), или высоту (для прыжков).

3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; прыжок: кот 2 м.,
 собака 0.5 м.; плавание: кот не умеет плавать, собака 10 м.).

4. При попытке животного выполнить одно из этих действий, оно должно сообщить результат в консоль.
 (Например, dog1.run(150); -> результат: run: true)

5. * Добавить животным разброс в ограничениях. То есть у одной собаки ограничение на бег может быть 400 м., у другой 600 м.

 */

public abstract class Animal {

    protected float runLimit;
    protected float jumpLimit;
    protected float swimLimit;
    private String typeOfAnimal;

    public Animal(String typeOfAnimal) {
        this.typeOfAnimal = typeOfAnimal;
    }

    public boolean run(float distance) {
        boolean result = distance <= runLimit;
        System.out.println(typeOfAnimal + " run: " + result);
        return result;
    }

    public boolean jumping_obstacle(float height) {
        boolean result = height <= jumpLimit;
        System.out.println(typeOfAnimal + " jump: " + result);
        return result;
    }

    public boolean swim(float distance) {
        boolean result = distance <= swimLimit;
        System.out.println(typeOfAnimal + " jump: " + result);
        return result;
    }

}
