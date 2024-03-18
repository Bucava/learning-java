package Homework;

public class FirstHomeWork {
    public static void main(String[] args) {

        /** Task nr.1
         Easy peasy: Write a Java program that checks if a given number is positive.
         If it is, print "Positive number." **/
        int number = 10;
        if (number > 0) {
            System.out.println("Positive number.");
        }

        // Task nr.2
        // Odd or even: Create a Java program that determines if a given integer is even.
        // If it is, print "Even number."
        if (number % 2 == 0) {
            System.out.println("Even number");
        }
        // Task nr.3
        // Age group classifier: Write a Java program that classifies a person into different
        // age groups based on their age. If the age is less than 18, print "Teenager,"
        // otherwise print "Adult."
        int age = 24;
        if (age < 18) {
            System.out.println("Teenager");
        } else {
            System.out.println("Adult");
        }

        //Task nr.4
        // Leap year checker: Create a Java program that checks if a given year is a leap year.
        // If it is, print "Leap year." (How to calculate: https://www.wikihow.com/Calculate-Leap-Years)
        int year = 2024;
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("Leap year");
        } else {
            System.out.println("Not a Leap year");
        }

        // Task nr.5
        // Multiple conditions: Write a Java program that checks if a given number is positive,
        // even, and less than 100. If all conditions are true, print "Valid number."
        int number2 = 243;
        if (number2 > 0 && number2 < 100 && number2 % 2 == 0) {
            System.out.println("Valid number");
        } else {
            System.out.println("Invalid number");
        }

        //Task nr.6
        // Nested conditions: Create a Java program that checks if a number is positive,
        // and if so, check if it's even. If both conditions are true, print "Positive and Even."
        int number3 = 22;
        if (number3 > 0) {
            if (number3 % 2 == 0) {
                System.out.println("Positive and Even");
            } else {
                System.out.println("Positive and Odd");
            }
        }

        // Task nr.7
        // Character type identifier: Write a Java program that determines if a given
        // character is a vowel. If it is, print "Vowel." (Use variable with data type: char.
        // When checking character use == and ||)
        char myChar = 'D';
        if (myChar == 'a' || myChar == 'e' || myChar == 'i' || myChar == 'o' || myChar == 'u' || myChar == 'A' || myChar == 'E' || myChar == 'I' || myChar == 'O' || myChar == 'U') {
            System.out.println("Vowel");
        } else {
            System.out.println("Not a vowel");
        }

        // Task nr. 8
        // BMI calculator: Create a Java program that calculates BMI (Body Mass Index)
        // and categorizes it into different ranges. Print the category based on the BMI.
        // Formula: bmi = weight / (height * height);
        int weight = 64;
        float height = 1.75f;
        float bmi = weight / (height * height);
        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            System.out.println("Normal");
        } else if (bmi >= 25 && bmi <= 29.9) {
            System.out.println("Overweight");
        } else if (bmi >= 30 && bmi <= 34.9) {
            System.out.println("Obese");
        } else if (bmi >= 35) {
            System.out.println("Extremly obese");
        }

        // Task nr.9
        // Write a Java program that calculates the final grade for a student based on
        // their scores in three subjects: Math, Science, and English.
        // The program should take input scores for each subject and calculate the average.
        // Assign a final grade based on the following criteria:
        //•	If the average score is 90 or above, assign a grade of "A."
        //•	If the average score is between 80 and 89, assign a grade of "B."
        //•	If the average score is between 70 and 79, assign a grade of "C."
        //•	If the average score is between 60 and 69, assign a grade of "D."
        //•	If the average score is below 60, assign a grade of "F."
        int mathScore = 87;
        int scienceScore = 89;
        int englishScore = 86;
        int avgScore = (mathScore + scienceScore + englishScore)/3;
        char grade;
        if (avgScore >= 90) {
            grade = 'A';
        } else if (avgScore > 80 && avgScore < 90) {
            grade = 'B';
        } else {
            grade = 'F';
        }
        System.out.println(grade);


        //Task nr.10
        // File extension checker: Write a Java program that takes a filename as input
        // and checks if it has a valid file extension. Assume valid extensions are
        // ".txt", ".doc", and ".pdf". If the file has a valid extension, print
        // "Valid file extension," otherwise print "Invalid file extension." (check for mouthod: https://www.w3schools.com/java/ref_string_endswith.asp);
        String filename = "somefile.txt";
        if (filename.endsWith(".txt") || filename.endsWith(".pdf") || filename.endsWith(".doc")) {
            System.out.println("Vaild file extension");
        } else {
            System.out.println("Invalid file extension");
        }
      }
    }
