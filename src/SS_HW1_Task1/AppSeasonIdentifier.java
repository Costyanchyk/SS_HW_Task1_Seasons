package SS_HW1_Task1;

import java.util.Scanner;

public class AppSeasonIdentifier {
    public static void main(String[] args) {
        MetSeasonIde m = new MetSeasonIde();
        System.out.println("What is the current month ?");

        //

        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String modMonth = text.toLowerCase(); //create transit variable

        System.out.println(m.IdentSeason(modMonth));
    }
}



