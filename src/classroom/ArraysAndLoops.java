package classroom;

import java.sql.SQLOutput;
import java.util.Arrays;

public class ArraysAndLoops {
    public static void main(String[] args) {

        // Array
        // Bread; Milk; Eggs; Fruits;

        String[] shoppingList = {"Bread", "Milk", "Eggs", "Fruits"};

        int[] grades = {7, 9, 10, 6, 5, 4};

        String[] seasons = {"Summer", "Winter", "Autumn", "Spring"};

        String eggs =shoppingList[2];
        System.out.println(eggs);

        System.out.println(grades[4]);

        grades[0] = 2;
        System.out.println(grades[0]);
        // Print all grades
        System.out.println(Arrays.toString(grades));

        // Create empty array;
        int[] emptyArray = new int[4];
        // [0] [0] [0] [0]
        System.out.println(Arrays.toString(emptyArray));
        emptyArray[0] = 1;
        emptyArray[1] = 2;
        emptyArray[2] = 3;
        emptyArray[3] = 4;
        System.out.println(Arrays.toString(emptyArray));

        // Create String array with names;
        // Name count should be 5;
        // And print them all;

       String[] names = {"Alisa", "Edvard", "Massimo", "Memo", "Julia"};
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);
        System.out.println(names[4]);
        System.out.println(Arrays.toString(names));

        // Create empty double array with size of 5;
        // Print empty array;
        // Update each array value from 0 to a number of your choice;
        // Print them all;

        double[] emptyArrayDouble = new double[5];
        System.out.println(Arrays.toString(emptyArrayDouble));
        emptyArrayDouble[0]=1.11;
        emptyArrayDouble[1]=2.22;
        emptyArrayDouble[2]=3.33;
        emptyArrayDouble[3]=4.44;
        emptyArrayDouble[4]=5.55;
        System.out.println(Arrays.toString(emptyArrayDouble));

        // Print numbers from 0 to 10;

        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }

        // Calculate sum from 1 to 100;
        // Example: 1 + 2 + 3 + 4 + n...;
        int summa = 0;
        for (int i = 1; i <= 100; i++) {
            summa = summa + i;
        }
        System.out.println("Sum: " + summa);

        // for ->

        // print elements we said

        for(int i = 0; i < 2; i++) {
            System.out.println(shoppingList[i]);
        }

        System.out.println(""); // this is printed space

        // print all the elements

        for (String s : shoppingList) {
            System.out.println(s);
        }

        // Print numbers from 10 to 0;

        for(int i = 10; i >= 0; i--) {
            System.out.println(i);
        }

        int counter = 10;
        while (counter >= 0) {
            System.out.println(counter);
            counter = counter - 1;
        }

        // Exercise: Print even numbers from 2 to 100;
        // Print in one line all the numbers;

        for (int i = 2; i <=100; i = i + 2){
            System.out.println(i + " ");
        }
        System.out.println(" ");

        for (int i = 2; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " ");
            }
        }
    }
}
