package utils.regex;

import java.util.Scanner;

public class RegexFacility {
    public static final String REGEX_STR = "[A-Z][a-z]+"; //  kiểm tra chữ đầu là ghi hoa
    public static final String REGEX_AMOUNT = "^[1-9]|([1][0-9])|(20)$"; //ktr số lượng người, lớn hơn 1 nhỏ hơn 20
    public static final String REGEX_INT = "^[1-9]|([1][0-9])$"; //ktr tầng(số dương kh đc số âm)
    public static final String REGEX_AREA ="^([3-9]\\d|[1-9]\\d{2,})$"; //ktr diện tích lớn hơn 30
    public static final String REGEX_PRICE = "^[1-9]\\d+"; //ktr giá tiền kh được là số âm
    public static final String REGEX_ID_VILLA = "(SVVL)[-][\\d]{4}"; // ktr đầu vào của villa
    public static final String REGEX_ID_HOUSE = "(SVHO)[-][\\d]{4}"; // ktr đầu vào của house
    public static final String REGEX_ID_ROOM = "(SVRO)[-][\\d]{4}"; //ktr đầu vào của room
    //   ktr email
    public static final String REGEX_EMAIL ="^[A-Za-z0-9+_.-]+@(.+)$";
    //    ktr sdt đầu là số 0
    public static final String REGEX_NUMBERPHONE ="^0[0-9]{9,}$";


    public static String inputIdVilla() {
        System.out.println("Nhập id, mã dịch vụ: ");
        return RegexFacility.regexStr(scanner.nextLine(), RegexFacility.REGEX_ID_VILLA, "Bạn đã nhập sai định dạng, " +
                "mã dịch vụ phải có dang là SVVL-XXXX");
    }
    public static String inputIdHouse(){
        System.out.println("Nhập id, mã dịch vụ: ");
        return RegexFacility.regexStr(scanner.nextLine(), RegexFacility.REGEX_ID_HOUSE,"Bạn đã nhập sai định dạng, " +
                "mã dịch vụ phải có dang là SVHO-XXXX");
    }
    public static String inputRoom(){
        System.out.println("Nhập id, mã dịch vụ: ");
        return RegexFacility.regexStr(scanner.nextLine(), RegexFacility.REGEX_ID_ROOM,"Bạn đã nhập sai định dạng, " +
                "mã dịch vụ phải có dang là SVRO-XXXX");
    }

    public static String inputName() {
        System.out.println("Nhập tên dịch vụ: ");
        return RegexFacility.regexStr(scanner.nextLine(), RegexFacility.REGEX_STR, "Bạn đã nhập sai định dạng," +
                " tên dịch vụ phải viết hoa chữ cái đầu");
    }

    public static String inputArea() {
        System.out.println("Nhập diện tích dịch vụ: ");
        return RegexFacility.regexStr(scanner.nextLine(), RegexFacility.REGEX_AREA, "Bạn đã nhập sai định dạng, " +
                " diện tích phải lớn hơn 30m^2");
    }

    public static String inputCosts(){
        System.out.println("Nhập giá tiền:");
        return  RegexFacility.regexStr(scanner.nextLine(), RegexFacility.REGEX_PRICE,"Bạn đã nhập sai định dạng, " +
                "giá tiền phải là số dương");
    }

    public static String inputMaximumPeople(){
        System.out.println("Nhập số lượng người: ");
        return RegexFacility.regexStr(scanner.nextLine(), RegexFacility.REGEX_AMOUNT,"Bạn đã nhập sai định dạng," +
                " số người phải bắt đầu từ 1-19!! ");
    }

    public static String inputRentalType(){
        System.out.println("Nhập kiểu thuê: ");
        return RegexFacility.regexStr(scanner.nextLine(), RegexFacility.REGEX_STR,"Bạn đã nhập sai định dạng," +
                " kiểu thuê phải bắt đầu bằng ký tự viết hoa");
    }

    public static String inputStandardVilla(){
        System.out.println("Nhập tiêu chuẩn: ");
        return RegexFacility.regexStr(scanner.nextLine(), RegexFacility.REGEX_STR,"Bạn đã nhập sai định dạng, " +
                "tiêu chuẩn phải bắt đầu bằng ký tự viết hoa");
    }

    public static String inputAreaPool(){
        System.out.println("Nhập diện tích hồ bơi: ");
        return RegexFacility.regexStr(scanner.nextLine(), RegexFacility.REGEX_AREA,"Bạn đã nhập sai định dạng, " +
                "diện tích hồ bơi phải lớn hơn 30m^2");
    }

    public static String inputFloor(){
        System.out.println("Nhập số tầng: ");
        return RegexFacility.regexStr(scanner.nextLine(), RegexFacility.REGEX_INT,"Bạn đã nhập sai định dạng, " +
                "số tầng phải bắt đầu bằng số dương ");
    }
    static Scanner scanner = new Scanner(System.in);

    public static String regexStr(String temp, String regex, String error) {
        boolean check = true;
        do {
            if (temp.matches(regex)) {
                check = false;
            } else {
                System.out.println(error);
                temp = scanner.nextLine();
            }
        } while (check);
        return temp;
    }


}

