package services.impl;

import models.person.Customer;
import services.CustomerServices;
import utils.exception.ExceptionInput;
import utils.ReadAndWrite;
import utils.regex.RegexPerson;

import java.util.ArrayList;;
import java.util.List;
import java.util.Scanner;

import static utils.ReadAndWrite.reWriteToFileCustomer;

public class CustomerServiceImpl implements CustomerServices {
    private static List<Customer> customerList = getCustomerList();
    private Scanner scanner = new Scanner(System.in);
    final static String CUSTOMER_LIST = "src\\data\\customer.csv";
    Customer customer;
    @Override
    public void display() {
        for (Customer customer : customerList) {
            System.out.println(customer);
        }
    }
    public static List<Customer> getCustomerList() {
        List<String[]> listStr = ReadAndWrite.readFile(CUSTOMER_LIST);

        List<Customer> listFileCustomer = new ArrayList<>();
        for (String[] item : listStr) {
            listFileCustomer.add(new Customer(Integer.parseInt(item[0]),
                    item[1],
                    item[2],
                    item[3],
                    item[4],
                    item[5],
                    item[6],
                    item[7],
                    item[8]));
        }
        return listFileCustomer;
    }

    @Override
    public void addNew() {
        int id;
        while (true) {
            System.out.println("nhập id: ");
            id = Integer.parseInt(scanner.nextLine());
            if (isExisted(id) != null) {
                System.out.println("id này đã có rồi");
            } else {
                break;
            }
        }

        System.out.println("nhập tên : ");
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

        System.out.println("1.Diamond" + "," + " 2.Platinium" + "," + " 3.Gold" + "," + " 4.Silver" + "," + " 5.Member");
        System.out.println("Nhập loại khách: ");
        String type = ExceptionInput.type();


        customerList.add(new Customer(id, name, dateOfBirth, address, gender, idCard, phoneNumber, email, type));

        String line = id + "," +
                name + "," +
                dateOfBirth + "," +
                address + ","
                + gender + ","
                + idCard + ","
                + phoneNumber + ","
                + email + "," + type;
        List<String> stringList = new ArrayList<>();
        stringList.add(line);
        ReadAndWrite.writerFile(CUSTOMER_LIST, stringList);

        System.out.println("Thêm mới thành công ^^");


    }

    @Override
    public void edit() {
        System.out.println("Nhập id muốn sửa: ");
        int id = Integer.parseInt(scanner.nextLine());
        boolean check = true;
        for (int i = 0; i < customerList.size(); i++) {
            if (id == customerList.get(i).getId()) {

                System.out.println("Nhập tên muốn sửa: ");
                customerList.get(i).setName(scanner.nextLine());

                customerList.get(i).setDateOfBirth(RegexPerson.regexAge());

                System.out.println("Nhập địa chỉ muốn sửa: ");
                customerList.get(i).setAddress(scanner.nextLine());

                System.out.println("1.Nam" + "  " + "2.Nữ");
                System.out.println("nhập giới tính: ");
                customerList.get(i).setGender(ExceptionInput.getGender());

                System.out.println("Nhập CMND muốn sửa: ");
                customerList.get(i).setIdCard(scanner.nextLine());

                System.out.println("Nhập SDT muốn sửa: ");
                customerList.get(i).setPhoneNumber(RegexPerson.regexNumberPhone());

                System.out.println("Nhập Email muốn sửa: ");
                customerList.get(i).setEmail(RegexPerson.regexEmail());

                System.out.println("1.Diamond" + "," + " 2.Platinium" + "," + " 3.Gold" + "," + " 4.Silver" + "," + " 5.Member");
                System.out.println("Nhập loại khách muốn sửa: ");
                customerList.get(i).setType(ExceptionInput.type());

                System.out.println("Đã sửa thành công ^^");
                reWriteToFileCustomer(customerList, CUSTOMER_LIST);
                check = false;
                break;
            }
        }
        if (check) {
            System.out.println("Nhập lại đi...Id không có trong danh sách!!!");
        }
    }


    @Override
    public Customer isExisted(int id) {
        for (Customer item : customerList) {
            if (item.getId() == id)
                return item;
        }
        return null;
    }
}

