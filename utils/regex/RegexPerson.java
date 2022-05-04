package utils.regex;

import utils.exception.ExceptionService;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.regex.Pattern;

public class RegexPerson {
//    kiểm tra ngày tháng năm sinh
    private static final String REGEX_BIRTH_DAY = "^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(\\/|-|\\.)(?:0?[13-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|-|\\.)0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$";

    public static Scanner scanner = new Scanner(System.in);


    public static String regexNumberPhone(){
        System.out.println("Nhập sdt: ");
            return RegexFacility.regexStr(scanner.nextLine(),RegexFacility.REGEX_NUMBERPHONE,"Định dạng sai," +
                                                                                                    " sdt phải có số 0 ở đầu");
             }
    public static String regexEmail(){
        System.out.println("Nhập gmail: ");
        return RegexFacility.regexStr(scanner.nextLine(),RegexFacility.REGEX_EMAIL,"Định dạng sai," +
                                                                           " nhập lại gamil đi (vd:dbgoics@gmail.com)");
    }



    public static String regexAge() {
        System.out.println("Nhập ngày tháng năm sinh");
        String temp= scanner.nextLine();
        boolean check = true;
        while (check) {
            try {
                if (Pattern.matches(REGEX_BIRTH_DAY, temp)) {
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyy");
                    LocalDate age = LocalDate.parse(temp, formatter);
                    LocalDate now = LocalDate.now();
                    int current = Period.between(age, now).getYears();
                    if (current < 100 && current > 18) {
                        check = false;
                    } else {
                        throw new ExceptionService("Tuổi phải lớn hơn 18 và bé hơn 100");
                    }
                } else {
                    throw new ExceptionService("Định dạng nhập vào không đúng");
                }
            } catch (ExceptionService e) {
                System.out.println(e.getMessage());
                temp = scanner.nextLine();
            }
        }
        return temp;
    }

    public static int regexId(){
        while (true){
            try {
                int id = Integer.parseInt(scanner.nextLine());
                return id;
            }catch (NumberFormatException e){
                System.err.println("id phai la so, vui long nhap lai");
            }
        }
    }

}
