package package1;
import package2.*;

public class A {
    public static void main(String[] args) {

        B b = new B();

        // Showing the access of Class A
        System.out.println("---Class A | Package 1---");
        System.out.println(b.publicMessage);
        System.out.println(b.protectedMessage);
        System.out.println(b.defaultMessage);
        //System.out.println(b.privateMessage);   This class have no access to the privateMessage;

        b.showAccess();
        Bsub bsub = new Bsub();
        C c = new C();

    }
}
