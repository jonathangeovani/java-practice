package package2;
import package1.*;

public class C {
    B b = new B();

    public C(){
        showAccess();
    }

    void showAccess(){
        System.out.println("---Class C | Package 2---");
        System.out.println(b.publicMessage);
        //System.out.println(b.protectedMessage);   This class have no access to the protectedMessage;
        //System.out.println(b.defaultMessage);   This class have no access to the defaultMessage;
        //System.out.println(b.privateMessage);   This class have no access to the privateMessage;
    }
}
