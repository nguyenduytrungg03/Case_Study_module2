package services.Impl;

import models.person.Customer;
import services.CustomerServices;

import java.util.ArrayList;;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements CustomerServices {
    private  static List<Customer> customerList = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    @Override
    public void display() {
        for (Customer customer: customerList) {
            System.out.println(customer);
        }
    }

    @Override
    public void addNew() {
        System.out.println("nhập id: ");
        int id = Integer.parseInt(scanner.nextLine());
        if (isExisted(id) != null) {
            System.out.println("id này đã có rồi");
            return;
        } else {
            System.out.println("nhập tên : ");
            String name = scanner.nextLine();

            System.out.println("nhập ngày sinh: ");
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

            System.out.println("[Diamond" + "," + " Platinium" + "," + " Gold" + "," + " Silver" + "," + " Member]");
            System.out.println("Nhập loại khách: ");
            String type = scanner.nextLine();
            System.out.println("Thêm mới thành công ^^");

            customerList.add(new Customer(id, name, dateOfBirth, address, gender, idCard, phoneNumber, email, type));
        }
    }

    @Override
    public void edit() {
        System.out.println("Nhập id muốn sửa: ");
        int id = Integer.parseInt(scanner.nextLine());
        boolean check = true;
        for (int i = 0; i <customerList.size() ; i++) {
            if (id == customerList.get(i).getId()) {

                System.out.println("Nhập tên muốn sửa: ");
                customerList.get(i).setName(scanner.nextLine());

                System.out.println("Nhập tuổi muốn sửa: ");
                customerList.get(i).setDateOfBirth(scanner.nextLine());

                System.out.println("Nhập địa chỉ muốn sửa: ");
                customerList.get(i).setAddress(scanner.nextLine());

                System.out.println("Nhập giới tính muốn sửa: ");
                customerList.get(i).setGender(scanner.nextLine());

                System.out.println("Nhập CMND muốn sửa: ");
                customerList.get(i).setIdCard(scanner.nextLine());

                System.out.println("Nhập SDT muốn sửa: ");
                customerList.get(i).setPhoneNumber(scanner.nextLine());

                System.out.println("Nhập Email muốn sửa: ");
                customerList.get(i).setEmail(scanner.nextLine());

                System.out.println("[Diamond" + "," + " Platinium" + "," + " Gold" + "," + " Silver" + "," + " Member]");
                System.out.println("Nhập loại khách muốn sửa: ");
                customerList.get(i).setType(scanner.nextLine());

                System.out.println("Đã sửa thành công ^^");
                check= false;
                break;
            }
        }if (check){
            System.out.println("Nhập lại đi...Id không có trong danh sách!!!");
        }
            }



    @Override
    public Object isExisted(int id) {
        for (Customer item:customerList) {
          if (item.getId()== id)
          return item;
          }
          return null;
    }
}

