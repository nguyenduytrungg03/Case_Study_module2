package controllers;

import models.person.Customer;
import models.person.Employee;
import services.CustomerServices;
import services.Impl.CustomerServiceImpl;
import services.Impl.EmployeeServiceImpl;

import java.util.Scanner;

public class FuramaController {
    public static void main(String[] args) {
        displayMainMenu();
    }

    public static void displayMainMenu() {
        boolean check = true;
        while (check) {
            System.out.println("-----**MENU**-----");
            System.out.println("1.Employee Management");
            System.out.println("2.Customer Management");
            System.out.println("3.Facility Management");
            System.out.println("4.Booking Management");
            System.out.println("5.Promotion Management");
            System.out.println("6.EXIT");
            System.out.println("Enter number: ");

            Scanner sc = new Scanner(System.in);

            switch (Integer.parseInt(sc.nextLine())) {
                case 1:
                    displayEmployeeMenu();
                    break;
                case 2:
                    displayCustomer();
                    break;
                case 3:
                    displayFacility();
                    break;
                case 4:
                    displayBooking();
                    break;
                case 5:
                    displayPromotion();
                    break;
                case 6:
                    System.exit(6);
                    break;
            }
        }
    }

    public static void displayEmployeeMenu() {
        EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
        boolean check = true;
        while (check) {
            System.out.println("1.Display list employee");
            System.out.println("2.Add new employee");
            System.out.println("3.Edit employee");
            System.out.println("4.Back to menu");
            Scanner sc = new Scanner(System.in);

            switch (Integer.parseInt(sc.nextLine())) {
                case 1:
                    employeeService.display();
                    break;
                case 2:
                    employeeService.addNew();
                    break;
                case 3:
                    employeeService.edit();
                    break;
                case 4:
                    return;
            }
        }
    }

    public static void displayCustomer() {
        boolean check = true;
        CustomerServices customerServices = new CustomerServiceImpl();
        while (check) {
            System.out.println("1.Display list customers ");
            System.out.println("2.Add new customer");
            System.out.println("3.Edit customer");
            System.out.println("4.Return main menu");
            Scanner sc = new Scanner(System.in);
            switch (Integer.parseInt(sc.nextLine())) {
                case 1:
                    customerServices.display();
                    break;
                case 2:
                    customerServices.addNew();
                    break;
                case 3:
                    customerServices.edit();
                    break;
                case 4:
                    return;
            }

        }
    }

    public static void displayFacility() {
        boolean check = true;
        while (check) {
            System.out.println("1.Display list facility ");
            System.out.println("2.Add new facility");
            System.out.println("3.Edit facility");
            System.out.println("4.Return main menu");
            Scanner sc = new Scanner(System.in);
            switch (Integer.parseInt(sc.nextLine())) {
                case 1:

                case 2:

                case 3:

                case 4:
                    return;
            }

        }
    }

    public static void displayBooking() {
        boolean check = true;
        while (check) {
            System.out.println("1.Display list booking ");
            System.out.println("2.Add new booking");
            System.out.println("3.Edit booking");
            System.out.println("4.Return main menu");
            Scanner sc = new Scanner(System.in);
            switch (Integer.parseInt(sc.nextLine())) {
                case 1:

                case 2:

                case 3:

                case 4:
                    return;
            }

        }
    }

    public static void displayPromotion() {
        boolean check = true;
        while (check) {
            System.out.println("1.Display list customers use service");
            System.out.println("2.Display list customers get voucher");
            System.out.println("3.Return main menu");
            Scanner sc = new Scanner(System.in);
            switch (Integer.parseInt(sc.nextLine())) {
                case 3:
                    return;
            }
        }
    }
}
