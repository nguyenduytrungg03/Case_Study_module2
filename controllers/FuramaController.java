package controllers;

import services.CustomerServices;
import services.impl.CustomerServiceImpl;
import services.impl.EmployeeServiceImpl;
import services.impl.FacilityServiceImpl;

import java.io.IOException;
import java.util.Scanner;

import static utils.exception.ExceptionMenu.*;

public class FuramaController {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        displayMainMenu();
    }

    public static void displayMainMenu() {
        while (true) {
            System.out.println("-----**MENU**-----");
            System.out.println("1.Employee Management");
            System.out.println("2.Customer Management");
            System.out.println("3.Facility Management");
            System.out.println("4.Booking Management");
            System.out.println("5.Promotion Management");
            System.out.println("6.EXIT");
            System.out.println("Enter number: ");

            try {
                switch (Integer.parseInt(scanner.nextLine())) {  // 1 -> 6   a 7>
                    case 1:
                        displayEmployeeMenu();
                        break;
                    case 2:
                        displayCustomer();
                        break;
                    case 3:
                        displayFacilityMenu();
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
                    default:
                        System.out.println("Retry");
                }
            } catch (NumberFormatException e ) {
                System.out.println("Please enter number");
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
            try {

                switch (Integer.parseInt(scanner.nextLine())) {
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
                    default:
                        System.out.println("Retry");
                        break;
                }
            } catch (NumberFormatException e) {
                System.err.println("Please enter number");
            }
        }
    }

    public static void displayCustomer() {
        boolean check = true;
        CustomerServices customerServices = new CustomerServiceImpl();
        while (true) {
            System.out.println("1.Display list customers ");
            System.out.println("2.Add new customer");
            System.out.println("3.Edit customer");
            System.out.println("4.Return main menu");
            try {
                switch (Integer.parseInt(scanner.nextLine())) {
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
                    default:
                        System.out.println("Retry");
                        break;
                }
            } catch (NumberFormatException e) {
                System.err.println("Please enter number");
            }
        }
    }

    public static void displayFacilityMenu() {
        FacilityServiceImpl facilityService = new FacilityServiceImpl();
        boolean check = true;
        while (true) {
            System.out.println("1.Display list facility ");
            System.out.println("2.Add new facility");
            System.out.println("3.Display list facility Maintenance");
            System.out.println("4.Return main menu");
            try {
                switch (Integer.parseInt(scanner.nextLine())) {
                    case 1:
                        facilityService.display();
                        break;
                    case 2:
                        addNewFacilityMenu();
                        break;
                    case 3:

                    case 4:
                        return;
                    default:
                        System.out.println("Retry");
                        break;
                }
            } catch (NumberFormatException e) {
                System.err.println("Please enter number");
            }
        }
    }

    public static void addNewFacilityMenu() {
        FacilityServiceImpl facilityService = new FacilityServiceImpl();
        boolean check = true;
        while (check) {
            System.out.println("1.Add new House");
            System.out.println("2.Add new Room");
            System.out.println("3.Add new Villa");
            System.out.println("4.Return main menu");
            try {
                switch (Integer.parseInt(scanner.nextLine())) {
                    case 1:
                        facilityService.addNewHouse();
                        check = false;
                        break;
                    case 2:
                        facilityService.addNewRoom();
                        check = false;
                        break;
                    case 3:
                        facilityService.addNewVilla();
                        check = false;
                        break;
                    case 4:
                        return;
                    default:
                        System.out.println("Retry");
                        break;
                }
            } catch (NumberFormatException e) {
                System.err.println("Please enter number");
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
            try {
                switch (Integer.parseInt(scanner.nextLine())) {
                    case 1:

                    case 2:

                    case 3:

                    case 4:
                        return;
                    default:
                        System.out.println("Retry");
                        break;
                }
            } catch (NumberFormatException e) {
                System.err.println("Please enter number");
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
            try {
                switch (Integer.parseInt(scanner.nextLine())) {
                    case 3:
                        return;
                    default:
                        System.out.println("Retry");
                        break;
                }
            } catch (NumberFormatException e) {
                System.err.println("Please enter number");
            }
        }
    }
}