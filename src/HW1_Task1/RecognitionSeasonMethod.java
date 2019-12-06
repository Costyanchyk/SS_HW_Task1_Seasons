package HW1_Task1;

import java.util.Scanner;

public class RecognitionSeasonMethod extends AppSeasonIdentifier {
        public String IdentSeason(String a){
        switch (a) {
        case "december":
        case "january":
        case "february":
        System.out.println("This is " + ListOfSeasons.WINTER + " buddy!!!");
        break;
        case "june":
        case "july":
        case "august":
        System.out.println("This is " + ListOfSeasons.SUMMER + " buddy!!!");
        break;
        case "september":
        case "october":
        case "november":
        System.out.println("This is " + ListOfSeasons.AUTUMN + " buddy!!!");
        break;
        case "march":
        case "april":
        case "may":
        System.out.println("This is " + ListOfSeasons.SPRING + " buddy!!!");
        break;
        default:
        System.out.println("Please write correct month buddy!!!");
                Scanner scanner = new Scanner(System.in);
                String text = scanner.nextLine();
                String modMonth = text.toLowerCase(); //transit variable
        a = IdentSeason(modMonth);
    }
    return a;
}
}
