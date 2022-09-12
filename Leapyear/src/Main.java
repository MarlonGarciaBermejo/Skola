import java.util.Scanner;
public class Main {
    private static Scanner sc;
    public static void main(String[] args) {
        int year;
        sc = new Scanner(System.in);
        System.out.println("Ange ett årtal: ");
        year = sc.nextInt();
        if (( year%400 == 0)|| (( year%4 == 0 ) &&( year%100 != 0))) {
            System.out.format("%d Är ett skottår.", year);
        }
        else {
            System.out.format("%d Är inte ett skottår.", year);
        }
    }
}