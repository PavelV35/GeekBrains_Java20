package lesson7;

public class Plate {
    private int food;

    public Plate (int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public int decreaseFood(int n) {
        if (food <= n) {
            food = 0;
            return n - food;
        } else {
            food -= n;
            return 0;
        }
    }

    public void addFood(int n) {
        if (n > 0) food += n;
        else System.out.println("Положи еду обратно!");
    }

}
