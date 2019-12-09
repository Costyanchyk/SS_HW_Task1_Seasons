package HW1_Task2;

import java.util.Scanner;

public class MinMaxValues {
    static boolean starter = true;
    static String currentType;
    public static void main(String[] args) {
        while (starter) {
            MinMaxValues objectName = new MinMaxValues();
            System.out.println("\n\nThis program helps to display max and min values of different type of the variables.");
            objectName.questionToContinue2();
        }
    }

    // scanner + Swift
    public String typeIdentifier() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, write type of variable\n (for example: int, char, bool)\n " +
                "Type <all> command to show result table\n Type <info> for the more information");
        String type = scanner.nextLine().toLowerCase();
        switch (type) {
            case "info":
                System.out.println("Watch next message -->");
                break;
            case "int":
            case "integer":
                System.out.println("The MAX value is:" + Integer.MAX_VALUE);
                System.out.println("The MIN value is:" + Integer.MIN_VALUE);
                break;
            case "byte":
                System.out.println("The MAX value is:" + Byte.MAX_VALUE);
                System.out.println("The MIN value is:" + Byte.MIN_VALUE);
                break;
            case "short":
                System.out.println("The MAX value is:" + Short.MAX_VALUE);
                System.out.println("The MIN value is:" + Short.MIN_VALUE);
                break;
            case "char":
            case "character":
                System.out.println("The MAX value is:" + Character.MAX_VALUE);
                System.out.println("The MIN value is:" + Character.MIN_VALUE);
                break;
            case "long":
                System.out.println("The MAX value is:" + Long.MAX_VALUE);
                System.out.println("The MIN value is:" + Long.MIN_VALUE);
                break;
            case "float":
                System.out.println("The MAX value is:" + Float.MAX_VALUE);
                System.out.println("The MIN value is:" + Float.MIN_VALUE);
                break;
            case "double":
                System.out.println("The MAX value is:" + Double.MAX_VALUE);
                System.out.println("The MIN value is:" + Double.MIN_VALUE);
                break;
            case "bool":
            case "boolean":
                System.out.println("This type of variable has only two literals False and true\n" +
                        "and has range about " + Byte.MAX_VALUE + " " + Byte.MIN_VALUE);
                break;
            case "all":
                System.out.printf("%-9s%-9s%-30s%-12s%n", "number", "type", "MAX length", "MIN Length");
                System.out.println("----------------------------------------------------------------");
                System.out.printf("%-9s%-9s%-30s%-12s%n", "1", "integer", Integer.MAX_VALUE, Integer.MIN_VALUE);
                System.out.printf("%-9s%-9s%-30s%-12s%n", "2", "integer", Integer.MAX_VALUE, Integer.MIN_VALUE);
                System.out.printf("%-9s%-9s%-30s%-12s%n", "3", "byte", Byte.MAX_VALUE, Byte.MIN_VALUE);
                System.out.printf("%-9s%-9s%-30s%-12s%n", "4", "byte", Byte.MAX_VALUE, Byte.MIN_VALUE);
                System.out.printf("%-9s%-9s%-30s%-12s%n", "5", "short", Short.MAX_VALUE, Short.MIN_VALUE);
                System.out.printf("%-9s%-9s%-30s%-12s%n", "6", "short", Short.MAX_VALUE, Short.MIN_VALUE);
                System.out.printf("%-9s%-9s%-30s%-12s%n", "7", "char", Character.MAX_VALUE, Character.MIN_VALUE);
                System.out.printf("%-9s%-9s%-30s%-12s%n", "8", "char", Character.MAX_VALUE, Character.MIN_VALUE);
                System.out.printf("%-9s%-9s%-30s%-12s%n", "9", "long", Long.MAX_VALUE, Long.MIN_VALUE);
                System.out.printf("%-9s%-9s%-30s%-12s%n", "10", "long", Long.MAX_VALUE, Long.MIN_VALUE);
                System.out.printf("%-9s%-9s%-30s%-12s%n", "11", "float", Float.MAX_VALUE, Float.MIN_VALUE);
                System.out.printf("%-9s%-9s%-30s%-12s%n", "12", "float", Float.MAX_VALUE, Float.MIN_VALUE);
                System.out.printf("%-9s%-9s%-30s%-12s%n", "13", "double", Double.MAX_VALUE, Double.MIN_VALUE);
                System.out.printf("%-9s%-9s%-30s%-12s%n", "14", "double", Double.MAX_VALUE, Double.MIN_VALUE);
                break;
            default:
                System.out.println("Write correct type\nExample: int, bool\n");
                typeIdentifier();
        }
        return currentType;
    }
    // question "Do you want to continue"
        public void questionToContinue2 () {
            System.out.println("\nDo you want to continue? <y/n>");
            Scanner scanner2 = new Scanner(System.in);
            String response = scanner2.nextLine();
            if (response.equalsIgnoreCase("y") ||
                    response.equalsIgnoreCase("yes") ||
                    response.equalsIgnoreCase("ye") ||
                    response.equalsIgnoreCase("yeah") ||
                    response.equalsIgnoreCase("+") ||
                    response.equalsIgnoreCase("yea")) {
                typeIdentifier();
            } else {
                System.out.println("Thank you for using my App!!");
                starter = false;
            }
        }
    }




