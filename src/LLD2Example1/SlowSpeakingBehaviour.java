package LLD2Example1;

public class SlowSpeakingBehaviour implements SpeakingBehaviour {
    @Override
    public void makeSound() {
        System.out.println("Slow Speaking");
    }
}
