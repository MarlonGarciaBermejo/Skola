import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Välkommen, här finns 4 alternativ att välja på!");

        while (true) {
            menyalternativ();
            String val1 = sc1.nextLine();
            if (val1.equals("1")) {
                System.out.println("Addera två tal");
                addera(sc1);
            } else if (val1.equals("2")) {
                System.out.println("Räkna bokstäverna i strängen");
                count(sc1);
            } else if (val1.equals("3")) {
                System.out.println("Spegelvänd en sträng");
                spegel(sc1);
            }else if (val1.equals("4")) {
                System.out.println("Summera alla tal i en sträng");
                summera(sc1);
            } else if (val1.equals("e")) {
                System.out.println("Hej Då!");
                break;
            }

        }

    }

    private static void menyalternativ() {
        System.out.println("Vad vill du göra nu?");
        System.out.println("1. Addera två tal.");
        System.out.println("2. Räkna bokstäver i en sträng");
        System.out.println("3. Spegelvänd en sträng");
        System.out.println("4. Summera alla tal i en sträng");
        System.out.println("e. Avsluta");
    }

    static void count(Scanner sc1) {
        System.out.println("Ange det ord du vill leta i: ");
        String ord = sc1.nextLine();

        System.out.println("Ange bokstaven du letar efter: ");
        char bokstav = sc1.nextLine().charAt(0);

        int antal = 0;
        for (int i = 0; i < ord.length(); i++) {
            if (ord.charAt(i) == bokstav) {
                antal++;
            }
        }
        System.out.format("Det finns %d %s i word %s. \n", antal, bokstav, ord);
    }

    static void spegel(Scanner sc1) {
        System.out.println("Skriv ut en sträng: ");
        String sträng = sc1.nextLine();

        String spegel = "";
        for (int i = sträng.length() - 1; i >= 0; i--) {
            spegel = spegel + sträng.charAt(i);
        }
        System.out.println(spegel);

    }

    static void summera(Scanner sc1) {
        System.out.println("Skriv en sträng med siffror och kommatecken: ");
        String[] numbers = sc1.nextLine().split("[, ]+");

        int summa = 0;
        for (String numbers1 : numbers){
            summa += Integer.parseInt(numbers1);
        }
        System.out.println("Värdet blir: " + summa);
    }

    static void addera(Scanner sc1) {
        System.out.println("Välj första talet: ");
        int firstNum = sc1.nextInt();
        System.out.println("Andra talet: ");
        int SecondNum = sc1.nextInt();

        System.out.println("Summan är: " + (firstNum + SecondNum));
        sc1.nextLine();
    }
}