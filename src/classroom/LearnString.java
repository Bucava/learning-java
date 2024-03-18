package classroom;

public class LearnString {
    public static void main(String[] args) {

        // String
        String name = "Alisa";
        String lastName = "Romanova";

        System.out.println(name);
        System.out.println(lastName);

        // Exercise: Print name and surname (Example: John Doe);
        // Concatenation
        String fullName = name + " " + lastName; // Alisa Romanova
        System.out.println(fullName);

        // Same example
        System.out.println(fullName + " " + lastName);

        System.out.println(String.format("%s  %s", name, lastName));

        //Can save into variable
        String myFullName = String.format(String.format("%s  %s", name, lastName));
        System.out.println(myFullName);

        //Hello, world!
        String hello = "Hello, ";
        String world = "world!";

        String helloWorld = hello.concat(world);
        System.out.println(helloWorld);

        //Exercise:
        // Step 1: Declare a string variable with your name;
        // Step 2: Decalre a string variable with your favorite programing language
        // Step 3: Concatenate the two strings to form a massage 'My name is {ALisa}. I love coding in {PLANGUAGE}';
        // Step 4: Print it out;

        String myName = "My name is Alisa. ";
        String language = "I love coding in JAVA!";
        String nameLove = myName.concat(language);
        System.out.println(nameLove);

    }
}