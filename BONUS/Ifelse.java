package BONUS;

public class Ifelse {

    public static void main(String[] args) {
        EvenOddChecker(0);
        System.out.println(Grader(13));
        System.out.println(PickLargestNumber(2,4));
        positiveNegativeZeroChecker(0);
        ageChecker("Atl", 16);
        LeapYearChecker(1984);
    }

    //1. Een methode dat als input een getal van de gebruiker accepteert en controleert of het even of oneven is en dit print.
    private static void EvenOddChecker(int number) {
        if (number % 2 == 0) {
            System.out.println(number + " is even");
        } else {
            System.out.println(number + " is odd");
        }
    }

    //2. Een methode dat een cijfer van een student accepteert (tussen 1 en 10)
    // en op basis van dat cijfer een bijbehorende letterwaarde toekent (A, B, C, D, F).
    private static String Grader(int numbericalGrade) {
        String Grade;
        if (numbericalGrade == 1) {
            Grade = "F-";
        } else if (numbericalGrade == 2) {
            Grade = "F";
        } else if (numbericalGrade == 3) {
            Grade = "D";
        } else if (numbericalGrade == 4) {
            Grade = "D+";
        } else if (numbericalGrade == 5) {
            Grade = "C";
        } else if (numbericalGrade == 6) {
            Grade = "C+";
        } else if (numbericalGrade == 7) {
            Grade = "B";
        } else if (numbericalGrade == 8) {
            Grade = "B+";
        } else if (numbericalGrade == 9) {
            Grade = "A";
        } else if (numbericalGrade == 10) {
            Grade = "A++! Great job!";
        } else {
            Grade = "Please enter a valid number.";
        }

        return Grade;
    }

    //3. Een programma dat de grootste van twee ingevoerde getallen bepaalt.
    private static String PickLargestNumber(int numberA, int numberB)
    {
        if (numberA > numberB)
        {
            return numberA + " is larger than " + numberB;
        }
        else if (numberB > numberA)
        {
            return numberB + " is larger than " + numberA;
        }
        else if (numberA == numberB)
        {
            return numberA + " is equal to " + numberB;
        }
        else
        {
            return "Something went wrong! Try again!";
        }
    }

    //4. Positief/Negatief/Zero Checker
    private static void positiveNegativeZeroChecker(int number)
    {
        if (number > 0)
        {
            System.out.println("The number " + number + " is positive");
        }
        else if (number < 0 )
        {
            System.out.println("The number " + number + " is negative");
        }
        else if (number == 0)
        {
            System.out.println("The number " + number + " is zero, which isn't negative or positive!");
        }
    }

    //5. Een methode dat de leeftijd van een persoon accepteert en bepaalt of die persoon een kind, puber, volwassene of senior is.
    private static void ageChecker(String name, int age)
    {
        if (age < 2)
        {
            System.out.println(name + " is a little baby");
        }

        else if (age < 12)
        {
            System.out.println(name + " is a child");
        }

        else if (age < 21)
        {
            System.out.println(name + " is pubescent");
        }

        else if (age < 65)
        {
            System.out.println(name + " is an adult");
        }

        else
        {
            System.out.println(name + " is a senior");
        }
    }

    //6. Tekstlengte Checker
    private static void TextLengthCheck(String text)
    {
        if (text.length() < 10)
        {
            System.out.println("This text is short.");
        }

        else if (text.length() < 20)
        {
            System.out.println("This text is medium length.");
        }

        else if (text.length() > 20)
        {
            System.out.println("TL;DR");
        }
    }

    //7: Schrikkeljaar?
    private static void LeapYearChecker(int year)
    {
        if(year % 4 == 0 && year % 100 != 0)
        {
            System.out.println("The year " + year + " is a leap year");
        }

        else if(year % 400 == 0)
        {
            System.out.println("The year " + year + " is a leap year");
        }

        else
        {
            System.out.println("The year " + year + " is NOT a leap year");
        }
    }
}
