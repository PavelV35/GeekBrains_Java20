package lesson7;

import java.util.Arrays;

public class Act {

    public static void main(String[] args) {

        Cat[] cats = new Cat[3];
        cats[0] = new Cat("Дымка", 10);
        cats[1] = new Cat("Васька", 40);
        cats[2] = new Cat("Брысь", 55);

        Plate plate = new Plate(55);

        for (int i=0; i<=cats.length; i++){
            if (plate.getFood() > 0) {

                cats[i].eat(plate);
                System.out.println("Осталось в тарелке еды = " + plate.getFood());
            }
        }

        System.out.println(Arrays.toString(cats));
    }
}


