package package1;
import package2.*;

public class B {

    public String publicMessage = "This is public";             // visible to all classes
    protected String protectedMessage = "This is protected";    // only visible to this package, this class and its subclasses
    String defaultMessage = "This is the default";              // only visible to this package and this class
    private String privateMessage = "This is private";          // only visible to this class

    void showAccess() {
        System.out.println("---Class B | Package 1---");
        System.out.println(publicMessage);
        System.out.println(protectedMessage);
        System.out.println(defaultMessage);
        System.out.println(privateMessage); // The private message is visible only to this class
    }
}