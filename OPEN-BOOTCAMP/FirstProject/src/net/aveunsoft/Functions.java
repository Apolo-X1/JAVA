package net.aveunsoft;

public class Functions {
    public static void main(String[] args) {
        
        helloWorld();
        greetUser("David");
    }

    //function that show hello world
    private static void helloWorld() {
        System.out.println("Hello World!");
    }

    //function that show greet
    private static void greetUser(String name) {
        System.out.println("Hello" + name);
    }
}
