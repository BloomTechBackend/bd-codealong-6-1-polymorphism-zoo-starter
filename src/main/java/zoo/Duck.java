package zoo;

import java.util.Random;
import java.util.Set;
import static zoo.Food.*;

public class Duck implements Flyer, Swimmer, Eater, Mover, Talker {
    private static final Food[] duckFoods =
            {ALGAE, BUGS, FRUIT, FISH, CARROTS, GRASS, VEGETABLES};
    @Override
    public String eat(Food food) {
        for (Food duckFood : duckFoods) {
            if (food == duckFood) {
                return talk();
            }
        }
        throw new IllegalArgumentException(String.format("Ducks don't eat %s", food));
    }

    @Override
    public String fly() {
        return "...flies with other ducks in a V";
    }

    @Override
    public String move() {
        // this would best be based on context, but here we just randomly choose
        int randomInt = (new Random()).nextInt(3);
        if (randomInt == 0) {
            return this.walk();
        } else if (randomInt == 1) {
            return this.fly();
        } else {
            return this.swim();
        }
    }

    @Override
    public String swim() {
        return "paddle paddle paddle";
    }

    public String walk() {
        return "waddle waddle waddle";
    }
    @Override
    public String talk() {
        return "quack quack quack";
    }
}
