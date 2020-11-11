package lesson7;

public class Cat {

    private final String name;
    private final int appetite;
    private boolean fullness;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite=appetite;
        fullness=false;
        System.out.println("Кот " + name + " аппетит = " + appetite
                + " Сыт? = " + fullness);
    }

    public void eat(Plate plate) {
        int h = plate.decreaseFood(appetite);
        if (!fullness)
            fullness = 0 ==h;
    }

    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", appetite=" + appetite +
                ", isFull=" + fullness +
                '}';
    }


}
