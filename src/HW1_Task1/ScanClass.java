package HW1_Task1;

import java.util.Scanner;

public class ScanClass {
    public void ScanMethod(ScanClass variable) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String modMonth = text.toLowerCase(); //create transit variable
        System.out.println(modMonth);
        scanner.close();
    }
}
