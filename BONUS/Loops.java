package BONUS;
import java.util.ArrayList;
import java.util.List;

public class Loops {
    public static void main(String[] args) {
        sumOfAllEvenNumbers();
        powerOfTwo();
        findNR45();
        sumOfAllInts();
        PrintAllStringsInList();
        printAllLargerThan45();
        countDownFrom10();
        Fibonacci();
        Triangle();
    }

    //1. Je moet de som van alle even getallen berekenen van 1 tot 100.
    private static void sumOfAllEvenNumbers() {
        List<Integer> numbers1to100 = new ArrayList<Integer>();

        //Make the list
        int i = 1;
        while (i < 101) {
            System.out.println("Add number to array: " + i);
            numbers1to100.add(i);
            i++;
        }

        //Add up all even numbers
        int Sum = 0;
        for (int number : numbers1to100) {
            if (number % 2 == 0) {
                Sum = Sum + number;
            }
        }

        //Print to console
        System.out.println("The sum of all the even numbers is: " + Sum);
    }

    //2. Je wilt een reeks van getallen afdrukken, beginnend bij 1 en elke keer vermenigvuldigd met 2, totdat het resultaat groter is dan 1000.
    private static void powerOfTwo() {
        int i = 1;
        while (i < 1000) {
            System.out.println(i);
            i = i * 2;
        }
    }

    //3. Je moet een lijst van getallen doorlopen en controleren of het getal 45 aanwezig is.
    private static void findNR45() {
        List<Integer> listOfNumbers = new ArrayList<>(List.of(17, 92, 3, 89, 55, 86, 24, 34, 67, 76, 81, 50, 59, 30, 14, 33, 83, 87, 38, 70, 9, 78, 91, 46, 53, 64, 25, 69, 29, 84, 22, 16, 79, 40, 21, 18, 68, 75, 2, 26, 39, 8, 31, 35, 1, 63, 77, 95, 15, 58, 61, 10, 85, 93, 96, 72, 98, 5, 73, 6, 23, 56, 49, 99, 43, 41, 20, 11, 12, 74, 57, 66, 94, 36, 7, 60, 88, 4, 65, 27, 28, 82, 32, 97, 48, 62, 80, 37, 13, 54, 19, 71, 42, 44, 90, 52, 51));

        for (int number : listOfNumbers) {
            if (number == 45) {
                System.out.println("Number 45 found!");
                return;
            }
        }

        System.out.println("Number 45 not found");
    }

    //4. Je wilt een array van integers doorlopen en de som van de elementen berekenen.
    private static void sumOfAllInts() {
        List<Integer> listOfNumbers = new ArrayList<>(List.of(12, 5, 7, 2, 18, 3, 9, 12));
        int Sum = 0;

        for (int number : listOfNumbers) {
            Sum = Sum + number; //Ik weet dat ik ook Sum += number kan doen, maar vind dit makkelijker te lezen :p Vergeef me.
        }

        System.out.println("The sum of all the numbers in the list: " + Sum);
    }

    //5. Je hebt een lijst van strings en je wilt elk element afdrukken totdat je een lege string tegenkomt.
    private static void PrintAllStringsInList() {
        List<String> listOfStrings = new ArrayList<>(List.of("Er", "was", "eens", "een", "student", "die", "graag", "wilde", "leren", "", "Deze", "student", "haalde", "goede", "cijfers"));

        for (String word : listOfStrings) {
            if (word == null || word.isEmpty()) {
                return;
            } else {
                System.out.println(word);
            }
        }

    }

    //7. Je hebt een lijst van integers en je wilt elk element afdrukken dat groter is dan 45.
    private static void printAllLargerThan45() {
        List<Integer> listOfNumbers = new ArrayList<>(List.of(17, 92, 3, 89, 55, 86, 24, 34, 67, 76, 81, 50, 59, 30, 14, 33, 83, 87, 38, 70, 9, 78, 91, 46, 53, 64, 25, 69, 29, 84, 22, 16, 79, 40, 21, 18, 68, 75, 2, 26, 39, 8, 31, 35, 1, 63, 77, 95, 15, 58, 61, 10, 85, 93, 96, 72, 98, 5, 73, 6, 23, 56, 49, 99, 43, 41, 20, 11, 12, 74, 57, 66, 94, 36, 7, 60, 88, 4, 65, 27, 28, 82, 32, 97, 48, 62, 80, 37, 13, 54, 19, 71, 42, 44, 90, 52, 51));

        for (int number : listOfNumbers) {
            if (number > 45) {
                System.out.println(number);
            }
        }
    }

    //8. Je wilt een teller implementeren die begint bij 10 en wordt verminderd met 1 totdat het gelijk is aan 0.
    private static void countDownFrom10() {
        int i = 10;
        while (i >= 0) {
            System.out.println(i);
            i--;
        }
    }

    //9. Je moet de eerste 10 Fibonacci-getallen genereren. (tip: google is je vriend)
    private static void Fibonacci() {
        int PreviousNr1 = 0;
        int PreviousNr2 = 1;
        int FibonacciNr = 0;

        int i = 0;
        while (i <= 10) {
            FibonacciNr = PreviousNr1 + FibonacciNr;
            PreviousNr1 = PreviousNr2;
            PreviousNr2 = FibonacciNr;

            System.out.println(FibonacciNr);
            i++;
        }
    }

    //10. Je wilt een driehoek afdrukken met behulp van sterretjes, waarbij het aantal sterretjes in elke rij toeneemt. (tip: google is je vriend)
    private static void Triangle() {
        String blankSpace = "            ";
        String stars = "*";
        int rows = 1;

        while (rows < 10) {
            System.out.println(blankSpace + stars);

            stars += "**";
            blankSpace = blankSpace.substring(0, blankSpace.length() - 1);

            rows++;
        }
    }
}

