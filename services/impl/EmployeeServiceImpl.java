package services.impl;


import models.person.Employee;
import services.EmployeeServices;
import utils.exception.ExceptionInput;
import utils.ReadAndWrite;
import utils.regex.RegexPerson;

import java.util.ArrayList;
import java.util.List;


import static controllers.FuramaController.scanner;
import static utils.ReadAndWrite.reWriteToFileEmployee;

public class EmployeeServiceImpl implements EmployeeServices {
    public static List<Employee> employeeList = getEmployeeList();
    final static String EMPLOYEE_LIST = "src\\data\\employee.csv";



    @Override
    public void display() {
        for (Employee item : employeeList) {
            System.out.println(item);
        }
    }

    public static List<Employee> getEmployeeList() {
        List<String[]> listStr = ReadAndWrite.readFile(EMPLOYEE_LIST);

        List<Employee> listFileEmployee = new ArrayList<>();
        for (String[] item : listStr) {
            listFileEmployee.add(new Employee(Integer.parseInt(item[0]),
                    item[1], item[2],
                    item[3], item[4],
                    item[5], item[6],
                    item[7], item[8],
                    item[9], Integer.parseInt(item[10])));
        }
        return listFileEmployee;
    }

    @Override
    public void addNew() {
        System.out.println("nhập id: ");
        int id = RegexPerson.regexId();
        if (isExisted(id) != null) {
            System.out.println("id này đã có rồi");
            return;
        } else {
            System.out.println("nhập tên: ");
            String name = scanner.nextLine();

            String dateOfBirth = RegexPerson.regexAge();


            System.out.println("nhập địa chỉ: ");
            String address = scanner.nextLine();


            System.out.println("1.Nam" + "  " + "2.Nữ");
            System.out.println("nhập giới tính: ");
            String gender = ExceptionInput.getGender();


            System.out.println("Nhập chứng minh thư: ");
            String idCard = scanner.nextLine();


            String phoneNumber = RegexPerson.regexNumberPhone();


            String email = RegexPerson.regexEmail();


            System.out.println("1.Trung cấp" + "," + " 2.Cao Đẳng" + "," + " 3.Đại học" + "," + " 4.Sau đại học");
            System.out.println("Nhập học vấn:");
            String academyLevel = ExceptionInput.getAcademyLevel();


            System.out.println(" 1.Lễ tân " + "," + " 2.Phục vụ" + "," + " 3.Chuyên viên" + "," + " 4.Giám sát" + "," + " 5.Quản lý" + "," + " 6.Giám đốc");
            System.out.println("Nhập vị trí: ");
            String position = ExceptionInput.getPosition();

            System.out.println("Nhập lương");
            int salary = Integer.parseInt(scanner.nextLine());
            Employee employee = new Employee(id, name,
                    dateOfBirth, address, gender,
                    idCard, phoneNumber,
                    email, academyLevel,
                    position, salary);
            employeeList.add(employee);

            ReadAndWrite.writerFile(EMPLOYEE_LIST, employee.writeToFile());
            System.out.println("Thêm thành công ^^");

        }
    }

    @Override
    public void edit() {
        System.out.println("Nhập id muốn sửa: ");
        int id = Integer.parseInt(scanner.nextLine());
        boolean check = true;
        for (int i = 0; i < employeeList.size(); i++) {
            if (id == employeeList.get(i).getId()) {
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
                reWriteToFileEmployee(employeeList,EMPLOYEE_LIST);
                System.out.println("sửa thành công");
                check = false;
                break;
            }
        }
        if (check) {
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
