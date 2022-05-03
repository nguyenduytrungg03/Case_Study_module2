package services.impl;

import models.facility.Facility;
import models.facility.House;
import models.facility.Room;
import models.facility.Villa;
import services.FacilityService;
import utils.regex.RegexFacility;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FacilityServiceImpl implements FacilityService {
    private static Map<Facility, Integer> facilityIntegerMap = new LinkedHashMap<>();
    private static Scanner scanner = new Scanner(System.in);

    //villa
    /*
    * them villa se them vao villaFile, them vao facilityFile;
    * facilityFile SVVL-1234,0;
    * booking SVVL-1234,1;
    * contract SVVL-1234,1,true;
    * */

    static {
        Villa villa = new Villa("SVVL-0001","Villa",30,1200000,3,"Vip","Phòng 3s",30,3);
        facilityIntegerMap.put(villa,1);
        House house = new House("SVHO-0001","House",30,200000,2,"Norman","Phòng ổn định",1);
        facilityIntegerMap.put(house,3);
        Room room = new Room("SVRO-0001","Room",30,100000,1,"Phòng ok","Nước ngọt");
        facilityIntegerMap.put(room,2);
    }


    @Override
    public void display() {

        for (Map.Entry<Facility, Integer> element : facilityIntegerMap.entrySet()) {
            System.out.println("Service " + element.getKey() + "Số lần thuê: " + element.getValue());
        }
    }

    @Override
    public void displayMaintain() {

    }

    @Override
    public void addNewVilla() {
        String idFacility = RegexFacility.inputIdVilla();

        String nameServices =  RegexFacility.inputName();

        double usableArea = Double.parseDouble( RegexFacility.inputArea());

        int rentalCosts = Integer.parseInt( RegexFacility.inputCosts());

        int maximumPeople = Integer.parseInt( RegexFacility.inputMaximumPeople());

        String rentalType =  RegexFacility.inputRentalType();

        String standardVilla =  RegexFacility.inputStandardVilla();

        double areaPool = Double.parseDouble( RegexFacility.inputAreaPool());

        int floor = Integer.parseInt( RegexFacility.inputFloor());

        Villa villa = new Villa(idFacility, nameServices, usableArea, rentalCosts, maximumPeople, rentalType, standardVilla, areaPool, floor);
        facilityIntegerMap.put(villa, 0);
        System.out.println("Thêm thành công ^^");
    }



    @Override
    public void addNewHouse() {

        String idFacility =  RegexFacility.inputIdHouse();

        String nameServices =  RegexFacility.inputName();

        double usableArea = Double.parseDouble( RegexFacility.inputArea());

        int rentalCosts = Integer.parseInt( RegexFacility.inputCosts());

        int maximumPeople = Integer.parseInt( RegexFacility.inputMaximumPeople());

        String rentalType =  RegexFacility.inputRentalType();

        String standardRoom =  RegexFacility.inputStandardVilla();

        int floor = Integer.parseInt( RegexFacility.inputFloor());

        House house = new House(idFacility, nameServices, usableArea, rentalCosts, maximumPeople, rentalType, standardRoom, floor);
        facilityIntegerMap.put(house, 0);
        System.out.println("Thêm thành công ^^");
    }

    @Override
    public void addNewRoom() {

        String idFacility =  RegexFacility.inputRoom();


        String nameServices =  RegexFacility.inputName();


        double usableArea = Double.parseDouble( RegexFacility.inputArea());


        int rentalCosts = Integer.parseInt( RegexFacility.inputCosts());


        int maximumPeople = Integer.parseInt( RegexFacility.inputMaximumPeople());


        String rentalType =  RegexFacility.inputRentalType();

        System.out.println("Nhập dịch vụ miễn phí: ");
        String freeService = scanner.nextLine();

        Room room = new Room(idFacility, nameServices, usableArea, rentalCosts, maximumPeople, rentalType, freeService);
        facilityIntegerMap.put(room, 0);
        System.out.println("Thêm thành công ^^");



    }

}
