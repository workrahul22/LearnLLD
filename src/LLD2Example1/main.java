package LLD2Example1;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        Dog d = new Dog(new FastWakingBehaviour(), new SlowSpeakingBehaviour());
        Cat c = new Cat(new SlowSpeakingBehaviour());
        Monkey m = new Monkey(new SlowWalkingBehaviour());

        List<Walkable> w = new ArrayList<Walkable>();
        w.add(d);
        w.add(m);

        List<Audible> a = new ArrayList<Audible>();
        a.add(d);
        a.add(c);

        for(Walkable ws: w) {
            ws.walk();
        }

        for(Audible ad: a) {
            ad.makeSound();
        }
    }
}
