package utils;

import models.person.Customer;
import models.person.Employee;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWrite {
    public static List<String[]> readFile(String path) {
        File file = new File(path);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        List<String[]> myList = new ArrayList<>();
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line = "";
            while ((line = bufferedReader.readLine()) != null && !line.equals("")) {
                String[] arrStr = line.split(",");
                myList.add(arrStr);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return myList;
    }

    public static void writerFile(String path, String line){
        File  file = new File(path);
       try(FileWriter fileWriter = new FileWriter(file,true);
       BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)){
            bufferedWriter.write(line);
            bufferedWriter.newLine();
       } catch (IOException e) {
           e.printStackTrace();
       }
    }

    public static void reWriteToFileEmployee(List<Employee> employeeList, String path){
        List<Employee> list = employeeList;  //trung vs hao
        try {
            File file = new File(path);
            file.delete();
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
            for (Employee lists: list){
                bufferedWriter.write(lists.writeToFile());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public static void reWriteToFileCustomer(List<Customer> customerList, String path){
        List<Customer> list = customerList;  //trung vs hao
        try {
            File file = new File(path);
            file.delete();
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
            for (Customer lists: list){
                bufferedWriter.write(lists.writeToFile());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
