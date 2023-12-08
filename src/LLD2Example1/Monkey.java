package LLD2Example1;

public class Monkey extends Animal implements Walkable {
    WalkingBehaviour walkingBehaviour;

    Monkey(WalkingBehaviour walkingBehaviour) {
        this.walkingBehaviour = walkingBehaviour;
    }

    @Override
    public void walk() {
        this.walkingBehaviour.walk();
    }
}
