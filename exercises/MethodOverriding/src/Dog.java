public class Dog extends Animal{

    @Override   // it is a good practice to let other users to know that this method is an overriding
    void speak() {
        System.out.println("The dog goes *bark*");
    }
}
