package wed.funwithfunctions;

/**
 *
 * @author john
 */
public class WedFunWithFunctions {

    public static void printWelcomeMessage(String name, int age) {
        System.out.println("Hello " + name + " you are " + age + " years old");
    }
    
    public static void printWelcomeMessage(String firstName, String lastName) {
        System.out.println("Hello " + firstName + " " + lastName + "!");
    }
    
    // Pure Function
    public static int doubleValue(int value) {
        return value * 2;
    }
    
    // Side-effecty Function
    public static int getRandomNumber() {
        return (int)(Math.random() * 100.0);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String name = "John";
        int age = 37;
        printWelcomeMessage(name, age);
        printWelcomeMessage("John", "Haley");
        int originalValue = 2;
        int doubledValue = doubleValue(originalValue);
        System.out.println(doubledValue);
        System.out.println(getRandomNumber());
        System.out.println(getRandomNumber());
    }
    
}
