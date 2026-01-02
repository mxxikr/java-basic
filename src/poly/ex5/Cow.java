package poly.ex5;

import poly.ex4.AbstractAnimal;

public class Cow implements InterfaceAnimal {
    @Override
    public void sound() {
        System.out.println("음매");
    }

    @Override
    public void move() {
        System.out.println("소 이동");
    }
}