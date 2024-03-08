public class Main {
    public static void main(String[] args) {
        int number = 6;
        int input1 = 4;
        int input2 = 20;
        String name = "Henk";

        hello();
        positiveOrNegative(number);
        positiveOrZeroOrNegative(number);
        bartender(name);
        sum(input1, input2);
    }

    private static void hello() {
        System.out.println("Hello, world!");
    }

    private static void positiveOrNegative(int number) {
        if (number > 0) {
            System.out.println("This number is positive!");
        } else if (number < 0) {
            System.out.println("This number is negative!");
        }
    }

    private static void positiveOrZeroOrNegative(int number) {
        if (number > 0) {
            System.out.println("This number is positive!");
        } else if (number == 0) {
            System.out.println("This number is zero");
        } else if (number < 0) {
            System.out.println("This number is negative!");
        }
    }

    private static void bartender(String name) {
        switch (name) {
            case "Zarra":
                System.out.println(name + " likes to drink coffee or tea");
                break;
            case "Shay":
                System.out.println(name + " likes to drink cola or sparkling water");
                break;
            case "Basil":
                System.out.println(name + " is a ferret and should only drink water!");
            case "Nick":
                System.out.println(name + " likes to drink beer");
            case "Marga":
                System.out.println(name + " likes to drink fruit juice");
            case "Roel":
                System.out.println(name + " likes to drink whiskey");
            default:
                System.out.println("We don't know what " + name + " likes to drink! Ask them!");
        }
    }

    private static void sum(int input1, int input2) {
        System.out.println(input1 + "+" + input2 + "=" + (input1 + input2));
    }
}
