public class DataTypes {
    public static void main(String[] args) {
        // First comment

        // Variables: int
        int numberOfStudents = 30;
        int maxScore = 100;
        System.out.println(numberOfStudents);
        System.out.println(maxScore);

        // Variables: double
        double temperature = 3.4;
        double price = 999.99;
        System.out.println(temperature);
        System.out.println(price);

        //Variables: float
        float pi = 3.14f;
        float radius = 5.5f;
        float area = pi * radius * radius;
        System.out.println(area);

        // Casting
        int areaInteger = (int) area;
        System.out.println(Math.round(area));

        // Char
        char symbol = '$';
        System.out.println(symbol);

        //Exercise
        char A = 65; //A
        char l = 108;
        char i = 105;
        char s = 115;
        char a = 97;
        System.out.println(A);
        System.out.println(l);
        System.out.println(i);
        System.out.println(s);
        System.out.println(a);

        // Boolean is/has (returns true or false)
        boolean isRaining = false;
        boolean hasPassedExercise = true;
        boolean isSummer = false;
        System.out.println(isRaining);
        System.out.println(hasPassedExercise);
        System.out.println(isSummer);
    }
}
