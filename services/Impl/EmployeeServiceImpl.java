package services.Impl;


import models.person.Employee;
import services.EmployeeServices;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeServices {
    public static List<Employee> employeeList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    static {
        Employee employee = new Employee(1,"Tùng","21/02/1999","ĐN","nam","124567","099238422","dbgoics@gmail.com","Đại Học","Lễ Tân",100000);
        employeeList.add(employee);

    }

    @Override
    public void display() {
        for (Employee item : employeeList) {
            System.out.println(item);
        }
    }

    @Override
    public void addNew() {
        System.out.println("nhập id: ");
        int id = Integer.parseInt(scanner.nextLine());
        if (isExisted(id) != null) {
            System.out.println("id này đã có rồi");
            return;
        }else {
            System.out.println("nhập tên: ");
            String name = scanner.nextLine();

            System.out.println("nhập ngày tháng năm sinh: ");
            String dateOfBirth = scanner.nextLine();

            System.out.println("nhập địa chỉ: ");
            String address = scanner.nextLine();

            System.out.println("nhập giới tính: ");
            String gender = scanner.nextLine();

            System.out.println("Nhập chứng minh thư: ");
            String idCard = scanner.nextLine();

            System.out.println("nhập số điện thoại: ");
            String phoneNumber = scanner.nextLine();

            System.out.println("Nhập gmail: ");
            String email = scanner.nextLine();

            System.out.println("[Trung cấp" + "," + " Cao Đẳng" + "," + " Đại học" + "," + " Sau đại học]");
            System.out.println("Nhập trình độ học vấn");
            String academyLevel = scanner.nextLine();


            System.out.println("[Lễ tân " + "," + " Phục vụ" + "," + " Chuyên viên" + "," + " Giám sát" + "," + " Quản lý" + "," + " Giám đốc]");
            System.out.println("Nhập vị trí: ");
            String position = scanner.nextLine();

            System.out.println("Nhập lương");
            int salary = Integer.parseInt(scanner.nextLine());
            System.out.println("Thêm thành công ^^");

            employeeList.add(new Employee(id, name,
                    dateOfBirth, address, gender,
                    idCard, phoneNumber,
                    email, academyLevel,
                    position, salary));
        }
    }

    @Override
    public void edit() {
        System.out.println("Nhập id muốn sửa: ");
        int id = Integer.parseInt(scanner.nextLine());
        boolean check = true;
        for (int i = 0; i <employeeList.size() ; i++) {
            if (id == employeeList.get(i).getId()){
                System.out.println("Nhập tên muốn sửa: ");
                employeeList.get(i).setName(scanner.nextLine());
                System.out.println("Nhập lại ngày sinh: ");
                employeeList.get(i).setDateOfBirth(scanner.nextLine());
                System.out.println("Nhập địa chỉ muốn sửa: ");
                employeeList.get(i).setAddress(scanner.nextLine());
                System.out.println("Nhập giới tính muốn sửa: ");
                employeeList.get(i).setGender(scanner.nextLine());
                System.out.println("Nhập CMND muốn sửa: ");
                employeeList.get(i).setIdCard(scanner.nextLine());
                System.out.println("Nhập SDT muốn sửa: ");
                employeeList.get(i).setPhoneNumber(scanner.nextLine());
                System.out.println("Nhập Email muốn sửa: ");
                employeeList.get(i).setEmail(scanner.nextLine());
                System.out.println("[Trung cấp" + "," + " Cao Đẳng" + "," + " Đại học" + "," + " Sau đại học]");
                System.out.println("Nhập trình độ học vấn: ");
                employeeList.get(i).setAcademyLevel(scanner.nextLine());
                System.out.println("[Lễ tân " + "," + " Phục vụ" + "," + " Chuyên viên" + "," + " Giám sát" + "," + " Quản lý" + "," + " Giám đốc]");
                System.out.println("Nhập vị trí muốn sửa: ");
                employeeList.get(i).setPosition(scanner.nextLine());
                System.out.println("Nhập số tiền lương muốn sửa: ");
                employeeList.get(i).setSalary(Integer.parseInt(scanner.nextLine()));
                System.out.println("sửa thành công");
                check= false;
                break;
            }
            }if (check){
            System.out.println("Nhập lại đi...Id không có trong danh sách!!!");
        }
    }


    @Override
    public Employee isExisted(int id) {
        for (Employee item : employeeList) {
            if (item.getId() == id) {
                return item;
            }
        }
        return null;
    }
}
