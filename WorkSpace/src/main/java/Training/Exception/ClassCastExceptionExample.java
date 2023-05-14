package Training.Exception;

abstract class Animal {
    protected abstract String getName();
}

class Mammal extends Animal {
    @Override
    protected String getName() {
        return "Mammal";
    }
}
class Amphibian extends Animal {
    @Override
    protected String getName() {
        return "Amphibian";
    }
}

class Dog extends Mammal {
    @Override
    protected String getName() {
        return "Dog";
    }
}
class Frog extends Amphibian {
    @Override
    protected String getName() {
        return "Frog";
    }
}

public class ClassCastExceptionExample {
    public static void main(String[] args) {
        birth(new Dog());
        birth(new Frog());
        System.out.println("main exit ...");
    }
    public static void birth(Animal animal) {

//        try {
//            Mammal mammal = (Mammal) animal;
//            System.out.println(mammal.getName() + " give birth to young");
//        } catch (ClassCastException e) {
//            //System.out.println(e.getMessage());
//        }
//
//        try {
//            Amphibian amphibian = (Amphibian) animal;
//            System.out.println(amphibian.getName() + " lay eggs");
//        } catch (ClassCastException e) {
//            //System.out.println(e.getMessage());
//        }

        if (animal instanceof Mammal) {
            System.out.println(animal.getName() + " give birth to young");
        } else if (animal instanceof  Amphibian) {
            System.out.println(animal.getName() + " lay eggs");
        } else {
            throw new ClassCastException();
        }

    }
}