package LLD2Example1;

public class Cat extends Animal implements Audible {
    SpeakingBehaviour speakingBehaviour;
    Cat(SpeakingBehaviour speakingBehaviour) {
        this.speakingBehaviour = speakingBehaviour;
    }

    @Override
    public void makeSound() {
        this.speakingBehaviour.makeSound();
    }
}
