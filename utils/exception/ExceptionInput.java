package utils.exception;

import java.util.Scanner;

public class ExceptionInput {
    public static Scanner scanner = new Scanner(System.in);

    // kiểm tra giới tính (employee) ,(customer)
    public static String getGender() {
        while (true) {
            try {
                int gender = Integer.parseInt(scanner.nextLine());
                if (gender == 1) {
                    return "Nam";
                } else if (gender == 2) {
                    return "Nữ";
                }
            } catch (NumberFormatException e) {
                System.err.println("Nhâp số:");
            }
        }
    }

    //ktr trình đôh học vấn (employee)
    public static String getAcademyLevel() {
        while (true) {
            try {
                int academyLevel = Integer.parseInt(scanner.nextLine());
                if (academyLevel == 1) {
                    return "Trung Cấp";
                } else if (academyLevel == 2) {
                    return "Cao Đẳng";
                } else if (academyLevel == 3) {
                    return "Đại Học";
                } else if (academyLevel == 4) {
                    return "sau Đại Học";
                }
            } catch (NumberFormatException e) {
                System.err.println("Nhập số: ");
            }
        }
    }

    // ktr chức vụ (employee)
    public static String getPosition() {
        while (true) {
            try {
                int position = Integer.parseInt(scanner.nextLine());
                if (position == 1) {
                    return "Lễ Tân";
                } else if (position == 2) {
                    return "Phục Vụ";
                } else if (position == 3) {
                    return "Chuyên Viên";
                } else if (position == 4) {
                    return "Giám Sát";
                } else if (position == 5) {
                    return "Quản Lý";
                } else if (position == 6) {
                    return "Giám Đốc";
                }
            } catch (NumberFormatException e) {
                System.err.println("Nhập số");
            }
        }
    }

    public static String type() {
        while (true) {
            try {
                int position = Integer.parseInt(scanner.nextLine());
                if (position == 1) {
                    return " Diamond ";
                } else if (position == 2) {
                    return " Platinium ";
                } else if (position == 3) {
                    return " Gold ";
                } else if (position == 4) {
                    return " Silver ";
                } else if (position == 5) {
                    return " Member ";
                } else {
                    System.out.println("Nhập Lại");
                }
            } catch (NumberFormatException e) {
                System.err.println("Nhập số");
            }
        }
    }

}
