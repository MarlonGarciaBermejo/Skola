public class Main {

    public static void main(String[] args) {
        // Nummer 1 till 100
        // Jämt delbart med 3 : Fizz
        // Jämt delbart med 5 : Buzz
        // Jämt delbart med 3 och 5 : FizzBuzz
        // Printa enbart numret

        for (int i = 0; i <= 100; i++) {
            if( (i % 3 == 0) && (i % 5 == 0) ) {
                System.out.println("FizzBuzz");
            } else if( i % 3 == 0) {
                System.out.println("Fizz");
            } else if(i % 5 == 0) {
                System.out.println("Buzz");

            } else {
                System.out.println(i);
            }

        }

    }
}