package utils.exception;

import static controllers.FuramaController.scanner;

public class ExceptionMenu {
    public static int exceptionDisplayMainMenu() {
        while (true) {
            try {
                int number = Integer.parseInt(scanner.nextLine()); // xu ly nhap chu
                if (number < 1 || number > 6) { //xu ly so ko co trong menu
                    throw new ExceptionService("so ban nhap khong co trong menu, thu lai");
                }
                return number;
            } catch (NumberFormatException e) {
                System.err.println("Phai nhap so, vui long nhap lai");
            } catch (ExceptionService e) {
                System.err.println(e.getMessage());
            }
        }
    }
}
