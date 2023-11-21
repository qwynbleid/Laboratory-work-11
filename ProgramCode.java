/**
 * Provides the classes necessary for the HelloWorld application.
 */
package hello.world;
/**
 * The HelloWorld class prints "Hello World!" to the console.
 */
public final class HelloWorld {

    /**
     * Private constructor to prevent instantiation.
     */
    private HelloWorld() {
        // Utility classes should not have public or default constructors
    }

    /**
     * The main method that prints "Hello World!" to the console.
     *
     * @param args The command line arguments.
     */
    public static void main(final String[] args) {
        // Parameter args should be final
        System.out.println("Hello World!");
    }
}
