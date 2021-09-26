import java.util.Calendar;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        int Year = calendar.get(Calendar.YEAR);
        Scanner scan1 = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        System.out.print("Enter name of wine\n");
        String name = scan1.nextLine();
        System.out.print("Enter trademark of wine\n");
        String trademark = scan1.nextLine();
        System.out.print("Enter date of bottling this wine\n");
        int bottlingDate = scan1.nextInt();
        System.out.print("Enter classification of wine\n");
        String classification = scan2.nextLine();

        Wine WineWhite = new Wine(name, trademark, bottlingDate, classification);
        System.out.println("Name - " + WineWhite.getName());
        System.out.println("Trademark - " + WineWhite.getTrademark());
        System.out.println("Bottling Date - " + WineWhite.getBottlingDate());
        System.out.println("Classification - " + WineWhite.getClassification());
        WineWhite.countWineAging(Year);
    }
}
