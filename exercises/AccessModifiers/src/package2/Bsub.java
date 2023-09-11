package package2;
import package1.*;

public class Bsub extends B {

    public Bsub(){
        showAccess();
    }

    void showAccess(){
        System.out.println("---Class Bsub | Package 2--");
        System.out.println(publicMessage);
        System.out.println(protectedMessage);
        //System.out.println(defaultMessage);   This class have no access to the defaultMessage;
        //System.out.println(privateMessage);   This class have no access to the privateMessage;
    }
}
