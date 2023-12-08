package LLD2Example1;

public class Dog extends Animal implements Walkable, Audible {

    WalkingBehaviour walkingBehaviour;
    SpeakingBehaviour speakingBehaviour;
    Dog(WalkingBehaviour walkingBehaviour, SpeakingBehaviour speakingBehaviour) {
        this.walkingBehaviour = walkingBehaviour;
        this.speakingBehaviour = speakingBehaviour;
    }

    @Override
    public void walk() {
        this.walkingBehaviour.walk();
    }

    @Override
    public void makeSound() {
        this.speakingBehaviour.makeSound();
    }
}
