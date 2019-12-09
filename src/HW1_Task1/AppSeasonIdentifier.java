package HW1_Task1;

import java.util.Scanner;

public class AppSeasonIdentifier {
    static String currentSeason;
    static boolean starter = true;

    public static void main(String[] args) {

        AppSeasonIdentifier objectName = new AppSeasonIdentifier();
        while (starter) {
            System.out.println("\n\nThis app helps to identify the season.\n");
            objectName.questionToContinue();
        }
    }

    // scanner + Swift
    public String identifierSeason() {
        System.out.println("What is the current month ?\n");
        Scanner scanner = new Scanner(System.in);
        String month = scanner.nextLine().toLowerCase();

        switch (month) {
            case "december":
            case "january":
            case "february":
                System.out.println("This is " + ListOfSeasons.WINTER + " buddy ****!!!\n");
                break;
            case "june":
            case "july":
            case "august":
                System.out.println("This is " + ListOfSeasons.SUMMER + " buddy!!!\n");
                break;
            case "september":
            case "october":
            case "november":
                System.out.println("This is " + ListOfSeasons.AUTUMN + " buddy!!!\n");
                break;
            case "march":
            case "april":
            case "may":
                System.out.println("This is " + ListOfSeasons.SPRING + " buddy!!!\n");
                break;
            default:
                System.out.println("Please write correct month buddy!!!\nFor Example: May, April");
                identifierSeason();
        }
        return currentSeason;
    }


    // question "Do you want to continue"
    public void questionToContinue() {
        System.out.println("\nDo you want to continue? <y/n>");
        Scanner scanner = new Scanner(System.in);
        String response = scanner.nextLine();
        if (response.equalsIgnoreCase("y") ||
                response.equalsIgnoreCase("yes") ||
                response.equalsIgnoreCase("ye") ||
                response.equalsIgnoreCase("yeah") ||
                response.equalsIgnoreCase("+") ||
                response.equalsIgnoreCase("yea")) {
            identifierSeason();
        } else {
            System.out.println("Thank you for using my App!!");
            starter = false;
        }
    }


    // list of seasons
    public enum ListOfSeasons {
        WINTER, AUTUMN, SPRING, SUMMER
    }
}




