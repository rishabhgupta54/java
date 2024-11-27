public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Shero");
        dog.breath();
        dog.eat();

        Parrot parrot = new Parrot("Mitthu");
        parrot.breath();
        parrot.eat();
        parrot.fly();

        Penguin penguin = new Penguin("Emperor");
        penguin.breath();
        penguin.eat();
        penguin.fly();
    }
}
