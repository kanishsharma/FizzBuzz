/**
 * Solve the FizzBuzz challenge.
 */
class FizzBuzz {

    public static void main(String[] args) {

        for (int i = 1; i < 100; i++) { // essentially three conditions set in one line compared to Python

            // Find out which numbers divide i.
            boolean divisibleBy3 = i % 3 == 0; // Functions seem to be defined with = exclusively instead of a bdoy
            boolean divisibleBy5 = i % 5 == 0;

            // Print our appropriate result.
            if (divisibleBy3 && divisibleBy5) { // The "and" statement is represented by &&

                System.out.println("Fizz Buzz"); // print() is a more specific function in Java

            } else if (divisibleBy3) { // Instead of using tabs or spaces, you need to use {} for functions?

                System.out.println("Fizz");

            } else if (divisibleBy5) {

                System.out.println("Buzz");

            } else {

                System.out.println(i);

            }
        }
    }
}
