package Object.Chapter01;

public class Audience {
    private Bag bag;

    private Audience(Bag bag) {
        this.bag = bag;
    }

    public Bag getBag() {
        return bag;
    }
}
