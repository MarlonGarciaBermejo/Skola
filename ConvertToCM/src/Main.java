import java.util.Scanner; // importerar scanner

public class Main {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);    // Skriv in vilket värde du vill få omvandalat i cm
        System.out.println("Välj mellan famnar, alnar, tum och fot för att se längden i cm:");
        String val1 = sc1.nextLine();

        Scanner sc2 = new Scanner(System.in);    // Skriv in längden, tex. Hur många fot
        System.out.println("Skriv in längd:");
        float val2 = sc2.nextFloat();

        if (val1.equals("famnar")) {
            System.out.println(val2 + " famn = " + 182.8f * val2 + " i cm.");
        } else if (val1.equals("alnar")) {
            System.out.println(val2 + "aln = " + 59.4f * val2 + " i cm.");
        }
        if (val1.equals("tum")) {
            System.out.println(val2 + " tum = " + 2.5f * val2 + " i cm.");
        } else if (val1.equals("fot")) {
            System.out.println(val2 + "fot = " + 30.5f * val2 + " i cm.");
        }

    }
}