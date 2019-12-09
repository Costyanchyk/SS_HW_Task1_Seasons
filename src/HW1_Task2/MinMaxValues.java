package HW1_Task2;

import java.util.Scanner;

public class MinMaxValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Привет как тебя зовут?"); //pe of variable\n (for example: int, char, bool)\n Type <all> command to show result table\n Type <info> for more information");
        String type = scanner.nextLine();
        String modType = type.toLowerCase(); //create transit variable for LowerCase transformation
        System.out.println("Hello, " + modType);
        System.out.println("где ти живеш?"); //pe of variable\n (for example: int, char, bool)\n Type <all> command to show result table\n Type <info> for more information");
        String type1 = scanner.nextLine();
        System.out.println("Ого, " + type1 + " это круто!");
    }
}
            /* switch (modType) {
                case "info":
                    System.out.println("Hello, " + modType); // this program helps to display max and min values of different type of the variables");
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
                    System.out.println("This type of variable has only two literals False and true\nand has range about " + Byte.MAX_VALUE + " " + Byte.MIN_VALUE);
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
                    System.out.println("Please write correct number");

            }
        }
    }*/


       /*
        ArrayList <String> values = new ArrayList <String>();
        values.add ("The MAX value is: " + Integer.MAX_VALUE);
        values.add ("The MIN value is: " + Integer.MIN_VALUE);
        values.add ("The MAX value is: " + Byte.MAX_VALUE);
        values.add ("The MIN value is: " + Byte.MIN_VALUE);
        values.add ("The MAX value is: " + Short.MAX_VALUE);
        values.add ("The MIN value is: " + Short.MIN_VALUE);
        values.add ("The MAX value is: " + Character.MAX_VALUE);
        values.add ("The MIN value is: " + Character.MIN_VALUE);
        values.add ("The MAX value is: " + Long.MAX_VALUE);
        values.add ("The MIN value is: " + Long.MIN_VALUE);
        values.add ("The MAX value is: " + Float.MAX_VALUE);
        values.add ("The MIN value is: " + Float.MIN_VALUE);
        values.add ("The MAX value is: " + Double.MAX_VALUE);
        values.add ("The MIN value is: " + Double.MIN_VALUE);

        for (String a: values ) {

            System.out.println(a);
            */



